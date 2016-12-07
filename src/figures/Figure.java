package figures;

import javafx.scene.Group;
import javafx.scene.shape.Line;

import java.util.ArrayList;
import java.util.List;


public class Figure{
    protected Group group;
    protected int posX ;
    protected int posY ;
    private int a;
    private int b;
    private int c;
    protected List<Point> points=new ArrayList<>();
    private List<Point> circlePoints=new ArrayList<>();
    protected List<Line> lines=new ArrayList<>();

    public static final int START_CIRCLE =-105;
    public static final int END_CIRCLE=466;
    public Figure( Group group,int posX, int posY){
        this.group = group;
        this.posX = posX;
        this.posY = posY;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public void setPosX(int posX) {
        this.posX += posX;
    }

    public void setPosY(int posY) {
        this.posY += posY;
    }

    public Group getGroup() {
        return group;
    }

    public void buildFigure(){
        points.add(new Point(-a,0));//0
        points.add(new Point(a,0));//1
        points.add(new Point(2*a,0.5*b));//2
        points.add(new Point(-a*2,0.5*b));//3
        points.add(new Point(-a*2,2*b));//4
        points.add(new Point(a*2,2*b));//5
        points.add(new Point(-a,2*b));//6
        points.add(new Point(a,2*b));//7
        points.add(new Point(-a,c));//8
        points.add(new Point(a,c));//9
        points.add(new Point(-2*a,c));//10
        points.add(new Point(2*a,c));//11
        points.add(new Point(-2*a,c+1.5*b));//12
        points.add(new Point(2*a,c+1.5*b));//13
        points.add(new Point(-a,c+2*b));//14
        points.add(new Point(a,c+2*b));//15

        points.add(new Point(-0.3*a,c*1.1));//16
        points.add(new Point(0.3*a,c*1.1));//17
        points.add(new Point(-0.3*a,3*b));//18
        points.add(new Point(0.3*a,3*b));//19

        circlePoints.add(new Point(0.3*a,3*b));
        for(int i=START_CIRCLE;i<END_CIRCLE;i++){
            circlePoints.add(new Point(Math.cos(Math.PI/360*i)*a/2, 2*b+Math.sin(Math.PI/360*i)*a/2));
        }
    }

    public void drawFigure(){
        lines.clear();
        lines.add(new Line(posX + points.get(0).x, posY + points.get(0).y, posX + points.get(1).x, posY + points.get(1).y));
        lines.add(new Line(posX + points.get(1).x, posY + points.get(1).y, posX + points.get(2).x, posY + points.get(2).y));
        lines.add(new Line(posX + points.get(0).x, posY + points.get(0).y, posX + points.get(3).x, posY + points.get(3).y));
        lines.add(new Line(posX + points.get(3).x, posY + points.get(3).y, posX + points.get(4).x, posY + points.get(4).y));
        lines.add(new Line(posX + points.get(2).x, posY + points.get(2).y, posX + points.get(5).x, posY + points.get(5).y));
        lines.add(new Line(posX + points.get(4).x, posY + points.get(4).y, posX + points.get(6).x, posY + points.get(6).y));
        lines.add(new Line(posX + points.get(5).x, posY + points.get(5).y, posX + points.get(7).x, posY + points.get(7).y));
        lines.add(new Line(posX + points.get(6).x, posY + points.get(6).y, posX + points.get(8).x, posY + points.get(8).y));
        lines.add(new Line(posX + points.get(7).x, posY + points.get(7).y, posX + points.get(9).x, posY + points.get(9).y));
        lines.add(new Line(posX + points.get(8).x, posY + points.get(8).y, posX + points.get(10).x, posY + points.get(10).y));
        lines.add(new Line(posX + points.get(9).x, posY + points.get(9).y, posX + points.get(11).x, posY + points.get(11).y));
        lines.add(new Line(posX + points.get(10).x, posY + points.get(10).y, posX + points.get(12).x, posY + points.get(12).y));
        lines.add(new Line(posX + points.get(11).x, posY + points.get(11).y, posX + points.get(13).x, posY + points.get(13).y));
        lines.add(new Line(posX + points.get(12).x, posY + points.get(12).y, posX + points.get(14).x, posY + points.get(14).y));
        lines.add(new Line(posX + points.get(13).x, posY + points.get(13).y, posX + points.get(15).x, posY + points.get(15).y));
        lines.add(new Line(posX + points.get(14).x, posY + points.get(14).y, posX + points.get(15).x, posY + points.get(15).y));

        lines.add(new Line(posX + points.get(16).x, posY + points.get(16).y, posX + points.get(17).x, posY + points.get(17).y));
        lines.add(new Line(posX + points.get(16).x, posY + points.get(16).y, posX + points.get(18).x, posY + points.get(18).y));
        lines.add(new Line(posX + points.get(17).x, posY + points.get(17).y, posX + points.get(19).x, posY + points.get(19).y));

        for(int i=START_CIRCLE, j=0;i<END_CIRCLE-1;i++,j++){
            lines.add(new Line(posX + circlePoints.get(j).x, posY + circlePoints.get(j).y,
                    posX + circlePoints.get(j+1).x, posY + circlePoints.get(j+1).y));
        }
        lines.add(new Line(posX + circlePoints.get(circlePoints.size()-1).x, posY + circlePoints.get(circlePoints.size()-1).y,
                posX + points.get(18).x, posY + points.get(18).y));
        group.getChildren().addAll(lines);
    }

    public void turnFigure(double angle){
        for(Point point:points){
            point.turning(angle);
        }
        for (Point circlePoint:circlePoints){
            circlePoint.turning(angle);
        }
    }

    public void shiftFigure(int shiftX,int shiftY){
        for(Point point:points){
            point.shifting(shiftX,shiftY);
        }
        for (Point circlePoint:circlePoints){
            circlePoint.shifting(shiftX,shiftY);
        }
    }

    public void affineFigure(double x0,double y0,double xx,double xy,double yx, double yy){
        for(Point point:points){
            point.affine(x0,y0,xx,xy,yx,yy);
        }
        for (Point circlePoint:circlePoints){
            circlePoint.affine(x0,y0,xx,xy,yx,yy);
        }
    }

    public void proectiveFigure(double x0,double y0,double xx,double xy,double yx, double yy,double w0,double w1,
                          double w2){
        for(Point point:points){
            point.proective(x0,y0,xx,xy,yx,yy,w0,w1,w2);
        }
        for (Point circlePoint:circlePoints){
            circlePoint.proective(x0,y0,xx,xy,yx,yy,w0,w1,w2);
        }
    }


}
