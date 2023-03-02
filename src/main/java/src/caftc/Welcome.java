package src.caftc;

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
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Welcome {

    @FXML
    private Button Btn_Login;

    @FXML
    private Button Btn_Signup;

    @FXML
    private TextField tfd_AdmEmail;

    @FXML
    private PasswordField tfd_AdmPass;
    @FXML
    private Label lb_View;

    @FXML
    void onSignup(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AdminSignUp.fxml"));
        Stage window = (Stage) Btn_Signup.getScene().getWindow();
        window.setScene(new Scene(root));
        window.show();
    }

    @FXML
    void onLogin(ActionEvent event) {

        if (tfd_AdmEmail.getText().isBlank() == false && tfd_AdmPass.getText().isBlank() == false ) {
            register();
        } else {
            lb_View.setText("Please enter valid details");
        }
    }


    public void register() {
        DBAccess connect = new DBAccess();
        Connection conn = connect.getConnection();

        String query = "SELECT * FROM administrators WHERE Email=? AND Password_1=?";

        try {
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1, tfd_AdmEmail.getText());
            pst.setString(2, tfd_AdmPass.getText());
            ResultSet queryResult = pst.executeQuery();
            if (queryResult.next()) {
                Parent root = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
                Stage window = (Stage) Btn_Login.getScene().getWindow();
                window.setScene(new Scene(root));
                window.show();


            }else {
                lb_View.setText("Please valid info *Or Sign up ");
            }

        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }



}
