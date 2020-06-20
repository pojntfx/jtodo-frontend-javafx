package com.pojtinger.felix.hdm.seOne.jtodo.frontend.login;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController implements Initializable {
    private LoginModel loginModel = new LoginModel();

    @FXML
    TextField apiUrlField;

    @FXML
    TextField usernameField;

    @FXML
    PasswordField passwordField;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Platform.runLater(() -> this.apiUrlField.requestFocus());
    }

    public void handleLogin(ActionEvent event) {
        this.loginModel.login(this.apiUrlField.getText(), this.usernameField.getText(), this.passwordField.getText());
    }
}