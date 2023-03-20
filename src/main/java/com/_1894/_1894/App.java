package com._1894._1894;

import com._1894._1894.Models.Model;
import javafx.application.Application;
import javafx.stage.Stage;

public class App  extends Application {
    @Override
    public void start(Stage stage){
        Model.getInstance().getViewFactory().showLoginWindow();
    }
}
