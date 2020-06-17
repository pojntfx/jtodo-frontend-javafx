package com.pojtinger.felicitas.hdm.seOne.jtodo.frontend.todos;

import java.net.URL;
import java.util.ResourceBundle;

import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.event.EventBus;
import com.pojtinger.felicitas.hdm.seOne.jtodo.frontend.InteropEvent;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class TodosController implements Initializable {
    TodosModel todosModel = new TodosModel();

    @FXML
    ListView<String> todosList;

    @FXML
    TextField createTodoTitleTextField;

    @FXML
    Button createTodoButton;

    EventBus eventBus;

    public void handleCreateTodoButtonClick(ActionEvent event) {
        var newTodoTitle = this.createTodoTitleTextField.getText();

        if (!newTodoTitle.isEmpty()) {
            this.todosList.getItems().add(newTodoTitle);

            this.createTodoTitleTextField.clear();

            this.createTodoTitleTextField.requestFocus();
        }

        FXGL.getGameWorld().getEntities().get(0).translate(5, 5);

        FXGL.getEventBus().fireEvent(new ActionEvent());
    }

    public void handleCreateTodoTitleTextFieldChange(KeyEvent event) {
        System.out.printf("New todo title: %s\n", this.createTodoTitleTextField.getText());
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        this.eventBus = FXGL.getEventBus();

        this.eventBus.addEventHandler(InteropEvent.ANY, (event) -> {
            System.out.println("Received event");
        });
    }
}