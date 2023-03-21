package com._1894._1894.Controllers.Admin;

import com._1894._1894.Models.Model;
import com._1894._1894.Views.AdminMenuOptions;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class AdminMenuController implements Initializable {
    public Button create_client_btn;
    public Button clients_btn;
    public Button deposit_btn;
    public Button logout_btn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addListeners();
    }

    private void addListeners(){
        create_client_btn.setOnAction(event -> onCreateClient());
        clients_btn.setOnAction(event -> onClients());
        deposit_btn.setOnAction(event -> onDeposit());
    }
    private void onCreateClient(){
        Model.getInstance().getViewFactory().getAdminSelectorMenuItem().set(AdminMenuOptions.CREATECLIENT);
    }
    private void onClients(){
        Model.getInstance().getViewFactory().getAdminSelectorMenuItem().set(AdminMenuOptions.CLIENTS);
    }

    private void onDeposit(){
        Model.getInstance().getViewFactory().getAdminSelectorMenuItem().set(AdminMenuOptions.DEPOSIT);
    }
}
