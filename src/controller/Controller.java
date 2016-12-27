package controller;

import figures.*;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

public class Controller {
    public static final int POSX = -200;
    public static final int POSY = 50;
    private int figurePosX = 0;
    private int figurePosY = 0;
    private int coordinatesPosX = 0;
    private int coordinatesPosY = 0;
    private int centerPosX = 0;
    private int centerPosY = 0;
    private int shiftPosX = 0;
    private int shiftPosY = 0;
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

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    protected Rose rose;
    @FXML
    protected TextField shiftX1;
    @FXML
    private TextField shiftY1;
    @FXML
    private TextField angleTurning1;
    @FXML
    private TextField newPosX1;
    @FXML
    private TextField newPosY1;
    private int centerRoseX = 0;
    private int centerRoseY = 0;
    @FXML
    private TextField length;
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private int wolfPosX = 0;
    private int wolfPosY = 0;
    private Wolf wolf;
    @FXML
    private Slider slider;
    private boolean smooth=false;
    @FXML
    private Label smoothText;
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @FXML
    private TextField iteration;
    @FXML
    private TextField lengthKoha;

    public void init() {
        initStartPos((int) window.getWidth() / 2 + POSX, (int) window.getHeight() / 2 + POSY);
        Group root = new Group();
        buildCoordinates(root, coordinatesPosX, coordinatesPosY);
        figure = createFigure(root, figurePosX, figurePosY);
        createCenter(root, centerPosX, centerPosY);
        rebuildFigure(root);
    }

    private void initStartPos(int x, int y) {
        figurePosX = x;
        figurePosY = y;
        coordinatesPosX = x;
        coordinatesPosY = y;
        centerPosX = x;
        centerPosY = y;
        centerRoseX = x;
        centerRoseY = y;
        shiftPosX = 0;
        shiftPosY = 0;
        wolfPosX = x;
        wolfPosY = y;
    }

    private void buildCoordinates(Group root, int posX, int posY) {
        Coordinates coordinates = new Coordinates(posX, posY, root);
        coordinates.drawGrid();
        coordinates.drawAxis();
    }

    private Group preparePane() {
        Group root = new Group();
        buildCoordinates(root, coordinatesPosX, coordinatesPosY);
        rebuiltPane(root);
        return root;
    }

    private Figure createFigure(Group root, int figurePosX, int figurePosY) {
        Figure figure = new Figure(root, figurePosX, figurePosY);
        figure.setA(Integer.parseInt(inputA.getText()));
        figure.setB(-Integer.parseInt(inputB.getText()));
        figure.setC(-Integer.parseInt(inputC.getText()));
        return figure;
    }

    public Figure rebuildFigure(Group root) {
        rebuiltPane(root);
        figure.buildFigure();
        figure.drawFigure();
        return figure;
    }

    private void rebuiltPane(Group root) {
        pane.getChildren().clear();
        pane.getChildren().add(root);
    }

    public void shift() {
        shifting(figure, shiftX.getText(), shiftY.getText(), centerPosX, centerPosY);
    }

    private void shifting(Figure figure, String shiftX, String shiftY, int centerPosX, int centerPosY) {
        Group root = preparePane();

        shiftPosX += Integer.parseInt(shiftX);
        shiftPosY += Integer.parseInt(shiftY);
        figure.setGroup(root);
        figure.shiftFigure(Integer.parseInt(shiftX), Integer.parseInt(shiftY));
        figure.drawFigure();
        createCenter(root, centerPosX, centerPosY);
    }

    public void turn() {
        turning(figure, angleTurning.getText(), centerPosX, centerPosY);
    }

    private void turning(Figure figure, String angle, int centerPosX, int centerPosY) {
        Group root = preparePane();
        figure.setGroup(root);
        figure.turnFigure(Double.parseDouble(angle));
        figure.drawFigure();
        createCenter(root, centerPosX, centerPosY);
    }


    public void affine() {
        Group root = preparePane();

        Coordinates coordinates = new Coordinates(coordinatesPosX, coordinatesPosY, root);
        coordinates.affine(Double.parseDouble(x0.getText()), Double.parseDouble(y0.getText()),
                Double.parseDouble(xx.getText()), Double.parseDouble(xy.getText()),
                Double.parseDouble(yx.getText()), Double.parseDouble(yy.getText()));
        coordinates.drawGrid();
        coordinates.drawAxis();

        figure.setGroup(root);
        figure.affineFigure(Double.parseDouble(x0.getText()), Double.parseDouble(y0.getText()),
                Double.parseDouble(xx.getText()), Double.parseDouble(xy.getText()),
                Double.parseDouble(yx.getText()), Double.parseDouble(yy.getText()));
        figure.drawFigure();

        createCenter(root, centerPosX, centerPosY);
    }

    public void proective() {
        Group root = preparePane();

        figure.setGroup(root);
        figure.proectiveFigure(Double.parseDouble(x01.getText()), Double.parseDouble(y01.getText()),
                Double.parseDouble(xx1.getText()), Double.parseDouble(xy1.getText()),
                Double.parseDouble(yx1.getText()), Double.parseDouble(yy1.getText()),
                Double.parseDouble(w0.getText()), Double.parseDouble(w1.getText()),
                Double.parseDouble(w2.getText()));
        figure.drawFigure();

        createCenter(root, centerPosX, centerPosY);
    }

    public void initNewCenter() {
        Group root = preparePane();

        centerPosX += Integer.parseInt(newPosX.getText());
        centerPosY += Integer.parseInt(newPosY.getText());
        createCenter(root, centerPosX, centerPosY);
        figure = createFigure(root, centerPosX, centerPosY);

        figure.buildFigure();
        figure.shiftFigure(coordinatesPosX - centerPosX + shiftPosX, coordinatesPosY - centerPosY + shiftPosY);
        figure.drawFigure();
    }

