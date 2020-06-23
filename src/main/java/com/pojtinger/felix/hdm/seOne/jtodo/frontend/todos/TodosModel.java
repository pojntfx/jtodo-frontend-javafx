package com.pojtinger.felicitas.hdm.seOne.jtodo.frontend.todos;

import java.util.ArrayList;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class TodosModel {
    private ArrayList<String> todos = new ArrayList<String>();

    public StringProperty newTodoTitle = new SimpleStringProperty();

    public void setNewTodoTitle(String title) {
        this.newTodoTitle.set(title);
    }

    public void createTodo() {
        this.todos.add(this.newTodoTitle.get());
    }
}