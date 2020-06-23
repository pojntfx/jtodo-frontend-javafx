package com.pojtinger.felicitas.hdm.seOne.jtodo.frontend;

import com.pojtinger.felicitas.hdm.seOne.jtodo.frontend.todos.TodosController;
import com.pojtinger.felicitas.hdm.seOne.jtodo.frontend.todos.TodosModel;
import com.pojtinger.felicitas.hdm.seOne.jtodo.frontend.todos.TodosView;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        var todosModel = new TodosModel();
        var todosController = new TodosController(todosModel);
        var todosView = new TodosView(todosModel, todosController);

        var scene = new Scene(todosView.root, 600, 400);

        primaryStage.setScene(scene);
        primaryStage.setTitle("JTodo");

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}