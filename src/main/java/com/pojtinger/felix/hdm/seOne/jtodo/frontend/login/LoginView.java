package com.pojtinger.felix.hdm.seOne.jtodo.frontend.login;

import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class LoginView {
    private final LoginController controller;
    private final LoginModel model;

    private BorderPane view;

    public LoginView(LoginController controller, LoginModel model) {
        this.controller = controller;
        this.model = model;

        this.initialize();
    }

    private void initialize() {
        this.view = new BorderPane();

        var vbox = new VBox();
        vbox.setAlignment(Pos.CENTER);

        var usernameField = new TextField("Username");
        usernameField.setMaxWidth(400);

        vbox.getChildren().add(usernameField);

        this.view.setCenter(vbox);
    }

    public Parent asParent() {
        return view;
    }
}