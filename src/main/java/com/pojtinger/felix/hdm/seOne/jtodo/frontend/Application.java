package com.pojtinger.felix.hdm.seOne.jtodo.frontend;

import com.pojtinger.felix.hdm.seOne.jtodo.frontend.login.LoginController;
import com.pojtinger.felix.hdm.seOne.jtodo.frontend.login.LoginModel;
import com.pojtinger.felix.hdm.seOne.jtodo.frontend.login.LoginView;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        var loginModel = new LoginModel();
        var loginController = new LoginController(loginModel);
        var loginView = new LoginView(loginController, loginModel);

        var loginScene = new Scene(loginView.asParent(), 600, 400);

        primaryStage.setScene(loginScene);
        primaryStage.setTitle("JTodo");

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}