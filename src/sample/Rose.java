package sample;

import javafx.scene.Group;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

import java.util.ArrayList;
import java.util.List;

public class Rose extends Figure{

    int a;
    double k;
    String function;

    public void setGroup(Group group) {
        super.group=group;
    }

    public Rose(Group group, int posX, int posY) {
        super(group,posX,posY);
    }

    @Override
    public void buildFigure(){
        points.add(new Point(0,0));
        for(int i=0;i<=720;i++){
            double cosPhi=Math.cos(3.14/360*i);
            double sinPhi=Math.sin(3.14/360*i);
            points.add(new Point((a*function(i))*cosPhi , (a*function(i))*sinPhi));
        }
    }

    @Override
    public void drawFigure() {
        lines.clear();
        List<Circle> breakPoints=new ArrayList<>();
        for(int i=0;i<720;i++) {
            lines.add(new Line(posX + points.get(i).x, posY + points.get(i).y,
                    posX + points.get(i + 1).x, posY + points.get(i + 1).y));
            if (i % 8 == 0) {
                Circle temp=new Circle(posX + points.get(i).x, posY + points.get(i).y, 2);
                breakPoints.add(new Circle(posX + points.get(i).x, posY + points.get(i).y, 2));

            }
        }
        group.getChildren().addAll(lines);
        group.getChildren().addAll(breakPoints);
    }

    private double function(int i){
        if(function.equals("sin")){
            return Math.sin(3.14/360*i*k);
        }else if(function.equals("cos")){
            return Math.cos(3.14/360*i*k);
        }
        return Math.sin(3.14/360*i*k);
    }

}
