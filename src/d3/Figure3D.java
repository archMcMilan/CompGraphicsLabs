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
    private List<Point3D> points=new ArrayList<>();


    public Figure3D(Group top,Group middle,Group bottom, int posX, int posY) {
        this.top = top;
        this.middle=middle;
        this.bottom=bottom;
        this.posX=posX;
        this.posY=posY;
        initPoints();
    }

    public void setTop(Group top) {
        this.top = top;
    }

    public void setMiddle(Group middle) {
        this.middle = middle;
    }

    public void setBottom(Group bottom) {
        this.bottom = bottom;
    }

    private void initPoints(){
        points.add(new Point3D(25, -70, 25));
        points.add(new Point3D(25, -70, -25));
        points.add(new Point3D(-25, -70, -25));
        points.add(new Point3D(-25, -70, 25));
        points.add(new Point3D(25, -70, 25));

        points.add(new Point3D(25,0,25));
        points.add(new Point3D(25,0,-25));
        points.add(new Point3D(-25,0,-25));
        points.add(new Point3D(-25,0,25));
        points.add(new Point3D(25,0,25));

        points.add(new Point3D(-25,-70,25));
        points.add(new Point3D(-25,0,25));
        points.add(new Point3D(-25,-70,-25));
        points.add(new Point3D(-25,0,-25));
        points.add(new Point3D(25,-70,25));
        points.add(new Point3D(25,0,25));
        points.add(new Point3D(25,-70,-25));
        points.add(new Point3D(25,0,-25));

        points.add(new Point3D(35, 0, 35));
        points.add(new Point3D(45, 0, 0));
        points.add(new Point3D(35, 0, -35));
        points.add(new Point3D(0, 0, -45));
        points.add(new Point3D(-35, 0, -35));
        points.add(new Point3D(-45, 0, 0));
        points.add(new Point3D(-35, 0, 35));
        points.add(new Point3D(0, 0, 45));
        points.add(new Point3D(35, 0, 35));

        points.add(new Point3D(35, 20, 35));
        points.add(new Point3D(45, 20, 0));
        points.add(new Point3D(35, 20, -35));
        points.add(new Point3D(0, 20, -45));
        points.add(new Point3D(-35, 20, -35));
        points.add(new Point3D(-45, 20, 0));
        points.add(new Point3D(-35, 20, 35));
        points.add(new Point3D(0, 20, 45));
        points.add(new Point3D(35, 20, 35));

        points.add(new Point3D(35, 0, 35));
        points.add(new Point3D(35, 20, 35));
        points.add(new Point3D(35, 0, -35));
        points.add(new Point3D(35, 20, -35));

        points.add(new Point3D(-35, 0, -35));
        points.add(new Point3D(-35, 20, -35));
        points.add(new Point3D(-35, 0, 35));
        points.add(new Point3D(-35, 20, 35));

        points.add(new Point3D(45, 0, 0));
        points.add(new Point3D(45, 20, 0));
        points.add(new Point3D(0, 0, -45));
        points.add(new Point3D(0, 20, -45));

        points.add(new Point3D(-45, 0, 0));
        points.add(new Point3D(-45, 20, 0));
        points.add(new Point3D(0, 0, 45));
        points.add(new Point3D(0, 20, 45));
    }

    public void initFigure(){
        part(0,points.get(0), points.get(1),points.get(2),points.get(3),points.get(4));
        part(5,points.get(5), points.get(6),points.get(7),points.get(8),points.get(9));
        part(10,points.get(10), points.get(11));
        part(12,points.get(12), points.get(13));
        part(14,points.get(14), points.get(15));
        part(16,points.get(16), points.get(17));

        part(18,points.get(18),points.get(19),
                points.get(20),points.get(21),
                points.get(22),points.get(23),
                points.get(24), points.get(25),
                points.get(26));

        part(27,points.get(27),points.get(28),
                points.get(29),points.get(30),
                points.get(31),points.get(32),
                points.get(33), points.get(34),
                points.get(35));

        part(36,points.get(36), points.get(37));
        part(38,points.get(38), points.get(39));
        part(40,points.get(40), points.get(41));
        part(42,points.get(42), points.get(43));

        part(44,points.get(44), points.get(45));
        part(46,points.get(46), points.get(47));
        part(48,points.get(48), points.get(49));
        part(50,points.get(50), points.get(51));

    }

    private void part(int index,Point3D... points) {
        List<Point3D> point3Ds=new ArrayList<>();
        for(Point3D point:points){
            if(flagAxis==1){
                double[][] result=Utils.multiply(new double[][]{{ point.getX(), point.getY(), point.getZ(), 1}},Utils.rotateMatrixFactory("X",degreeValue));
                point.setX(result[0][0]);
                point.setY(result[0][1]);
                point.setZ(result[0][2]);
            }else if(flagAxis==2){
                double[][] result=Utils.multiply(new double[][]{{ point.getX(), point.getY(), point.getZ(), 1}},Utils.rotateMatrixFactory("Y",degreeValue));
                point.setX(result[0][0]);
                point.setY(result[0][1]);
                point.setZ(result[0][2]);
            }else if(flagAxis==3){
                double[][] result=Utils.multiply(new double[][]{{ point.getX(), point.getY(), point.getZ(), 1}},Utils.rotateMatrixFactory("Z",degreeValue));
                point.setX(result[0][0]);
                point.setY(result[0][1]);
                point.setZ(result[0][2]);
            }
            //this.points.set(index,point);
            //index++;
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
