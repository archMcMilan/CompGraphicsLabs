package figures;

import javafx.scene.Group;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

import java.util.ArrayList;
import java.util.List;

public class Fractal {
    private int posX;
    private int posY;
    private Group group;
    private List<Point> points;
    private List<Point> newPoints;
    private double length;
    private int iterationsAmount;

    public Fractal(Group group,int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
        this.group = group;
        points=new ArrayList<>();
        newPoints=new ArrayList<>();
    }

    public void setStartValues(int length){
        points.add(new Point(posX-length/2,posY));
        points.add(new Point(posX+length/2,posY));
        //points.add(new Point(posX+length/2,posY));
        points.add(new Point(posX,posY-length*Math.sin(Math.toRadians(60))));
        //points.add(new Point(posX,posY-length));
        points.add(new Point(posX-length/2,posY));
        this.length=length;
    }

    public void buildAngle(int index,int angle,double length){
        double xDiff=points.get(index+1).getX()-points.get(index).getX();
        double yDiff=points.get(index+1).getY()-points.get(index).getY();

        Point first=new Point(points.get(index).getX()+xDiff*1.0/3,points.get(index).getY()+yDiff*1.0/3);
        Point second=new Point(points.get(index).getX()+xDiff*2.0/3,points.get(index).getY()+yDiff*2.0/3);

        Point middle=new Point(first.getX()+length*Math.cos(Math.toRadians(angle)) /* * Math.cos(Math.toRadians(angle))*/,
                first.getY()+length*Math.sin(Math.toRadians(angle))/* * Math.cos(Math.toRadians(angle))*/);


        newPoints.add(points.get(index));
        newPoints.add(first);
        newPoints.add(middle);
        newPoints.add(second);
    }

    public void buildFractal(int iterations){
        iterationsAmount=iterations;
        List<Line> lines=new ArrayList<>();
        List<Circle> circles=new ArrayList<>();

        for(int iter=0;iter<iterations;iter++){
            length/=3;
            for(int i=0;i<points.size()-1;i++){
                buildAngle(i,angleRules(points.get(i),points.get(i+1)),length);
            }
            newPoints.add(points.get(points.size()-1));
            points=newPoints;
            newPoints=new ArrayList<>();

        }

        for(int i=1;i<points.size();i++){
            lines.add(new Line(points.get(i-1).getX(),points.get(i-1).getY()+150,
                    points.get(i).getX(),points.get(i).getY()+150));
            //circles.add(new Circle(points.get(i-1).getX(),points.get(i-1).getY(),5));
        }
        //circles.add(new Circle(points.get(points.size()-1).getX(),points.get(points.size()-1).getY(),5));
        group.getChildren().addAll(lines);
        group.getChildren().addAll(circles);
    }


    private int angleRules(Point first,Point second){
        double xDiff=second.getX()-first.getX();
        double yDiff=second.getY()-first.getY();

        if(xDiff>0 && yDiff<0.01 && yDiff>-0.01)
            return 60;
        if(xDiff>0 && yDiff>0)
            return 120;
        if(xDiff>0 && yDiff<0)
            return 0;
        if(xDiff<0 && yDiff<0.01 && yDiff>-0.01)
            return 240;
        if(xDiff<0 && yDiff>0)
            return 180;
        if(xDiff<0 && yDiff<0)
            return 300;

        return 60;



    }
}