    private void createCenter(Group root, int centerPosX, int centerPosY) {
        center = new Circle(centerPosX, centerPosY, 3);
        root.getChildren().addAll(center);
    }


    //ROSE//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void buildRose() {
        Group root = new Group();
        initStartPos((int) window.getWidth() / 2 + POSX, (int) window.getHeight() / 2 + POSY);
        buildCoordinates(root, figurePosX, figurePosY);
        rose = createRose(root, figurePosX, figurePosY);
        createCenter(root, centerRoseX, centerRoseY);
        rebuildRose(root);
        clickOnRose();
        length.setText(String.valueOf(rose.getSize()));
    }


    private Rose createRose(Group root, int figurePosX, int figurePosY) {
        rose = new Rose(root, figurePosX, figurePosY);
        rose.setA(Integer.parseInt(paramA.getText()));
        rose.setK(Double.parseDouble(paramK.getText()));
        rose.setFunction(trigFunction.getText());
        return rose;
    }

    private void rebuildRose(Group root) {
        rebuiltPane(root);
        rose.buildFigure();
        rose.drawFigure();
    }

    public void shiftRose() {
        shifting(rose, shiftX1.getText(), shiftY1.getText(), centerRoseX, centerRoseY);
    }

    public void turnRose() {
        turning(rose, angleTurning1.getText(), centerRoseX, centerRoseY);
    }

    public void roseNewCenter() {
        Group root = preparePane();

        centerRoseX += Integer.parseInt(newPosX1.getText());
        centerRoseY += Integer.parseInt(newPosY1.getText());
        createCenter(root, centerRoseX, centerRoseY);
        rose = createRose(root, centerRoseX, centerRoseY);

        rose.buildFigure();
        rose.shiftFigure(coordinatesPosX - centerRoseX + shiftPosX, coordinatesPosY - centerRoseY + shiftPosY);
        rose.drawFigure();
    }

    public void clickOnRose() {
        pane.setOnMouseClicked(mouseHandler);
    }

    private final EventHandler<MouseEvent> mouseHandler = event -> {
        int pointPosX = (int) window.getWidth() / 2 + POSX;
        int pointPosY = (int) window.getHeight() / 2 + POSY;
        Point clickedPoint = rose.pointOnRose(event.getX() - pointPosX, event.getY() - pointPosY);
        if (clickedPoint != null) {
            pane.getChildren().clear();
            rose.getGroup().getChildren().addAll(new Circle(pointPosX + clickedPoint.getX(), pointPosY + clickedPoint.getY(), 5));
            pane.getChildren().add(rose.getGroup());
            rose.drawTangent(clickedPoint);
        }


        String msg = "(x: " + (event.getX() - pointPosX) + ", y: " + (event.getY() - pointPosY) + ") -- " +
                "(sceneX: " + event.getSceneX() + ", sceneY: " + event.getSceneY() + ") -- " +
                "(screenX: " + event.getScreenX() + ", screenY: " + event.getScreenY() + ")";

        System.out.println(msg);
    };

    //WOLF//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void wolfBuild() {
        Group root = new Group();
        initStartPos((int) window.getWidth() / 2 + POSX, (int) window.getHeight() / 2 + POSY);
        buildCoordinates(root, wolfPosX, wolfPosY);
        wolf = new Wolf(root, wolfPosX, wolfPosY);
        smooth=false;
        smoothText.setText(String.valueOf(smooth));
        wolf.buildWolf();
        rebuiltPane(root);

        //pane.getStylesheets().addAll(this.getClass().getResource("../resources/style.css").toExternalForm());

        pane.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                int pointPosX=(int)window.getWidth()/2+POSX;
                int pointPosY=(int)window.getHeight()/2+POSY;
                if(wolf.getClickedPoint()!=null || wolf.getClickedAdditionalPoint()!=null){
                    shiftPoint(event, pointPosX, pointPosY);
                }else {
                    wolf.pointOnWolf(event.getX()-pointPosX,event.getY()-pointPosY);
                    wolf.additionalPointOnWolf(event.getX()-pointPosX,event.getY()-pointPosY);
                }
            }
        });

        slider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                turningIntoNewProcess(newValue.doubleValue()/100);
            }
        });
    }

    private void shiftPoint(MouseEvent event, int pointPosX, int pointPosY) {
        wolf.changePoint(event.getX()-pointPosX,event.getY()-pointPosY);
        Group root = new Group();
        buildCoordinates(root, wolfPosX, wolfPosY);
        wolf.setGroup(root);
        wolf.drawWolf();
        rebuiltPane(root);
        wolf.setClickedPoint(null);
        wolf.setClickedAdditionalPoint(null);
    }


    private void turningIntoNewProcess(double coef){

        Group root = new Group();
        buildCoordinates(root, wolfPosX, wolfPosY);
        wolf.setGroup(root);
        wolf.turnIntoNew(coef);
        rebuiltPane(root);
    }

    public boolean smooth(){
        smooth=(!smooth);
        wolf.setSmooth(smooth);
        smoothText.setText(String.valueOf(smooth));
        return smooth;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void buildFractal(){
        Group root = new Group();
        initStartPos((int) window.getWidth() / 2 + POSX, (int) window.getHeight() / 2 + POSY);
        buildCoordinates(root, figurePosX, figurePosY);
        Fractal fractal=new Fractal(root,figurePosX, figurePosY);
        fractal.setStartValues(Integer.parseInt(lengthKoha.getText()));
        fractal.buildFractal(Integer.parseInt(iteration.getText()));
        rebuiltPane(root);
    }

}


