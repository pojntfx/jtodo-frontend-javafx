package com.pojtinger.felicitas.hdm.seOne.jtodo.frontend.todos;

import java.util.ArrayList;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class TodosModel {
    public StringProperty newTodoTitle = new SimpleStringProperty();

    public void setNewTodoTitle(String title) {
        this.newTodoTitle.set(title);
    }

    // private ArrayList<String> todos = new ArrayList<String>();

    // public void createTodo(String title) {
    // this.todos.add(title);
    // }
}