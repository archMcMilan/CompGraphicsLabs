package d3;

/**
 * Created by Artem on 27.12.16.
 */
public class Point3D {
    private double x;
    private double y;
    private double z;

    public Point3D(double x, double y) {
        this.x = x;
        this.y = y;
        this.z = 0;
    }

    public Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
}
