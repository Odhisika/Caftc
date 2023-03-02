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

public class PhysicalAppearance implements Initializable {

    @FXML
    private Button Btn_Back;

    @FXML
    private Button Btn_Next;

    @FXML
    private RadioButton Rb_Female;

    @FXML
    private RadioButton Rb_Male;

    @FXML
    private Label lb_message;

    @FXML
    private ComboBox<String > cmb_MaritalStatus;

    @FXML
    private TextArea ta_NameChildren;

    @FXML
    private TextField tfd_AnySickness;
    @FXML
    private Label lb_View;

    @FXML
    private TextField tfd_CoupleName;

    @FXML
    private TextField tfd_Email;

    @FXML
    private TextField tfd_Healthcare;

    @FXML
    private TextField tfd_NChildren;

    @FXML
    private TextField tfd_Telephone;

    @FXML
    private TextField tfd_appearance;


    @FXML
    void toBack(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("PersonalDetails.fxml"));
        Stage window = (Stage) Btn_Back.getScene().getWindow();
        window.setScene(new Scene(root));
        window.show();
    }


    public void RadioSelect(ActionEvent event){
        String Gender  ="";
        if (Rb_Male.isSelected()){
            Gender += Rb_Male.getText() + "\n";
        }
        if (Rb_Female.isSelected()){
            Gender += Rb_Female.getText() + "\n";
        }
        lb_message.setText(Gender);

    }



    public void pyhsicalappearance() {
        DBAccess connect = new DBAccess();
        Connection conn = connect.getConnection();

        String Healthcare=tfd_Healthcare.getText();
        String AnySickness=tfd_AnySickness.getText();
        String CoupleName=tfd_CoupleName.getText();
        String Email=tfd_Email.getText();
        String NChildren=tfd_NChildren.getText();
        String Telephone=tfd_Telephone.getText();
        String Appearance=tfd_appearance.getText();
        String Gender=lb_message.getText();
        String MaritalStatus=cmb_MaritalStatus.getValue();
        String NameChildren=ta_NameChildren.getText();



        String insertFields = "INSERT INTO physicalappearance (Healthcare, Appearance, AnySickness, Gender, MaritalStatus," +
                "Telephone, Email, CoupleName, NChildren, NameChildren)" +" VALUES (' ";

        String insertVales = Healthcare+ "', '" + Appearance + "', '" + AnySickness + "', '" + Gender+ "','" +
               MaritalStatus + "', '"+Telephone+"', '"+Email + "','"+CoupleName+ "', '"+NChildren+"','"+NameChildren+ "')";
        String insertToDatabase = insertFields + insertVales;

        try {
            Statement statement = conn.createStatement();
            statement.executeUpdate(insertToDatabase);
            lb_View.setText("Successfully added");

            Parent root = FXMLLoader.load(getClass().getResource("EducationalInfo.fxml"));
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
        if (tfd_Healthcare.getText().isBlank() == false && tfd_Email.getText().isBlank() == false && tfd_Telephone.getText().isBlank() == false &&
                ta_NameChildren.getText().isBlank() == false) {
            pyhsicalappearance();

        } else {
            lb_View.setText("Please Fill in all the required fields");
        }






}

    @FXML
    public ComboBox<String> getCmb_MaritalStatus;
    ObservableList<String> List=FXCollections.observableArrayList("Joe", "Sam", "Frank");

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cmb_MaritalStatus.setItems(List);
        cmb_MaritalStatus.getValue();
    }
}



