package sample;

import javafx.scene.Group;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

import java.util.ArrayList;
import java.util.List;

public class Rose extends Figure {

    private int a;
    private double k;
    private String function;
    private int functionFlag = 1;//1- sin, 2- cos
    private double size;

    @Override
    public void setA(int a) {
        this.a = a;
    }

    public void setK(double k) {
        this.k = k;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    @Override
    public void setGroup(Group group) {
        super.group = group;
    }

    public double getSize() {
        return size;
    }

    public Rose(Group group, int posX, int posY) {
        super(group, posX, posY);
    }

    @Override
    public void buildFigure() {
        points.add(new Point(0, 0));
        List<Circle> breakPoints=new ArrayList<>();
        for (int i = 0; i <= 720; i++) {
            double cosPhi = Math.cos(3.14 / 360 * i);
            double sinPhi = Math.sin(3.14 / 360 * i);
            points.add(new Point((a * function(i)) * cosPhi, (a * function(i)) * sinPhi));
        }
        group.getChildren().addAll(breakPoints);
    }

    @Override
    public void drawFigure() {
        lines.clear();
        size=0.0;
        for (int i = 1; i < 720; i++) {
            Line line=new Line(posX + points.get(i).x, posY + points.get(i).y,
                    posX + points.get(i + 1).x, posY + points.get(i + 1).y);
            size+=Math.pow((points.get(i+1).x-points.get(i).x),2)+Math.pow((points.get(i+1).y-points.get(i).y),2);
            lines.add(line);

        }
        group.getChildren().addAll(lines);

    }

    private double function(int i) {
        if (function.equals("sin")) {
            return Math.sin(Math.PI / 360 * i * k);
        } else if (function.equals("cos")) {
            functionFlag = 2;
            return Math.cos(Math.PI / 360 * i * k);
        }
        return Math.sin(Math.PI / 360 * i * k);
    }

    public Point pointOnRose(double x, double y) {
        for (Point point : points) {
            if (point.x - 3 <= x && point.x + 3 >= x) {
                if (point.y - 3 <= y && point.y + 3 >= y) {
                    return point;
                }
            }
        }
        return null;
    }

        public double tangent(Point point) {
        if (functionFlag == 1) {
            System.out.println(point.x+" "+point.y);

            double yTangentInPoint=a*k*Math.cos(Math.PI / 180 * point.x * k);//y'(point.x);
            //System.out.println(Math.cos(Math.PI / 180 * point.x * k));
            //System.out.println(yTangentInPoint);

            double cosPhi = Math.cos(3.14 / 360 * (point.x+1));
            double sinPhi = Math.sin(3.14 / 360 * (point.x+1));
            System.out.println("cos and sin="+cosPhi+" "+sinPhi);
            Point tempPoint=new Point((a * function((int) (point.x+1))) * cosPhi,
                    (a * function((int) (point.x+1))) * sinPhi);
            System.out.println("new x and y="+tempPoint.x+" "+tempPoint.y+" "+(a * function((int) (point.x+1)))+" "+
                    (a * function((int) (point.x+1))));
            //group.getChildren().addAll(new Line(0,-10569,270, 376));
            //group.getChildren().addAll(new Line(point.x+250,point.y+346,point.x+250.5,346+point.y+yTangentInPoint*0.5));
            //group.getChildren().addAll(new Line(point.x+250,point.y+346,tempPoint.x+250,tempPoint.y+346));
        }
        return 0.0;
    }
    public void drawTangent(Point point) {
        if (functionFlag == 1) {
            System.out.println(point.x + " " + point.y);

            Point findPoint=null;
            for(int coef=3;coef<7;coef++){
                for(Point curPoint:points){
                    if(curPoint!=point){
                        if((curPoint.x-point.x)<coef && (curPoint.x-point.x)>0){
                            if((curPoint.y-point.y)<coef &&(curPoint.y-point.y)>0){

                                findPoint=curPoint;
                                //System.out.println("POINT="+findPoint.x+" "+findPoint.y);
                            }
                        }
                    }
                }
            }
            if(findPoint!=null){
                drawTangentLine(point, findPoint);
            }else{
                for(int coef=-3;coef>-7;coef--){
                    for(Point curPoint:points){
                        if(curPoint!=point){
                            if((curPoint.x-point.x)<0 && (curPoint.x-point.x)>coef){
                                if((curPoint.y-point.y)<0 &&(curPoint.y-point.y)>coef){

                                    findPoint=curPoint;
                                    //System.out.println("POINT="+findPoint.x+" "+findPoint.y);
                                }
                            }
                        }
                    }
                }
                if(findPoint!=null){
                    drawTangentLine(point, findPoint);
                }else{
                    for(int coef=3;coef<7;coef++){
                        for(Point curPoint:points){
                            if(curPoint!=point){
                                if((curPoint.x-point.x)<coef && (curPoint.x-point.x)>0){
                                    if((curPoint.y-point.y)>-coef &&(curPoint.y-point.y)<0){

                                        findPoint=curPoint;
                                        //System.out.println("POINT="+findPoint.x+" "+findPoint.y);
                                    }
                                }
                            }
                        }
                    }
                    if(findPoint!=null){
                        drawTangentLine(point, findPoint);
                    }else{
                        for(int coef=3;coef<7;coef++){
                            for(Point curPoint:points){
                                if(curPoint!=point){
                                    if((curPoint.x-point.x)>-coef && (curPoint.x-point.x)<0){
                                        if((curPoint.y-point.y)<coef &&(curPoint.y-point.y)>0){

                                            findPoint=curPoint;
                                            //System.out.println("POINT="+findPoint.x+" "+findPoint.y);
                                        }
                                    }
                                }
                            }
                        }
                        if(findPoint!=null){
                            drawTangentLine(point, findPoint);
                        }
                    }
                }


            }



        }
    }

    private void drawTangentLine(Point point, Point findPoint) {
        double deltaY=(point.y-findPoint.y);
        double deltaX=(point.x-findPoint.x);
        int coef=8000;
//        int posX=250;
//        int posY=346;
        group.getChildren().addAll(new Line(point.x+ posX, point.y + posY, findPoint.x+deltaX*coef+posX ,findPoint.y+deltaY*coef+posY));
        group.getChildren().addAll(new Line(point.x+ posX, point.y + posY, findPoint.x-deltaX*coef+posX ,findPoint.y-deltaY*coef+posY));
        group.getChildren().addAll(new Line(point.x+ posX, point.y + posY, findPoint.x+deltaY*coef+posX ,findPoint.y-deltaX*coef+posY));
        group.getChildren().addAll(new Line(point.x+ posX, point.y + posY, findPoint.x-deltaY*coef+posX,findPoint.y+deltaX*coef+posY));
    }
}
