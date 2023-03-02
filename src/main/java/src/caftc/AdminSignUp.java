package src.caftc;


import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;





import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;

public class AdminSignUp {

    @FXML
    private Button Btn_AdmBack;

    @FXML
    private Button Btn_AdmSignUp;

    @FXML
    private TextField tfd_AdmEmail;

    @FXML
    private TextField tfd_AdmName;

    @FXML
    private PasswordField tfd_AdmPass;
    @FXML
    private PasswordField tfd_AdmPasso;
    @FXML
    private Label lb_View;


    @FXML
    void nBack(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Welcome.fxml"));
        Stage window = (Stage) Btn_AdmBack.getScene().getWindow();
        window.setScene(new Scene(root));
        window.show();
    }

    public void administrators() {
        DBAccess connect = new DBAccess();
        Connection conn = connect.getConnection();

        String Full_Name = tfd_AdmName.getText();
        String Email = tfd_AdmEmail.getText();
        String Password_1 = tfd_AdmPass.getText();
        String Password_2 = tfd_AdmPasso.getText();

        String insertFields = "INSERT INTO administrators (Full_Name, Email, Password_1, Password_2)" +
                " VALUES (' ";
        String insertVales = Full_Name + "', '" + Email + "', '" + Password_1 + "', '" + Password_2 + "')";
        String insertToDatabase = insertFields + insertVales;

        try {
            Statement statement = conn.createStatement();
            statement.executeUpdate(insertToDatabase);
            lb_View.setText("Successfully added");

            Parent root = FXMLLoader.load(getClass().getResource("Welcome.fxml"));
            Stage window = (Stage) Btn_AdmSignUp.getScene().getWindow();
            window.setScene(new Scene(root));
            window.show();


        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }

    }

    @FXML
    void onSignUp(ActionEvent event) {
        if (tfd_AdmName.getText().isBlank() == false && tfd_AdmEmail.getText().isBlank() == false && tfd_AdmPass.getText().isBlank() == false &&
                tfd_AdmPass.getText().isBlank() == false) {
            administrators();

        } else {
            lb_View.setText("Please enter valid details");
        }


    }

}



