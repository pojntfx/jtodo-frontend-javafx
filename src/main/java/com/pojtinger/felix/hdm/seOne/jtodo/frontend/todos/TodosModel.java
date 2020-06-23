package com.pojtinger.felicitas.hdm.seOne.jtodo.frontend.todos;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class TodosModel {
    public ObservableList<String> todos = FXCollections.observableArrayList();
    public StringProperty newTodoTitle = new SimpleStringProperty();

    public void setNewTodoTitle(String title) {
        this.newTodoTitle.set(title);
    }

    public void createTodo() {
        this.todos.add(this.newTodoTitle.get());
    }
}