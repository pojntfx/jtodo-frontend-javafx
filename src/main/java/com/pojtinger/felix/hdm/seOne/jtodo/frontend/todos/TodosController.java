package com.pojtinger.felicitas.hdm.seOne.jtodo.frontend.todos;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class TodosController {
    TodosModel todosModel = new TodosModel();

    @FXML
    ListView<String> todosList;

    @FXML
    TextField createTodoTitleTextField;

    @FXML
    Button createTodoButton;

    public void handleCreateTodoButtonClick(ActionEvent event) {
        var newTodoTitle = this.createTodoTitleTextField.getText();

        if (!newTodoTitle.isEmpty()) {
            this.todosList.getItems().add(newTodoTitle);

            this.createTodoTitleTextField.clear();

            this.createTodoTitleTextField.requestFocus();
        }
    }

    public void handleCreateTodoTitleTextFieldChange(KeyEvent event) {
        System.out.printf("New todo title: %s\n", this.createTodoTitleTextField.getText());
    }
}