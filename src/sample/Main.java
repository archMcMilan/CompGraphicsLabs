package sample;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Comp Graphics");
        primaryStage.setScene(new Scene(root, 900, 600));
        primaryStage.show();
    }

    protected AnimationTimer at = new AnimationTimer(){
        @Override
        public void handle(long now) {
            at.start();
        }
    };

    public static void main(String[] args) {
        launch(args);
    }
}
