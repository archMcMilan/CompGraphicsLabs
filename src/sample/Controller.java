package sample;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

public class Controller {
    public static final int POSX=-200;
    public static final int POSY=50;
    private int figurePosX =0;
    private int figurePosY =0;
    private int coordinatesPosX =0;
    private int coordinatesPosY =0;
    private int centerPosX =0;
    private int centerPosY =0;
    private int shiftPosX =0;
    private int shiftPosY =0;
    private Figure figure;
    private Circle center;

    @FXML
    private TextField inputA;
    @FXML
    private TextField inputB;
    @FXML
    private TextField inputC;
    @FXML
    private AnchorPane pane;
    @FXML
    private AnchorPane window;
    @FXML
    private TextField shiftX;
    @FXML
    private TextField shiftY;
    @FXML
    private TextField angleTurning;

    @FXML
    private TextField x0;
    @FXML
    private TextField y0;
    @FXML
    private TextField xx;
    @FXML
    private TextField xy;
    @FXML
    private TextField yx;
    @FXML
    private TextField yy;

    @FXML
    private TextField x01;
    @FXML
    private TextField y01;
    @FXML
    private TextField xx1;
    @FXML
    private TextField xy1;
    @FXML
    private TextField yx1;
    @FXML
    private TextField yy1;
    @FXML
    private TextField w0;
    @FXML
    private TextField w1;
    @FXML
    private TextField w2;

    @FXML
    private TextField newPosX;
    @FXML
    private TextField newPosY;

    @FXML
    private TextField paramA;
    @FXML
    private TextField paramK;
    @FXML
    private TextField trigFunction;


    private Rose rose;
    @FXML
    private TextField shiftX1;
    @FXML
    private TextField shiftY1;
    @FXML
    private TextField angleTurning1;
    @FXML
    private TextField newPosX1;
    @FXML
    private TextField newPosY1;
    private int centerRoseX =0;
    private int centerRoseY =0;


    public void init(){
        initStartPos((int)window.getWidth()/2+POSX,(int)window.getHeight()/2+POSY);
        Group root = new Group();
        buildCoordinates(root,coordinatesPosX, coordinatesPosY);
        figure = createFigure(root,figurePosX, figurePosY);
        createCenter(root, centerPosX, centerPosY);
        rebuildFigure(root);

        String message="";
        pane.setOnMouseClicked(new EventHandler<MouseEvent>() {
            String msg;
            @Override
            public void handle(MouseEvent event) {
                msg="(x: "       + event.getX()      + ", y: "       + event.getY()       + ") -- " +
                        "(sceneX: "  + event.getSceneX() + ", sceneY: "  + event.getSceneY()  + ") -- " +
                        "(screenX: " + event.getScreenX()+ ", screenY: " + event.getScreenY() + ")";
                //System.out.println(msg);
            }

            public String getMsg() {
                return msg;
            }
        });
        pane.setOnMouseClicked(mouseHandler);

    }
    private final EventHandler<MouseEvent> mouseHandler = event -> {
        if (event.getX() > 1) {
            System.out.println("double clicked!");
        }
    };

    private void initStartPos(int x, int y) {
        figurePosX =x;
        figurePosY =y;
        coordinatesPosX =x;
        coordinatesPosY =y;
        centerPosX=x;
        centerPosY=y;
        centerRoseX=x;
        centerRoseY=y;
        shiftPosX=0;
        shiftPosY=0;
    }
    private void buildCoordinates(Group root, int posX, int posY){
        Coordinates coordinates=new Coordinates(posX, posY, root);
        coordinates.drawGrid();
        coordinates.drawAxis();
    }
    private Figure createFigure(Group root,int figurePosX, int figurePosY) {
        Figure figure = new Figure(root,figurePosX, figurePosY);
        figure.setA(Integer.parseInt(inputA.getText()));
        figure.setB(-Integer.parseInt(inputB.getText()));
        figure.setC(-Integer.parseInt(inputC.getText()));
        return figure;
    }

    private void createCenter(Group root, int centerPosX, int centerPosY) {
        center =new Circle(centerPosX,centerPosY,3);
        root.getChildren().addAll(center);
    }

    public Figure rebuildFigure(Group root){
        rebuiltPane(root);
        figure.buildFigure();
        figure.drawFigure();
        return figure;
    }
    private void rebuiltPane(Group root) {
        pane.getChildren().clear();
        pane.getChildren().add(root);
    }

    public void shift(){
        Group root = preparePane();

        shiftPosX+=Integer.parseInt(shiftX.getText());
        shiftPosY+=Integer.parseInt(shiftY.getText());
        figure.setGroup(root);
        figure.shiftFigure(Integer.parseInt(shiftX.getText()),Integer.parseInt(shiftY.getText()));
        figure.drawFigure();
        createCenter(root, centerPosX, centerPosY);
    }

