package com.pojtinger.felix.hdm.seOne.jtodo.frontend.todos;

import java.net.URL;
import java.util.ResourceBundle;

import com.pojtinger.felix.hdm.seOne.jtodo.frontend.JTodoGrpc.JTodoBlockingStub;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class TodosController implements Initializable {
    TodosModel todosModel = new TodosModel();

    @FXML
    ListView<String> todosList;

    @FXML
    TextField createTodoTitleTextField;

    @FXML
    Button createTodoButton;

    public void handleCreateTodo(ActionEvent event) {
        var newTodoTitle = this.createTodoTitleTextField.getText();

        if (!newTodoTitle.isEmpty()) {
            this.todosList.getItems().add(newTodoTitle);

            this.createTodoTitleTextField.clear();

            this.createTodoTitleTextField.requestFocus();
        }
    }

    public void setClient(JTodoBlockingStub blockingStub) {
        // this.todosModel.setClient(blockingStub);
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        Platform.runLater(() -> this.createTodoTitleTextField.requestFocus());
    }
}