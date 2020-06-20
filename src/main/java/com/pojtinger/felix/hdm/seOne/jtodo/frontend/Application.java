package com.pojtinger.felicitas.hdm.seOne.jtodo.frontend;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        var scene = new Scene(FXMLLoader.load(getClass().getResource("login/LoginView.fxml")));
        scene.getStylesheets().add(getClass().getResource("ApplicationStyles.css").toExternalForm());

        primaryStage.setTitle("JTodo");
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}