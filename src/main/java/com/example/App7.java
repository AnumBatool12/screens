package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/*
 * JavaFX App Dashboard for Client
 */
public class App7 extends Application {

    //private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        
        Parent root;
        try{
            root=FXMLLoader.load(getClass().getResource("MainSceneController7.fxml"));

            Scene scene=new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch(IOException e){}
        
    }
 
    public static void main(String[] args) {
        launch();
    }
 
}
