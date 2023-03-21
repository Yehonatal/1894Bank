package com._1894._1894.Controllers.Admin;

import com._1894._1894.Models.Model;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

public class AdminController implements Initializable {
    public BorderPane admin_parent;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Model.getInstance().getViewFactory().getAdminSelectorMenuItem().addListener((observableValue, oldVal, newVal) -> {
            switch (newVal){
                case CLIENTS -> admin_parent.setCenter(Model.getInstance().getViewFactory().getClientsView());
//                case DEPOSIT -> admin_parent.setCenter(Model.getInstance().getViewFactory().getDepositView());
                default -> admin_parent.setCenter(Model.getInstance().getViewFactory().getCreateClientView());

            }
        });
    }
}
