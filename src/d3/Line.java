package d3;

import javafx.scene.shape.Shape;

/**
 * Created by Artem on 27.12.16.
 */
public class Line extends Shape {
    private Point3D point1;
    private Point3D point2;

    public Line(Point3D point1, Point3D point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public Point3D getPoint1() {
        return point1;
    }

    public void setPoint1(Point3D point1) {
        this.point1 = point1;
    }

    public Point3D getPoint2() {
        return point2;
    }

    public void setPoint2(Point3D point2) {
        this.point2 = point2;
    }

    @Override
    public com.sun.javafx.geom.Shape impl_configShape() {
        return null;
    }
}
