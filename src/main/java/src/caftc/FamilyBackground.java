package src.caftc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;

public class FamilyBackground {

    @FXML
    private Button Btn_Back;

    @FXML
    private Button Btn_Next;

    @FXML
    private TextField tfd_F_FName;

    @FXML
    private TextField tfd_F_Hometown;

    @FXML
    private TextField tfd_F_LName;

    @FXML
    private TextField tfd_F_MName;

    @FXML
    private TextField tfd_F_OName;

    @FXML
    private TextField tfd_F_Occupation;

    @FXML
    private TextField tfd_F_Region;

    @FXML
    private TextField tfd_F_Telephone;

    @FXML
    private TextField tfd_F_city;

    @FXML
    private TextField tfd_G_Name;

    @FXML
    private TextField tfd_G_Ocupation;

    @FXML
    private TextField tfd_G_Residence;

    @FXML
    private TextField tfd_G_Telephone;

    @FXML
    private TextField tfd_M_FName;

    @FXML
    private TextField tfd_M_Hometown;

    @FXML
    private TextField tfd_M_LName;

    @FXML
    private TextField tfd_M_MName;

    @FXML
    private TextField tfd_M_OName;

    @FXML
    private Label lb_View;

    @FXML
    private TextField tfd_M_Occupation;

    @FXML
    private TextField tfd_M_Region;

    @FXML
    private TextField tfd_M_Telephone;

    @FXML
    private TextField tfd_M_city;
    @FXML
    void toBack(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("WorkDetails.fxml"));
        Stage window = (Stage) Btn_Back.getScene().getWindow();
        window.setScene(new Scene(root));
        window.show();
    }
    public void familybackground() {
        DBAccess connect = new DBAccess();
        Connection conn = connect.getConnection();

       String F_FName=tfd_F_FName.getText();
       String F_Hometown= tfd_F_Hometown.getText();
       String  F_LName=tfd_F_LName.getText();
       String  F_MName=tfd_F_MName.getText();
       String  F_OName=tfd_F_OName.getText();
       String  F_Occupation=tfd_F_Occupation.getText();
       String  F_Region=tfd_F_Region.getText();
       String  F_Telephone=tfd_F_Telephone.getText();
       String  F_City=tfd_F_city.getText();
       String  G_Name=tfd_G_Name.getText();
       String  G_Occupation=tfd_G_Ocupation.getText();
       String  G_Residence=tfd_G_Residence.getText();
       String  G_Telephone=tfd_G_Telephone.getText();
       String M_FName=tfd_M_FName.getText();
       String  M_Hometown=tfd_M_Hometown.getText();
       String M_LName=tfd_M_LName.getText();
       String M_MName=tfd_M_MName.getText();
       String M_OName=tfd_M_OName.getText();
       String M_Occupation=tfd_M_Occupation.getText();
       String M_Region=tfd_M_Region.getText();
       String M_Telephone=tfd_M_Telephone.getText();
       String M_city=tfd_M_city.getText();




        String insertFields = "INSERT INTO familybackground (F_FName, F_MName, F_LName, F_OName, F_Hometown, F_City, " +
                "F_Region, F_Occupation, F_Telephone, M_FName, M_MName, M_LName, M_OName, M_Hometown, M_Region, M_city, " +
                "M_Occupation, M_Telephone, G_Name, G_Occupation, G_Telephone, G_Residence)" +
                " VALUES (' ";
        String insertVales = F_FName+ "', '" + F_MName + "', '" +F_LName + "', '" + F_OName + "','" +F_Hometown+" ' ,'"+ F_City+ "', '"+F_Region+"', '"+F_Occupation+"', '"+F_Telephone + "','"+M_FName+ "', '"+M_MName+"','"+M_LName+"', '"+
                M_OName+"', '"+M_Hometown+"', '"+M_Region+ "', '"+M_city+"', '"+M_Occupation+"', '"+M_Telephone+"', '"+
                G_Name+"','"+G_Occupation+"', '"+G_Telephone+"', '"+G_Residence+ "')";
        String insertToDatabase = insertFields + insertVales;

        try {
            Statement statement = conn.createStatement();
            statement.executeUpdate(insertToDatabase);
            lb_View.setText("Successfully added");

            Parent root = FXMLLoader.load(getClass().getResource("ReligiousDetails.fxml"));
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
        if (tfd_F_FName.getText().isBlank() == false && tfd_F_city.getText().isBlank() == false && tfd_M_FName.getText().isBlank() == false &&
                tfd_G_Name.getText().isBlank() == false) {
            familybackground();

        } else {
            lb_View.setText("Please Fill in all the required fields");
        }

    }
 }
