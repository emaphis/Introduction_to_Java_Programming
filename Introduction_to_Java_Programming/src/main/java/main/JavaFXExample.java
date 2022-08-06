/*
 * Let's test JavaFX
 */
package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * JavaFX example
 * @author emaph
 */
public class JavaFXExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a button ans a scene for display
        Button btOk = new Button("Ok");
        Scene scene = new Scene(btOk, 200, 250);

        primaryStage.setTitle("JavaFXExample");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * The main method is only needed for the IDE with limited
     * JavaFX support.Not needed for running from the command line.
     * @param args
     */
    public static void main(String[] args) {
        Application.launch(args);
    }

}
