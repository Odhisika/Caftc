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
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ResourceBundle;

public class EducationalInfo implements Initializable {

    @FXML
    private RadioButton Rb_Illetereate;

    @FXML
    private RadioButton Rb_Literate;

    @FXML
    private Button Btn_Back;

    @FXML
    private Button Btn_Next;

    @FXML
    private ComboBox<String> cmb_EduLevel;

    @FXML
    private ComboBox<String> cmb_LanExpress;

    @FXML
    private ComboBox<String > cmb_NativeLan;

    @FXML
    private TextField tfd_B_YB;

    @FXML
    private TextField tfd_B_YC;

    @FXML
    private TextField tfd_S_YB;

    @FXML
    private TextField tfd_S_YC;

    @FXML
    private Label lb_message;


    @FXML
    private TextField tfd_T_YB;


    @FXML
    private TextField tfd_T_YC;

    @FXML
    private TextField tfd_otherLang;

    @FXML
    void toBack(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("PhysicalAppearance.fxml"));
        Stage window = (Stage) Btn_Back.getScene().getWindow();
        window.setScene(new Scene(root));
        window.show();
    }

    public void RadioSelect(ActionEvent event){
        String EStatus ="";
        if (Rb_Illetereate.isSelected()){
            EStatus += Rb_Illetereate.getText() + "\n";
        }
        if (Rb_Literate.isSelected()){
            EStatus += Rb_Literate.getText() + "\n";
        }

        lb_message.setText(EStatus);

    }

    public void  educationalinfo() {
        DBAccess connect = new DBAccess();
        Connection conn = connect.getConnection();

        String B_YB=tfd_B_YB.getText();
        String B_YC=tfd_B_YC.getText();
        String S_YB=tfd_S_YB.getText();
        String S_YC=tfd_S_YC.getText();
        String T_YB=tfd_T_YB.getText();
        String T_YC=tfd_T_YC.getText();
        String EStatus=lb_message.getText();
        String EduLevel=cmb_EduLevel.getValue();
        String LanExpression=cmb_LanExpress.getValue();
        String NativeLanguage =cmb_NativeLan.getValue();
        String OtherLan=tfd_otherLang.getText();



        String insertFields = "INSERT INTO educationalinfo (EStatus, EduLevel, B_YB, B_YC, S_YB," +
                "S_YC, T_YB, T_YC, LanExpression, NativeLanguage, OtherLan)" +" VALUES (' ";

        String insertVales = EStatus+ "', '" + EduLevel + "', '" +B_YB + "', '" + B_YC+ "','"
                +S_YB + "', '"+S_YC+"', '"+T_YB+ "','"+T_YC+ "', '"
                +LanExpression+"','"+NativeLanguage+"', '"+OtherLan + "')";
        String insertToDatabase = insertFields + insertVales;

        try {
            Statement statement = conn.createStatement();
            statement.executeUpdate(insertToDatabase);


            Parent root = FXMLLoader.load(getClass().getResource("WorkDetails.fxml"));
            Stage window = (Stage) Btn_Next.getScene().getWindow();
            window.setScene(new Scene(root));
            window.show();


        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }

    }
    @FXML
    void toNext(ActionEvent event) {
        if (tfd_B_YB.getText().isBlank() == false && tfd_S_YB.getText().isBlank() == false && tfd_T_YB.getText().isBlank() == false &&
                Rb_Illetereate.getText().isBlank() == false) {
            educationalinfo();

        } else {

        }


    }
    @FXML
    public ComboBox<String> getCmb_EduLevel;
    ObservableList<String> List= FXCollections.observableArrayList("Joe", "Sam", "Frank", "Gyato");


    @FXML
    public ComboBox<String> getCmb_LanExpress;
    ObservableList<String> Select= FXCollections.observableArrayList("Joe", "Sam", "Frank", "Gyato");



    @FXML
    public javafx.scene.control.ComboBox<String> getCmb_NativeLan;
    ObservableList<String> choose= FXCollections.observableArrayList("Joe", "Sam", "Frank", "Gyato");






    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
         cmb_EduLevel.setItems(List);
         cmb_EduLevel.getValue();

         cmb_NativeLan.setItems(choose);
         cmb_NativeLan.getValue();

         cmb_LanExpress.setItems(Select);
         cmb_LanExpress.getValue();
    }
}
