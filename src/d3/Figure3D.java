package d3;

import javafx.scene.Group;
import javafx.scene.shape.Line;

import java.util.ArrayList;
import java.util.List;

public class Figure3D {
    private Group top;
    private Group middle;
    private Group bottom;
    private int posX;
    private int posY;
    private double degreeValue;
    private int flagAxis=0;


    public Figure3D(Group top,Group middle,Group bottom, int posX, int posY) {
        this.top = top;
        this.posX=posX;
        this.posY=posY;
        this.middle=middle;
        this.bottom=bottom;
    }

    public void initFigure(){
        part(new Point3D(60, 10, 0), new Point3D(60, 10, -50), new Point3D(10, 10, -50), new Point3D(10, 10, 0),new Point3D(60, 10, 0));
        part(new Point3D(60,80,0), new Point3D(60,80,-50), new Point3D(10,80,-50), new Point3D(10,80,0),new Point3D(60,80,0));
        part(new Point3D(10,10,0), new Point3D(10,80,0));
        part(new Point3D(10,10,-50), new Point3D(10,80,-50));
        part(new Point3D(60,10,0), new Point3D(60,80,0));
        part(new Point3D(60,10,-50), new Point3D(60,80,-50));

        part(new Point3D(70, 80, 10),new Point3D(80, 80, -25),  new Point3D(70, 80, -60),new Point3D(35, 80, -70),
                new Point3D(0, 80, -60),new Point3D(-10, 80, -25), new Point3D(0, 80, 10),new Point3D(35, 80, 20),
                    new Point3D(70, 80, 10));
        part(new Point3D(70, 100, 10),new Point3D(80, 100, -25),  new Point3D(70, 100, -60),new Point3D(35, 100, -70),
                new Point3D(0, 100, -60),new Point3D(-10, 100, -25), new Point3D(0, 100, 10),new Point3D(35, 100, 20),
                new Point3D(70, 100, 10));
        part(new Point3D(0,80,10), new Point3D(0,100,10));
        part(new Point3D(0,80,-60), new Point3D(0,100,-60));
        part(new Point3D(70,80,10), new Point3D(70,100,10));
        part(new Point3D(70,80,-60), new Point3D(70,100,-60));

        part(new Point3D(80,80,-25), new Point3D(80,100,-25));
        part(new Point3D(35,80,-70), new Point3D(35,100,-70));
        part(new Point3D(-10,80,-25), new Point3D(-10,100,-25));
        part(new Point3D(35,80,20), new Point3D(35,100,20));
    }

    private void part(Point3D... points) {
        List<Point3D> point3Ds=new ArrayList<>();
        for(Point3D point:points){
            if(flagAxis==1){
                double[][] result=Utils.multiply(new double[][]{{ point.getX(), point.getY(), point.getZ(), 1}},Utils.rotateMatrixFactory("X",degreeValue));
                point.setX(result[0][0]);
                point.setX(result[0][1]);
                point.setX(result[0][2]);
            }else if(flagAxis==2){
                double[][] result=Utils.multiply(new double[][]{{ point.getX(), point.getY(), point.getZ(), 1}},Utils.rotateMatrixFactory("Y",degreeValue));
                point.setX(result[0][0]);
                point.setX(result[0][1]);
                point.setX(result[0][2]);
            }else if(flagAxis==3){
                double[][] result=Utils.multiply(new double[][]{{ point.getX(), point.getY(), point.getZ(), 1}},Utils.rotateMatrixFactory("Z",degreeValue));
                point.setX(result[0][0]);
                point.setX(result[0][1]);
                point.setX(result[0][2]);
            }
            point3Ds.add(point);
        }
        buildFigureX(point3Ds);
        buildFigureY(point3Ds);
        buildFigureZ(point3Ds);
    }

    public void buildFigureX(List<Point3D> point3Ds){
        List<Line> lines=new ArrayList<>();
        for(int i=1;i<point3Ds.size();i++){
            lines.add(new Line(point3Ds.get(i).getX()+posX,point3Ds.get(i).getY()+posY,
                point3Ds.get(i-1).getX()+posX,point3Ds.get(i-1).getY()+posY));
        }
        top.getChildren().addAll(lines);

    }

    public void buildFigureY(List<Point3D> point3Ds){
        List<Line> lines=new ArrayList<>();
        for(int i=1;i<point3Ds.size();i++){
            lines.add(new Line(point3Ds.get(i).getX()+posX,point3Ds.get(i).getZ()+posY,
                    point3Ds.get(i-1).getX()+posX,point3Ds.get(i-1).getZ()+posY));
        }
        middle.getChildren().addAll(lines);
    }

    public void buildFigureZ(List<Point3D> point3Ds){
        List<Line> lines=new ArrayList<>();
        for(int i=1;i<point3Ds.size();i++){
            lines.add(new Line(point3Ds.get(i).getZ()+posX,point3Ds.get(i).getY()+posY,
                    point3Ds.get(i-1).getZ()+posX,point3Ds.get(i-1).getY()+posY));
        }
        bottom.getChildren().addAll(lines);
    }

    public void rotateX(double degreeValue){
        this.degreeValue=degreeValue;
        flagAxis=1;
        initFigure();

    }
    public void rotateY(double degreeValue){
        this.degreeValue=degreeValue;
        flagAxis=2;
        initFigure();

    }
    public void rotateZ(double degreeValue){
        this.degreeValue=degreeValue;
        flagAxis=3;
        initFigure();

    }


}
