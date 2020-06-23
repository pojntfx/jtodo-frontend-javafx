package com.pojtinger.felicitas.hdm.seOne.jtodo.frontend.todos;

import javafx.scene.layout.BorderPane;

public class TodosView {
    private TodosModel model;
    private TodosController controller;

    public BorderPane root;

    public TodosView(TodosModel model, TodosController controller) {
        this.model = model;
        this.controller = controller;

        this.root = new BorderPane();
    }
}