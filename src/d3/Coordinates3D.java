package d3;

import javafx.scene.Group;
import javafx.scene.shape.Line;

import java.util.ArrayList;
import java.util.List;

public class Coordinates3D {
    private Point3D center;
    private Point3D oX;
    private Point3D oY;
    private Point3D oZ;
    private List<Line> lines;
    private Group group;

    public Coordinates3D(Group group, int width, int height) {
        this.group = group;
        center=new Point3D(width,height);
        lines=new ArrayList<>();
    }

    public void drawAxis(){
        lines.add(new Line(center.getX(),center.getY(),center.getX(),0));
        lines.add(new Line(center.getX(),center.getY(),2*center.getX(),center.getY()));
        lines.add(new Line(center.getX(),center.getY(),0,2*center.getY()));
        group.getChildren().addAll(lines);
    }


}
