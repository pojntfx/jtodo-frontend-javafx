package com.pojtinger.felicitas.hdm.seOne.jtodo.frontend;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;
import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.ui.FXGLButton;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        var subStage = new Stage();

        GameApplication.customLaunch(new GameApp(), subStage);

        var scene = new Scene(FXMLLoader.load(getClass().getResource("todos/TodosView.fxml")));
        scene.getStylesheets().add(getClass().getResource("ApplicationStyles.css").toExternalForm());

        primaryStage.setTitle("JTodo");
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static class GameApp extends GameApplication {
        @Override
        protected void initSettings(GameSettings settings) {
        }

        @Override
        protected void initGame() {
            FXGL.entityBuilder().at(200, 200).view(new Circle(15, Color.BLUE)).buildAndAttach();
        }

        @Override
        protected void initUI() {
            Button btn = new FXGLButton("HELLO");

            btn.setOnAction(e -> {
                FXGL.getGameWorld().getEntities().get(0).translate(5, 5);

                FXGL.getEventBus().fireEvent(new InteropEvent(InteropEvent.ANY));
            });

            FXGL.addUINode(btn, 100, 100);
        }
    }
}