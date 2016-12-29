package controller;

import d3.Coordinates3D;
import d3.Figure3D;
import javafx.scene.Group;

/**
 * Created by Artem on 27.12.16.
 */
public class Controller3D {
    private  Figure3D figure3D;
    public  void buildCoordinates(Group root, int x, int y){
        new Coordinates3D(root,x,y).drawAxis();
    }

    public  void buildFigure(Group top,Group middle,Group bottom, int posX, int posY){
        figure3D=new Figure3D(top,middle,bottom,posX,posY);
        figure3D.initFigure();
        figure3D.initFigure();
        figure3D.initFigure();
    }

    public  void rotateX(double degree){
        figure3D.rotateX(degree);
    }

    public  void rotateY(double degree){
        figure3D.rotateY(degree);
    }

    public  void rotateZ(double degree){
        figure3D.rotateZ(degree);
    }
}
