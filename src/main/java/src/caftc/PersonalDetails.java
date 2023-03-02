package src.caftc;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ResourceBundle;

public class PersonalDetails implements Initializable {


        @FXML
        private Button Btn_Next;
        @FXML
        private Button Btn_Back;

        @FXML
        private ComboBox<String> cmb_ResidentType;

        @FXML
        private TextField tfd_Address;

        @FXML
        private TextField tfd_CResident;

        @FXML
        private TextField tfd_C_Region;

        @FXML
        private TextField tfd_C_city;

        @FXML
        private TextField tfd_CountryName;

        @FXML
        private TextField tfd_Dob;

        @FXML
        private TextField tfd_FName;

        @FXML
        private TextField tfd_H_Region;

        @FXML
        private TextField tfd_H_city;

        @FXML
        private TextField tfd_LName;

        @FXML
        private TextField tfd_MName;

        @FXML
        private TextField tfd_Nationality;

        @FXML
        private TextField tfd_NicName;

        @FXML
        private TextField tfd_OName;

        @FXML
        private TextField tfd_PAddress;

        @FXML
        private TextField tfd_PoBirth;

        @FXML
        private TextField tfd_Region;

        @FXML
        private TextField tfd_Tribe;

        @FXML
        private TextField tfd_Zipcode;


        @FXML
        private TextField tfd_city;
        @FXML
        private Label lb_View;

        @FXML
        private TextField tfd_hometown;


        @FXML
        void toBack(ActionEvent event) throws IOException {
                Parent root = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
                Stage window = (Stage) Btn_Back.getScene().getWindow();
                window.setScene(new Scene(root));
                window.show();
        }


        public void personaldetails() {
                DBAccess connect = new DBAccess();
                Connection conn = connect.getConnection();

                 String Address=tfd_Address.getText();
                 String CResident=tfd_CResident.getText();
                 String C_Region=tfd_C_Region.getText();
                 String C_City=tfd_C_city.getText();
                 String  CountryName=tfd_CountryName.getText();
                 String  Dob=tfd_Dob.getText();
                 String FName=tfd_FName.getText();
                 String H_Region=tfd_H_Region.getText();
                 String  H_City=tfd_H_city.getText();
                 String  LName=tfd_LName.getText();
                 String  MName=tfd_MName.getText();
                 String  NicName=tfd_NicName.getText();
                 String OName =tfd_OName.getText();
                 String  PAddress=tfd_PAddress.getText();
                 String  PoBirth=tfd_PoBirth.getText();
                 String  Region=tfd_Region.getText();
                 String Tribe=tfd_Tribe.getText();
                 String Zipcode=tfd_Zipcode.getText();
                 String City=tfd_city.getText();
                 String  Hometown=tfd_hometown.getText();
                 String Nationality=tfd_Nationality.getText();
                 String ResidentType =cmb_ResidentType.getValue();

                String insertFields = "INSERT INTO personaldetails (FName, MName, LName, OName, NicName, Dob, " +
                        "PoBirth, Region, City, Hometown, H_Region, H_City, Tribe, CResident, C_Region, C_City, " +
                        "Nationality, Zipcode, CountryName, Address, PAddress, ResidentType)" +
                        " VALUES (' ";
                String insertVales = FName+ "', '" + MName + "', '" + LName + "', '" + OName + "','" + NicName+ "', '"+Dob+"', '"+PoBirth+"', '"+Region + "','"+City+ "', '"+Hometown+"','"+H_Region+"', '"+
                H_City+"', '"+Tribe+"', '"+CResident+ "', '"+C_Region+"', '"+C_City+"', '"+Nationality+"', '"+
                Zipcode+"','"+CountryName+"', '"+Address+"', '"+PAddress+ "','"+ResidentType + "')";
                String insertToDatabase = insertFields + insertVales;

                try {
                        Statement statement = conn.createStatement();
                        statement.executeUpdate(insertToDatabase);
                        lb_View.setText("Successfully added");

                        Parent root = FXMLLoader.load(getClass().getResource("PhysicalAppearance.fxml"));
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
                if (tfd_FName.getText().isBlank() == false && tfd_hometown.getText().isBlank() == false && tfd_Tribe.getText().isBlank() == false &&
                        tfd_PAddress.getText().isBlank() == false) {
                        personaldetails();

                } else {
                        lb_View.setText("Please Fill in all the required fields");
                }


        }
        @FXML
        public ComboBox<String> getcmb_ResidentType;
    ObservableList<String> List= FXCollections.observableArrayList("Joe", "Sam", "Frank", "Gyato");

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cmb_ResidentType.setItems(List);
        cmb_ResidentType.getValue();
    }
   // public void ResidentType (ActionEvent event){
     //   lb_ResidentType.setText(cmb_ResidentType.getValue());
   // }
}
