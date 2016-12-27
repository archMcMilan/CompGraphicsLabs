package controller;

import d3.Coordinates3D;
import javafx.scene.Group;

/**
 * Created by Artem on 27.12.16.
 */
public class Controller3D {
    public static void buildCoordinates(Group root, int x, int y){
        new Coordinates3D(root,x,y).drawAxis();
    }
}
