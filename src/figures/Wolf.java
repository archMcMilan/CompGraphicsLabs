package figures;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Wolf{
    private int posX;
    private int posY;
    private Group group;
    private List<Point> points;
    private List<Point> additionalPoints;
    private Point clickedPoint=null;
    private Point clickedAdditionalPoint=null;
    private boolean smooth=false;

    public Point getClickedPoint() {
        return clickedPoint;
    }

    public Point getClickedAdditionalPoint() {
        return clickedAdditionalPoint;
    }

    public void setClickedPoint(Point clickedPoint) {
        this.clickedPoint = clickedPoint;
    }

    public void setClickedAdditionalPoint(Point clickedAdditionalPoint) {
        this.clickedAdditionalPoint = clickedAdditionalPoint;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public void setSmooth(boolean smooth) {
        this.smooth = smooth;
    }

    public Wolf(Group group, int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
        this.group = group;
        points=new LinkedList<>();
        additionalPoints=new LinkedList<>();
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
        points.add(new Point(-82,-332));
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

        additionalPoints.add(new Point(-59,-76));
        additionalPoints.add(new Point(-89,-87));

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
        drawLine(pointsOnLine);

        for(int i=1;i<pointsOnLine.size();i++){
            lines.add(new Line(
                    pointsOnLine.get(i).x+posX,
                    pointsOnLine.get(i).y+posY,
                    pointsOnLine.get(i-1).x+posX,
                    pointsOnLine.get(i-1).y+posY));
        }
        List<Circle> circles=new ArrayList<>();
        for(int i=0;i<points.size();i++){
            circles.add(new Circle(points.get(i).x+posX,points.get(i).y+posY,5));

        }
        for(int i=0;i<additionalPoints.size();i++){
            circles.add(new Circle(additionalPoints.get(i).x+posX,additionalPoints.get(i).y+posY,2));
        }
        group.getChildren().addAll(circles);
        group.getChildren().addAll(lines);
    }

    private void drawLine(List<Point> pointsOnLine){
        for(int i=1,j=1;i<points.size() && j<additionalPoints.size();i++,j+=2){
            for(double t=0;t<=1;t+=0.01){
                pointsOnLine.add(new Point(
                        formulaX(t,points.get(i-1),points.get(i),additionalPoints.get(j-1),additionalPoints.get(j)),
                        formulaY(t,points.get(i-1),points.get(i),additionalPoints.get(j-1),additionalPoints.get(j))));
            }
        }
    }

    private void comleteInOneDraw(List<Point> pointsOnLine, List<Line> lines){
        for(int i=1;i<pointsOnLine.size();i++){
            lines.add(new Line(
                    pointsOnLine.get(i).x+posX,
                    pointsOnLine.get(i).y+posY,
                    pointsOnLine.get(i-1).x+posX,
                    pointsOnLine.get(i-1).y+posY));
        }
    }


    private double formulaX(double t, Point start, Point finish ,Point addFirst, Point addSecond){
        return Math.pow(1-t,3)*start.getX()+3*t*Math.pow(1-t,2)*addFirst.getX()+3*t*t*(1-t)*addSecond.getX()+t*t*t*finish.getX();
    }

    private double formulaY(double t, Point start, Point finish ,Point addFirst, Point addSecond){
        return Math.pow(1-t,3)*start.getY()+3*t*Math.pow(1-t,2)*addFirst.getY()+3*t*t*(1-t)*addSecond.getY()+t*t*t*finish.getY();
    }

    public Point pointOnWolf(double x, double y) {
        for (Point point : points) {
            if (point.x - 5 <= x && point.x + 5 >= x) {
                if (point.y - 5 <= y && point.y + 5 >= y) {
                    clickedPoint=point;
                    System.out.println(clickedPoint.getX()+" "+clickedPoint.getY());
                    Circle circle=new Circle(point.x+posX,point.y+posY,5);
                    circle.setFill(Color.BLUE);
                    group.getChildren().addAll(circle);
                    return point;
                }
            }
        }
        return null;
    }

    public Point additionalPointOnWolf(double x, double y) {
        for (Point point : additionalPoints) {
            if (point.x - 5 <= x && point.x + 5 >= x) {
                if (point.y - 5 <= y && point.y + 5 >= y) {
                    clickedAdditionalPoint=point;
                    Circle circle=new Circle(point.x+posX,point.y+posY,2);
                    circle.setFill(Color.BLUE);
                    group.getChildren().addAll(circle);
                    return point;
                }
            }
        }
        return null;
    }

    public void changePoint(double x, double y){
        if(clickedPoint!=null){
            clickedPoint.setX(x);
            clickedPoint.setY(y);
            if(smooth){
                applySmooth(additionalPoints.get((points.indexOf(clickedPoint)-1)*2+1),
                        additionalPoints.get((points.indexOf(clickedPoint))*2),
                        points.get(points.indexOf(clickedPoint)));
            }
        }else if(clickedAdditionalPoint!=null){
            clickedAdditionalPoint.setX(x);
            clickedAdditionalPoint.setY(y);

            System.out.println(additionalPoints.indexOf(clickedAdditionalPoint));
            System.out.println(additionalPoints.get(additionalPoints.indexOf(clickedAdditionalPoint)).getX()+" "+
                    additionalPoints.get(additionalPoints.indexOf(clickedAdditionalPoint)).getY());
            System.out.println(points.get(additionalPoints.indexOf(clickedAdditionalPoint)/2).getX()+" "+
                    points.get(additionalPoints.indexOf(clickedAdditionalPoint)/2).getY());

            if(smooth){
                if(additionalPoints.indexOf(clickedAdditionalPoint)%2==0){
                    applySmooth(additionalPoints.get(additionalPoints.indexOf(clickedAdditionalPoint)),
                            additionalPoints.get(additionalPoints.indexOf(clickedAdditionalPoint)-1),
                            points.get(additionalPoints.indexOf(clickedAdditionalPoint)/2));
                }else{
                    applySmooth(additionalPoints.get(additionalPoints.indexOf(clickedAdditionalPoint)),
                            additionalPoints.get(additionalPoints.indexOf(clickedAdditionalPoint)+1),
                            points.get(additionalPoints.indexOf(clickedAdditionalPoint)/2+1));
                }

            }
        }

    }

    public void newFigure(){
        List<Point>newFigurePoints=pointOfNewFigure();
        List<Point>newAdditionalPoints=addPointsOfNEwFigure();

        List<Point> pointsOnLine=new ArrayList<>();
        List<Line> lines=new ArrayList<>();

        for(int i=1,j=1;i<newFigurePoints.size() && j<newAdditionalPoints.size();i++,j+=2){
            for(double t=0;t<=1;t+=0.01){
                pointsOnLine.add(new Point(
                        formulaX(t,newFigurePoints.get(i-1),newFigurePoints.get(i),newAdditionalPoints.get(j-1),newAdditionalPoints.get(j)),
                        formulaY(t,newFigurePoints.get(i-1),newFigurePoints.get(i),newAdditionalPoints.get(j-1),newAdditionalPoints.get(j))));
            }
        }
        for(int i=1;i<pointsOnLine.size();i++){
            lines.add(new Line(
                    pointsOnLine.get(i).x+posX,
                    pointsOnLine.get(i).y+posY,
                    pointsOnLine.get(i-1).x+posX,
                    pointsOnLine.get(i-1).y+posY));
        }
        group.getChildren().addAll(lines);
    }

    public List<Point> pointOfNewFigure(){
        List<Point> newFigurePoints=new ArrayList<>();
        newFigurePoints.add(new Point(-100,0));
        newFigurePoints.add(new Point(-105,-5));
        newFigurePoints.add(new Point(-110,-10));
        newFigurePoints.add(new Point(-115,-15));
        newFigurePoints.add(new Point(-120,-20));

        newFigurePoints.add(new Point(-120,-30));
        newFigurePoints.add(new Point(-120,-40));
        newFigurePoints.add(new Point(-110,-40));
        newFigurePoints.add(new Point(-100,-40));

        newFigurePoints.add(new Point(-100,-60));
        newFigurePoints.add(new Point(-100,-80));
        newFigurePoints.add(new Point(-100,-100));
        newFigurePoints.add(new Point(-100,-120));
        newFigurePoints.add(new Point(-100,-140));
        newFigurePoints.add(new Point(-100,-150));

        newFigurePoints.add(new Point(-110,-150));
        newFigurePoints.add(new Point(-120,-150));
        newFigurePoints.add(new Point(-120,-160));
        newFigurePoints.add(new Point(-120,-170));

        newFigurePoints.add(new Point(-115,-175));
        newFigurePoints.add(new Point(-110,-180));
        newFigurePoints.add(new Point(-105,-185));
        newFigurePoints.add(new Point(-100,-190));

        newFigurePoints.add(new Point(0,-190));

        newFigurePoints.add(new Point(100,-190));
        newFigurePoints.add(new Point(105,-185));
        newFigurePoints.add(new Point(110,-180));
        newFigurePoints.add(new Point(115,-175));

        newFigurePoints.add(new Point(120,-170));
        newFigurePoints.add(new Point(120,-160));
        newFigurePoints.add(new Point(120,-150));
        newFigurePoints.add(new Point(110,-150));

        newFigurePoints.add(new Point(100,-150));
        newFigurePoints.add(new Point(100,-140));
        newFigurePoints.add(new Point(100,-120));
        newFigurePoints.add(new Point(100,-100));
        newFigurePoints.add(new Point(100,-80));
        newFigurePoints.add(new Point(100,-60));

        newFigurePoints.add(new Point(100,-40));
        newFigurePoints.add(new Point(110,-40));
        newFigurePoints.add(new Point(120,-40));
        newFigurePoints.add(new Point(120,-30));

        newFigurePoints.add(new Point(120,-20));
        newFigurePoints.add(new Point(115,-15));
        newFigurePoints.add(new Point(110,-10));
        newFigurePoints.add(new Point(105,-5));

        newFigurePoints.add(new Point(100,0));
        newFigurePoints.add(new Point(0,0));
        newFigurePoints.add(new Point(-100,0));

        return newFigurePoints;
    }

    public List<Point> addPointsOfNEwFigure(){
        List<Point> additionalPoints=new ArrayList<>();
        additionalPoints.add(new Point(-102,-2));
        additionalPoints.add(new Point(-104,-4));

        additionalPoints.add(new Point(-106,-6));
        additionalPoints.add(new Point(-108,-8));

        additionalPoints.add(new Point(-112,-12));
        additionalPoints.add(new Point(-114,-14));

        additionalPoints.add(new Point(-116,-16));
        additionalPoints.add(new Point(-118,-18));


        additionalPoints.add(new Point(-120,-23));
        additionalPoints.add(new Point(-120,-26));

        additionalPoints.add(new Point(-120,-33));
        additionalPoints.add(new Point(-120,-36));

        additionalPoints.add(new Point(-116,-40));
        additionalPoints.add(new Point(-113,-40));

        additionalPoints.add(new Point(-107,-40));
        additionalPoints.add(new Point(-103,-40));


        additionalPoints.add(new Point(-100,-47));
        additionalPoints.add(new Point(-100,-54));

        additionalPoints.add(new Point(-100,-67));
        additionalPoints.add(new Point(-100,-74));

        additionalPoints.add(new Point(-100,-87));
        additionalPoints.add(new Point(-100,-94));

        additionalPoints.add(new Point(-100,-107));
        additionalPoints.add(new Point(-100,-114));

        additionalPoints.add(new Point(-100,-127));
        additionalPoints.add(new Point(-100,-134));

        additionalPoints.add(new Point(-100,-143));
        additionalPoints.add(new Point(-100,-146));


        additionalPoints.add(new Point(-103,-150));
        additionalPoints.add(new Point(-106,-150));

        additionalPoints.add(new Point(-113,-150));
        additionalPoints.add(new Point(-116,-150));

        additionalPoints.add(new Point(-120,-153));
        additionalPoints.add(new Point(-120,-156));

        additionalPoints.add(new Point(-120,-163));
        additionalPoints.add(new Point(-120,-166));


        additionalPoints.add(new Point(-118,-172));
        additionalPoints.add(new Point(-116,-173));

        additionalPoints.add(new Point(-113,-177));
        additionalPoints.add(new Point(-112,-178));

        additionalPoints.add(new Point(-108,-182));
        additionalPoints.add(new Point(-107,-183));

        additionalPoints.add(new Point(-103,-187));
        additionalPoints.add(new Point(-102,-188));



        additionalPoints.add(new Point(-75,-190));
        additionalPoints.add(new Point(-25,-190));



        additionalPoints.add(new Point(25,-190));
        additionalPoints.add(new Point(75,-190));

        additionalPoints.add(new Point(102,-188));
        additionalPoints.add(new Point(103,-187));

        additionalPoints.add(new Point(107,-183));
        additionalPoints.add(new Point(108,-182));

        additionalPoints.add(new Point(112,-178));
        additionalPoints.add(new Point(113,-177));


        additionalPoints.add(new Point(117,-173));
        additionalPoints.add(new Point(118,-172));

        additionalPoints.add(new Point(120,-167));
        additionalPoints.add(new Point(120,-163));

        additionalPoints.add(new Point(120,-157));
        additionalPoints.add(new Point(120,-153));

        additionalPoints.add(new Point(117,-150));
        additionalPoints.add(new Point(113,-150));


        additionalPoints.add(new Point(107,-150));
        additionalPoints.add(new Point(103,-150));

        additionalPoints.add(new Point(100,-147));
        additionalPoints.add(new Point(100,-143));

        additionalPoints.add(new Point(100,-133));
        additionalPoints.add(new Point(100,-127));

        additionalPoints.add(new Point(100,-113));
        additionalPoints.add(new Point(100,-107));


        additionalPoints.add(new Point(100,-93));
        additionalPoints.add(new Point(100,-87));

        additionalPoints.add(new Point(100,-73));
        additionalPoints.add(new Point(100,-67));


        additionalPoints.add(new Point(100,-53));
        additionalPoints.add(new Point(100,-47));

        additionalPoints.add(new Point(103,-40));
        additionalPoints.add(new Point(107,-40));

        additionalPoints.add(new Point(113,-40));
        additionalPoints.add(new Point(117,-40));

        additionalPoints.add(new Point(120,-37));
        additionalPoints.add(new Point(120,-33));


        additionalPoints.add(new Point(120,-27));
        additionalPoints.add(new Point(120,-23));

        additionalPoints.add(new Point(118,-18));
        additionalPoints.add(new Point(117,-17));

        additionalPoints.add(new Point(113,-13));
        additionalPoints.add(new Point(112,-12));

        additionalPoints.add(new Point(108,-8));
        additionalPoints.add(new Point(107,-7));


        additionalPoints.add(new Point(104,-4));
        additionalPoints.add(new Point(103,-3));

        additionalPoints.add(new Point(75,0));
        additionalPoints.add(new Point(25,0));

        additionalPoints.add(new Point(-25,0));
        additionalPoints.add(new Point(-75,0));

        return additionalPoints;
    }

    public Group turnIntoNew(double coef){
        List<Point>newFigurePoints=pointOfNewFigure();
        List<Point>newAdditionalPoints=addPointsOfNEwFigure();
        List<Line> lines=new ArrayList<>();
        List<Point> pointsOnLine=new ArrayList<>();
        turnIntoIter(newFigurePoints, newAdditionalPoints, pointsOnLine,coef,points,additionalPoints);
        for(int i=1;i<pointsOnLine.size();i++){
            lines.add(new Line(
                    pointsOnLine.get(i).x+posX,
                    pointsOnLine.get(i).y+posY,
                    pointsOnLine.get(i-1).x+posX,
                    pointsOnLine.get(i-1).y+posY));
        }
        group.getChildren().addAll(lines);
        return group;
    }

    private void turnIntoIter(List<Point> newFigurePoints, List<Point> newAdditionalPoints,
                              List<Point> pointsOnLine,double coef,
                              List<Point> points, List<Point> additionalPoints) {
        for(int i=1,j=1;i<points.size() && j<additionalPoints.size();i++,j+=2){
            for(double t=0;t<=1;t+=0.01){
                Point newStart=new Point(
                        points.get(i-1).getX()+(newFigurePoints.get(i-1).getX()-points.get(i-1).getX())*coef,
                        points.get(i-1).getY()+(newFigurePoints.get(i-1).getY()-points.get(i-1).getY())*coef);
                Point newEnd=new Point(
                        points.get(i).getX()+(newFigurePoints.get(i).getX()-points.get(i).getX())*coef,
                        points.get(i).getY()+(newFigurePoints.get(i).getY()-points.get(i).getY())*coef);
                Point newFirst=new Point(
                        additionalPoints.get(j-1).getX()+(newAdditionalPoints.get(j-1).getX()-additionalPoints.get(j-1).getX())*coef,
                        additionalPoints.get(j-1).getY()+(newAdditionalPoints.get(j-1).getY()-additionalPoints.get(j-1).getY())*coef);
                Point newSecond=new Point(
                        additionalPoints.get(j).getX()+(newAdditionalPoints.get(j).getX()-additionalPoints.get(j).getX())*coef,
                        additionalPoints.get(j).getY()+(newAdditionalPoints.get(j).getY()-additionalPoints.get(j).getY())*coef);
                pointsOnLine.add(new Point(
                        formulaX(t,newStart,newEnd,newFirst,newSecond),
                        formulaY(t,newStart,newEnd,newFirst,newSecond)));
            }
        }
    }

    public void applySmooth(Point leftPoint, Point rightPoint, Point middlePoint) {
        double l1 = 1, l2 = 1;
        double x = middlePoint.getX() - l1/l2*(leftPoint.getX() - middlePoint.getX());
        double y = middlePoint.getY() - l1/l2*(leftPoint.getY() - middlePoint.getY());
        rightPoint.setX(x);
        rightPoint.setY(y);
    }

}
