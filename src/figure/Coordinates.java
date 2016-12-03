package figure;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

public class Coordinates {
    private int width;
    private int height;
    private Group group;

    public Coordinates(int width,int height,  Group group){
        this.width = width;
        this.height = height;
        this.group = group;
    }


    public void drawAxis(){
        Line line1 = new Line(0, height, 2*width,height);
        Line line2 = new Line(width,0,width ,2*height);
        line1.setStroke(Color.GRAY);
        line2.setStroke(Color.GRAY);
        group.getChildren().addAll(line1);
        group.getChildren().addAll(line2);
    }

    public void drawGrid(){
        for (int i = height+1; i >= 0; i-= 10){
            initHorizontalLines(i, width);
        }
        for(int i=width+1;i>=0;i-=10){
            initVerticalLines(i, height);
        }
        for (int i = height+1; i <= 2*height; i+= 10){
            initHorizontalLines(i, width);
        }
        for(int i=width+1;i<=width*3;i+=10){
            initVerticalLines(i, height);
        }
    }

    private void initHorizontalLines(int i, int width) {
        Line line1 = new Line(0, i, width, i);
        Line line2 = new Line(width, i, 3*width, i);
        line1.setStroke(Color.LIGHTGRAY);
        line2.setStroke(Color.LIGHTGRAY);
        group.getChildren().addAll(line1,line2);
    }

    private void initVerticalLines(int i, int height) {
        Line line1 = new Line(i, height, i, 0);
        Line line2 = new Line(i, height, i, 2*height);
        line1.setStroke(Color.LIGHTGRAY);
        line2.setStroke(Color.LIGHTGRAY);
        group.getChildren().addAll(line1,line2);
    }

    public void affine(double x0, double y0, double xx, double xy, double yx, double yy){
        Line line1 = new Line(0,height/yx-y0, 2*width,height*yx+y0);
        Line line2 = new Line(width/xy-x0,0,width*xy+x0 ,2*height);
        line1.setStroke(Color.GRAY);
        line2.setStroke(Color.GRAY);
        group.getChildren().addAll(line1);
        group.getChildren().addAll(line2);
    }

    public void newCenter(double x, double y){
        Circle circle=new Circle();
        circle.setCenterX(x);
        circle.setCenterY(y);
        circle.setRadius(2.0);
        circle.setStroke(Color.GREEN);


        group.getChildren().addAll(circle);
    }

}