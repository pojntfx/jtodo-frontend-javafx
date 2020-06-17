package com.pojtinger.felicitas.hdm.seOne.jtodo.frontend;

import java.nio.file.Paths;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        var scene = new Scene(FXMLLoader
                .load(Paths.get("src/main/java/com/pojtinger/felicitas/hdm/seOne/jtodo/frontend/todos/TodosView.fxml")
                        .toUri().toURL()));
        scene.getStylesheets()
                .add(Paths.get("src/main/java/com/pojtinger/felicitas/hdm/seOne/jtodo/frontend/ApplicationStyles.css")
                        .toUri().toURL().toExternalForm());

        primaryStage.setTitle("JTodo");
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}