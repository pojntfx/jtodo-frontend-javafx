package com.pojtinger.felicitas.hdm.seOne.jtodo.frontend.todos;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;

public class TodosView {
    private TodosModel model;
    private TodosController controller;

    public BorderPane root;
    private TextField newTodoTitleTextField;
    private Button createTodoButton;

    public TodosView(TodosModel model, TodosController controller) {
        this.model = model;
        this.controller = controller;

        this.root = new BorderPane();
        this.root.setPadding(new Insets(8));

        this.newTodoTitleTextField = new TextField();
        this.newTodoTitleTextField.setPromptText("New todo title");
        HBox.setHgrow(this.newTodoTitleTextField, Priority.ALWAYS);

        this.createTodoButton = new Button("Create todo");

        var toolbar = new HBox(this.newTodoTitleTextField, this.createTodoButton);
        toolbar.setSpacing(8);

        this.root.setTop(toolbar);
    }
}