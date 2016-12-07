package figures;

/**
 * Created by Artem on 06.11.16.
 */
public class Point{
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void turning(double angle){
        double tempX=x*Math.cos(Math.toRadians(angle))-y*Math.sin(Math.toRadians(angle));
        double tempY=x*Math.sin(Math.toRadians(angle))+y*Math.cos(Math.toRadians(angle));
        x=tempX;
        y=tempY;
    }
    public void shifting(int shiftX,int shiftY){
        x+=shiftX;
        y+=shiftY;
    }

    public void affine(double x0,double y0,double xx,double xy,double yx, double yy){
        double tempX=x0+xx*x+xy*y;
        double tempY=y0+yx*x+yy*y;
        x=tempX;
        y=tempY;
        //x=x/Math.sqrt(Math.pow((xx-x0),2)+Math.pow((yx-y0),2));
        //y=y/Math.sqrt(Math.pow((xy-x0),2)+Math.pow((yy-y0),2));
    }

    public void proective(double x0,double y0,double xx,double xy,double yx, double yy,double w0,double w1,
                          double w2){
        Double w = x * w1 + y * w2 + w0;
        double tempX=(x0*w0+xx*x*w1+xy*y*w2)/w;
        double tempY=(y0*w0+yx*x*w1+yy*y*w2)/w;
        x=tempX;
        y=tempY;
    }

}