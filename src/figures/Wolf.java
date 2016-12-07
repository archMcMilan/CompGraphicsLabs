package figures;

import javafx.scene.Group;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Artem on 03.12.16.
 */
public class Wolf{
    private int posX;
    private int posY;
    private Group group;
    private List<Point> points;
    private List<Point> additionalPoints;


    public Wolf(Group group,int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
        this.group = group;
        points=new ArrayList<>();
        additionalPoints=new ArrayList<>();
    }

    public void addPoints(){
        points.add(new Point(-301,249));
        points.add(new Point(-335,200));
        points.add(new Point(-326,163));
        points.add(new Point(-324,84));
        points.add(new Point(-302,5));
        points.add(new Point(-282,-149));
        points.add(new Point(-272,-232));
        points.add(new Point(-206,-309));
        points.add(new Point(-147,-332));
        points.add(new Point(-26,-329));
        points.add(new Point(-6,-324));
        points.add(new Point(60,-365));
        points.add(new Point(68,-350));
        points.add(new Point(122,-336));
        points.add(new Point(139,-324));
        points.add(new Point(241,-234));
        points.add(new Point(267,-200));
        points.add(new Point(297,-132));
        points.add(new Point(340,-74));
        points.add(new Point(342,-27));
        points.add(new Point(314,-4));
        points.add(new Point(278,-16));
        points.add(new Point(261,-17));
        points.add(new Point(223,-52));
        points.add(new Point(155,-76));
        points.add(new Point(96,-54));
        points.add(new Point(124,45));
        points.add(new Point(91,99));
        points.add(new Point(72,93));
        points.add(new Point(48,-10));
        points.add(new Point(32,37));
        points.add(new Point(89,195));
        points.add(new Point(93,226));
        points.add(new Point(37,248));
        points.add(new Point(18,220));
        points.add(new Point(-38,-47));
        points.add(new Point(-41,-72));
        points.add(new Point(-123,-104));
        points.add(new Point(-111,29));
        points.add(new Point(-104,57));
        points.add(new Point(-137,60));
        points.add(new Point(-172,59));
        points.add(new Point(-205,-13));
        points.add(new Point(-215,-11));
        points.add(new Point(-214,46));
        points.add(new Point(-269,61));
        points.add(new Point(-290,163));
        points.add(new Point(-273,217));
        points.add(new Point(-301,249));
    }

