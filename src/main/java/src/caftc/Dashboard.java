package src.caftc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Dashboard {

    @FXML
    private Button Btn_AddMem;

    @FXML
    private Button Btn_Cellgroups;

    @FXML
    private Button Btn_Finance;

    @FXML
    private Button Btn_VtotMem;

    @FXML
    private Button Btn_dashboard;

    @FXML
    private Button Btn_members;

    @FXML
    private Button Btn_services;

    @FXML
    void toMembersPage(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Members.fxml"));
        Stage window = (Stage) Btn_AddMem.getScene().getWindow();
        window.setScene(new Scene(root));
        window.show();

    }

    @FXML
    void toCellGroups(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Cellgroups.fxml"));
        Stage window = (Stage) Btn_Cellgroups.getScene().getWindow();
        window.setScene(new Scene(root));
        window.show();

    }
    @FXML
    void toServices(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Services.fxml"));
        Stage window = (Stage) Btn_services.getScene().getWindow();
        window.setScene(new Scene(root));
        window.show();

    }
    @FXML
    void toFinance(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Finance.fxml"));
        Stage window = (Stage) Btn_Finance.getScene().getWindow();
        window.setScene(new Scene(root));
        window.show();

    }
    @FXML
    void toAddMem(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("PersonalDetails.fxml"));
        Stage window = (Stage) Btn_AddMem.getScene().getWindow();
        window.setScene(new Scene(root));
        window.show();

    }







}
