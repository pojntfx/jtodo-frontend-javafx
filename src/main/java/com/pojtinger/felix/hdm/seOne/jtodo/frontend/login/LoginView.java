package com.pojtinger.felix.hdm.seOne.jtodo.frontend.login;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class LoginView {
    private final LoginController controller;
    private final LoginModel model;

    private BorderPane view;

    private Label title;

    private TextField usernameField;
    private PasswordField passwordField;

    private Button loginButton;

    public LoginView(LoginController controller, LoginModel model) {
        this.controller = controller;
        this.model = model;

        this.initialize();
    }

    private void initialize() {
        this.view = new BorderPane();

        var vbox = new VBox();
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(8);

        this.usernameField = new TextField();
        this.usernameField.setMaxWidth(400);
        this.usernameField.setPromptText("Username");

        this.passwordField = new PasswordField();
        this.passwordField.setMaxWidth(400);
        this.passwordField.setPromptText("Password");

        this.title = new Label("JTodo");
        this.title.setStyle("-fx-font-size: 4em;");
        this.title.setPadding(new Insets(0, 0, 8, 0));

        var hbox = new HBox();
        hbox.setPrefWidth(Double.MAX_VALUE);
        hbox.setMaxWidth(400);
        hbox.setAlignment(Pos.BASELINE_RIGHT);

        this.loginButton = new Button("Login");
        this.loginButton.setStyle("-fx-base: royalblue;");

        hbox.getChildren().add(this.loginButton);

        vbox.getChildren().addAll(this.title, this.usernameField, this.passwordField, hbox);

        this.view.setCenter(vbox);
    }

    public Parent asParent() {
        return view;
    }
}