    public void addAdditionalPoints(){
        additionalPoints.add(new Point(-301,249));
        additionalPoints.add(new Point(-335,200));

        additionalPoints.add(new Point(-330,163));
        additionalPoints.add(new Point(-330,163));

        additionalPoints.add(new Point(-323,138));
        additionalPoints.add(new Point(-323,90));

        additionalPoints.add(new Point(-316,28));
        additionalPoints.add(new Point(-313,13));

        additionalPoints.add(new Point(-303,-90));
        additionalPoints.add(new Point(-294,-121));

        additionalPoints.add(new Point(-270,-192));
        additionalPoints.add(new Point(-274,-177));

        additionalPoints.add(new Point(-251,-276));
        additionalPoints.add(new Point(-234,-293));

        additionalPoints.add(new Point(-191,-311));
        additionalPoints.add(new Point(-173,-313));

        additionalPoints.add(new Point(-93,-335));
        additionalPoints.add(new Point(-65,-335));

        additionalPoints.add(new Point(-93,-335));
        additionalPoints.add(new Point(-65,-335));

        additionalPoints.add(new Point(14,-335));
        additionalPoints.add(new Point(47,-351));

        additionalPoints.add(new Point(66,-361));
        additionalPoints.add(new Point(68,-356));

        additionalPoints.add(new Point(106,-354));
        additionalPoints.add(new Point(111,-349));

        additionalPoints.add(new Point(133,-338));
        additionalPoints.add(new Point(140,-331));

        additionalPoints.add(new Point(166,-289));
        additionalPoints.add(new Point(194,-264));

        additionalPoints.add(new Point(268,-309));
        additionalPoints.add(new Point(287,-298));

        additionalPoints.add(new Point(291,-170));
        additionalPoints.add(new Point(297,-156));

        additionalPoints.add(new Point(327,-101));
        additionalPoints.add(new Point(337,-87));

        additionalPoints.add(new Point(344,-71));
        additionalPoints.add(new Point(345,-60));

        additionalPoints.add(new Point(329,-22));
        additionalPoints.add(new Point(317,-16));

        additionalPoints.add(new Point(298,-3));
        additionalPoints.add(new Point(286,-7));

        additionalPoints.add(new Point(273,-15));
        additionalPoints.add(new Point(268,-14));

        additionalPoints.add(new Point(257,-31));
        additionalPoints.add(new Point(246,-42));

        additionalPoints.add(new Point(201,-50));
        additionalPoints.add(new Point(179,-60));

        additionalPoints.add(new Point(144,-84));
        additionalPoints.add(new Point(126,-84));

        additionalPoints.add(new Point(104,60));
        additionalPoints.add(new Point(120,57));

        additionalPoints.add(new Point(151,75));
        additionalPoints.add(new Point(141,93));

        additionalPoints.add(new Point(88,96));
        additionalPoints.add(new Point(81,92));

        additionalPoints.add(new Point(68,36));
        additionalPoints.add(new Point(66,24));

        additionalPoints.add(new Point(33,-2));
        additionalPoints.add(new Point(27,14));

        additionalPoints.add(new Point(39,171));
        additionalPoints.add(new Point(72,207));

        additionalPoints.add(new Point(93,208));
        additionalPoints.add(new Point(94,215));

        additionalPoints.add(new Point(86,260));
        additionalPoints.add(new Point(68,266));

        additionalPoints.add(new Point(32,235));
        additionalPoints.add(new Point(26,224));

        additionalPoints.add(new Point(-23,68));
        additionalPoints.add(new Point(-40,-20));

        additionalPoints.add(new Point(-32,-54));
        additionalPoints.add(new Point(-29,-66));

        additionalPoints.add(new Point(-89,-87));
        additionalPoints.add(new Point(-59,-76));

        additionalPoints.add(new Point(-189,-22));
        additionalPoints.add(new Point(-142,43));

        additionalPoints.add(new Point(-94,41));
        additionalPoints.add(new Point(-93,51));

        additionalPoints.add(new Point(-135,55));
        additionalPoints.add(new Point(-119,56));

        additionalPoints.add(new Point(-153,73));
        additionalPoints.add(new Point(-163,40));

        additionalPoints.add(new Point(-180,23));
        additionalPoints.add(new Point(-190,6));

        additionalPoints.add(new Point(-207,-31));
        additionalPoints.add(new Point(-221,-30));

        additionalPoints.add(new Point(-232,-12));
        additionalPoints.add(new Point(-229,12));

        additionalPoints.add(new Point(-194,77));
        additionalPoints.add(new Point(-229,97));

        additionalPoints.add(new Point(-287,100));
        additionalPoints.add(new Point(-298,136));

        additionalPoints.add(new Point(-260,182));
        additionalPoints.add(new Point(-258,214));

        additionalPoints.add(new Point(-273,228));
        additionalPoints.add(new Point(-289,247));
    }


    public void buildWolf(){
        addPoints();
        addAdditionalPoints();
        drawWolf();

    }

    public void drawWolf() {
        List<Line> lines=new ArrayList<>();
        List<Point> pointsOnLine=new ArrayList<>();
        for(int i=1,j=1;i<points.size() && j<additionalPoints.size();i++,j+=2){
            for(double t=0;t<=1;t+=0.01){
                pointsOnLine.add(new Point(
                        formulaX(t,points.get(i-1),points.get(i),additionalPoints.get(j-1),additionalPoints.get(j)),
                        formulaY(t,points.get(i-1),points.get(i),additionalPoints.get(j-1),additionalPoints.get(j))));
            }
        }

        List<Circle> circles=new ArrayList<>();
        for(int i=1;i<pointsOnLine.size();i++){
            lines.add(new Line(
                    pointsOnLine.get(i).x+posX,
                    pointsOnLine.get(i).y+posY,
                    pointsOnLine.get(i-1).x+posX,
                    pointsOnLine.get(i-1).y+posY));
        }
        for(int i=0;i<points.size();i++){
            circles.add(new Circle(points.get(i).x+posX,points.get(i).y+posY,5));

        }
        for(int i=0;i<additionalPoints.size();i++){
            circles.add(new Circle(additionalPoints.get(i).x+posX,additionalPoints.get(i).y+posY,2));
        }
        group.getChildren().addAll(circles);
        group.getChildren().addAll(lines);
    }

    public double formulaX(double t, Point start, Point finish ,Point addFirst, Point addSecond){
        return Math.pow(1-t,3)*start.getX()+3*t*Math.pow(1-t,2)*addFirst.getX()+3*t*t*(1-t)*addSecond.getX()+t*t*t*finish.getX();
    }

    public double formulaY(double t, Point start, Point finish ,Point addFirst, Point addSecond){
        return Math.pow(1-t,3)*start.getY()+3*t*Math.pow(1-t,2)*addFirst.getY()+3*t*t*(1-t)*addSecond.getY()+t*t*t*finish.getY();
    }

    public Point pointOnWolf(double x, double y) {
        for (Point point : points) {
            if (point.x - 5 <= x && point.x + 5 >= x) {
                if (point.y - 5 <= y && point.y + 5 >= y) {
                    return point;
                }
            }
        }
        return null;
    }
}
