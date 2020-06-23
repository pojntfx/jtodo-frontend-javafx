package com.pojtinger.felicitas.hdm.seOne.jtodo.frontend.todos;

public class TodosController {
    private TodosModel model;

    public TodosController(TodosModel model) {
        this.model = model;
    }

    public void setNewTodoTitle(String title) {
        this.model.setNewTodoTitle(title);
    }
}