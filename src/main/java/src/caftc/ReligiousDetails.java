package src.caftc;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ResourceBundle;

public class ReligiousDetails implements Initializable {

    @FXML
    private Button Btn_Back;
    @FXML
    private Button Btn_Submit;
    @FXML
    private RadioButton Rb_B_No;

    @FXML
    private RadioButton Rb_B_Yes;

    @FXML
    private ComboBox<String > cmd_ReligConversion;

    @FXML
    private TextField tfd_B_Dob;

    @FXML
    private TextField tfd_ChBap;

    @FXML
    private TextField tfd_CuChName;
    @FXML
    private Label lb_message;

    @FXML
    private TextField tfd_CuPasName;

    @FXML
    private TextField tfd_IFOreligious;

    @FXML
    private TextField tfd_NfLchurch;

    @FXML
    private Label lb_View;

    @FXML
    private TextField tfd_OldNfPastor;

    @FXML
    private TextField tfd_RfLeaving;


    @FXML
    private TextField tfd_YiPrevChurch;

    @FXML
    private TextField tfd_noChAttended;

    @FXML
    void toBack(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("FamilyBackground.fxml"));
        Stage window = (Stage) Btn_Back.getScene().getWindow();
        window.setScene(new Scene(root));
        window.show();
    }

    public void RadioSelect(ActionEvent event){
        String Baptized ="";
        if (Rb_B_No.isSelected()){
            Baptized += Rb_B_No.getText() + "\n";
        }
        if (Rb_B_Yes.isSelected()){
            Baptized += Rb_B_Yes.getText() + "\n";
        }
        lb_message.setText(Baptized);

    }


    public void religiousdetails() {
        DBAccess connect = new DBAccess();
        Connection conn = connect.getConnection();


         String B_Dob=tfd_B_Dob.getText();
         String ChBap=tfd_ChBap.getText();
         String CuChName=tfd_CuChName.getText();
         String CuPasName=tfd_CuPasName.getText();
         String OtherReligious=tfd_IFOreligious.getText();
         String NameOfLastChurch=tfd_NfLchurch.getText();
         String OldNfPastor=tfd_OldNfPastor.getText();
         String RfLeaving=tfd_RfLeaving.getText();
         String YiPrevChurch=tfd_YiPrevChurch.getText();
         String NoChAttended=tfd_noChAttended.getText();
         String RelConversion=cmd_ReligConversion.getValue();




        String insertFields = "INSERT INTO religiousdetails (RelConversion, OtherReligious, NoChAttended, RfLeaving, NameOfLastChurch, YiPrevChurch, " +
                "OldNPastor, ChBap, B_Dob, CuChName, CuPasName )" +
                " VALUES (' ";
        String insertVales = RelConversion+ "', '" + OtherReligious + "', '" +NoChAttended + "', '" + RfLeaving + "','" +NameOfLastChurch+" ' ,'"+ YiPrevChurch+ "', '"+OldNfPastor+"',  '"+
                ChBap+"', '"+B_Dob+"', '"+CuChName+ "', '"+CuPasName+ "')";
        String insertToDatabase = insertFields + insertVales;

        try {
            Statement statement = conn.createStatement();
            statement.executeUpdate(insertToDatabase);
            lb_View.setText("Successfully added");

            Parent root = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
            Stage window = (Stage) Btn_Submit.getScene().getWindow();
            window.setScene(new Scene(root));
            window.show();


        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }

    }

    @FXML
    void toSubmit(ActionEvent event) {
       if (tfd_B_Dob.getText().isBlank() == false && tfd_NfLchurch.getText().isBlank() == false && tfd_CuPasName.getText().isBlank() == false &&
                tfd_YiPrevChurch.getText().isBlank() == false) {
           religiousdetails();

        } else {
            lb_View.setText("Please Fill in all the required fields");
        }

    }

    @FXML

    public javafx.scene.control.ComboBox<String> getCmd_ReligConversion;
        ObservableList<String> List= FXCollections.observableArrayList("Joe", "Sam", "Frank", "Gyato");


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cmd_ReligConversion.setItems(List);
        cmd_ReligConversion.getValue();

    }
}
