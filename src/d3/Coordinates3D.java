package d3;

import javafx.scene.Group;

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
        lines.add(new Line(new Point3D(center.getX(),0),new Point3D(center.getX(),2*center.getY())));
        lines.add(new Line(new Point3D(0,center.getY()),new Point3D(2*center.getX(),2*center.getY())));
        group.getChildren().addAll(lines);
    }

    // lines.add(new Line(center.getX(),0,center.getX(),2*center.getY()));
    //    lines.add(new Line(0,center.getY(),2*center.getX(),2*center.getY()));
}
