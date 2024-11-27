package com.example.p2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
    public static MainApplication instance;
    @Override
    public void start(Stage primarystage) throws IOException {
        instance=this;
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("Utilizator.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        primarystage.setTitle("Utilizator");
        primarystage.setScene(scene);
        primarystage.show();
    }

    public void deschideTraseu()throws IOException{
        FXMLLoader fxmlLoader=new FXMLLoader(MainApplication.class.getResource("Varfuri.fxml"));
        Scene scene=new Scene(fxmlLoader.load(),700,500);
        Stage secondStage=new Stage();
        secondStage.setTitle("Varfuri");
        secondStage.setScene(scene);
        secondStage.show();
    }

    public static MainApplication getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        launch();
    }
}