    private Group preparePane() {
        Group root = new Group();
        buildCoordinates(root,coordinatesPosX,coordinatesPosY);
        rebuiltPane(root);
        return root;
    }

    public void turning(){
        Group root = preparePane();

        figure.setGroup(root);
        figure.turnFigure(Double.parseDouble(angleTurning.getText()));
        figure.drawFigure();
        createCenter(root, centerPosX, centerPosY);
    }

    public void affine(){
        Group root = preparePane();

        Coordinates coordinates=new Coordinates(coordinatesPosX, coordinatesPosY, root);
        coordinates.affine(Double.parseDouble(x0.getText()),Double.parseDouble(y0.getText()),
                Double.parseDouble(xx.getText()),Double.parseDouble(xy.getText()),
                Double.parseDouble(yx.getText()),Double.parseDouble(yy.getText()));
        coordinates.drawGrid();
        coordinates.drawAxis();

        figure.setGroup(root);
        figure.affineFigure(Double.parseDouble(x0.getText()),Double.parseDouble(y0.getText()),
                Double.parseDouble(xx.getText()),Double.parseDouble(xy.getText()),
                Double.parseDouble(yx.getText()),Double.parseDouble(yy.getText()));
        figure.drawFigure();

        createCenter(root, centerPosX, centerPosY);
    }

    public void proective(){
        Group root = preparePane();

        figure.setGroup(root);
        figure.proectiveFigure(Double.parseDouble(x01.getText()),Double.parseDouble(y01.getText()),
                Double.parseDouble(xx1.getText()),Double.parseDouble(xy1.getText()),
                Double.parseDouble(yx1.getText()),Double.parseDouble(yy1.getText()),
                Double.parseDouble(w0.getText()),Double.parseDouble(w1.getText()),
                Double.parseDouble(w2.getText()));
        figure.drawFigure();

        createCenter(root, centerPosX, centerPosY);
    }

    public void initNewCenter(){
        Group root=preparePane();

        centerPosX+=Integer.parseInt(newPosX.getText());
        centerPosY+=Integer.parseInt(newPosY.getText());
        createCenter(root, centerPosX, centerPosY);
        figure = createFigure(root,centerPosX, centerPosY);

        figure.buildFigure();
        figure.shiftFigure(coordinatesPosX-centerPosX+shiftPosX,coordinatesPosY-centerPosY+shiftPosY);
        figure.drawFigure();
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void buildRose(){
        initStartPos((int)window.getWidth()/2+POSX,(int)window.getHeight()/2+POSY);
        Group root = new Group();
        initStartPos((int)window.getWidth()/2+POSX,(int)window.getHeight()/2+POSY);
        buildCoordinates(root,figurePosX, figurePosY);
        rose=createRose(root,figurePosX,figurePosY);
        createCenter(root, centerRoseX, centerRoseY);
        rebuildRose(root);

    }


    private Rose createRose(Group root,int figurePosX, int figurePosY) {
        rose=new Rose(root,figurePosX, figurePosY);
        rose.a=Integer.parseInt(paramA.getText());
        rose.k=Double.parseDouble(paramK.getText());
        rose.function=trigFunction.getText();
        return rose;
    }

    private void rebuildRose(Group root) {
        rebuiltPane(root);
        rose.buildFigure();
        rose.drawFigure();
    }


    public void shiftRose(){
        Group root = preparePane();

        shiftPosX+=Integer.parseInt(shiftX1.getText());
        shiftPosY+=Integer.parseInt(shiftY1.getText());

        rose.setGroup(root);
        rose.shiftFigure(Integer.parseInt(shiftX1.getText()),Integer.parseInt(shiftY1.getText()));
        rose.drawFigure();
        createCenter(root, centerRoseX,centerRoseY);
    }

    public void turnRose(){
        Group root = preparePane();

        rose.setGroup(root);
        rose.turnFigure(Double.parseDouble(angleTurning1.getText()));
        rose.drawFigure();
        createCenter(root, centerRoseX, centerRoseY);
    }

    public void roseNewCenter(){
        Group root=preparePane();

        centerRoseX+=Integer.parseInt(newPosX.getText());
        centerRoseY+=Integer.parseInt(newPosY.getText());
        createCenter(root, centerRoseX, centerRoseY);
        rose = createRose(root,centerRoseX, centerRoseY);

        rose.buildFigure();
        rose.shiftFigure(coordinatesPosX-centerRoseX+shiftPosX,coordinatesPosY-centerRoseY+shiftPosY);
        rose.drawFigure();
    }
}
