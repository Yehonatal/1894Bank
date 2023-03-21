package com._1894._1894.Controllers.Client;

import com._1894._1894.Models.Model;
import com._1894._1894.Views.ClientMenuOptions;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class ClientMenuController implements Initializable {
    public Button dashboard_btn;
    public Button transaction_btn;
    public Button accounts_btn;
    public Button profile_btn;
    public Button logout_btn;
    public Button report_btn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addListeners();
    }

    private void addListeners(){
        dashboard_btn.setOnAction(event -> onDashboard());
        transaction_btn.setOnAction(event -> onTransactions());
        accounts_btn.setOnAction(actionEvent -> onAccounts());
    }

    private void onDashboard(){
        Model.getInstance().getViewFactory().getClientSelectorMenuItem().set(ClientMenuOptions.DASHBOARD);
    }
    private void onTransactions(){
        Model.getInstance().getViewFactory().getClientSelectorMenuItem().set(ClientMenuOptions.TRANSACTIONS);
    }
    private void onAccounts(){
        Model.getInstance().getViewFactory().getClientSelectorMenuItem().set(ClientMenuOptions.ACCOUNTS);
    }
}
