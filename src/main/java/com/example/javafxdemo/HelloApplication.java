package com.example.javafxdemo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // fetch the parent resource, in this case it is a vbox
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        // create a scene with the parent resource (vbox)
        Scene scene = new Scene(fxmlLoader.load(), 500, 700);
        // set the title of the stage
        stage.setTitle("This is my demo - Woo Hoo");
        // add scene to stage
        stage.setScene(scene);
        // display stage
        stage.show();
    }

    public static void main(String[] args)
    {
        launch();
    }
}
