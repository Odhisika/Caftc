package src.caftc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;

public class WorkDetails {
    @FXML
    private Button Btn_Back;

    @FXML
    private Button Btn_Next;

    @FXML
    private TextField tfd_LifeOccupation;

    @FXML
    private TextField tfd_Lofwork;

    @FXML
    private TextField tfd_NofWork;

    @FXML
    private TextField tfd_WorkExperience;

    @FXML
    private TextField tfd_positWork;

    @FXML
    private TextField tfd_wrkOccupation;

    @FXML
    private Label lb_View;

    @FXML
    void toBack(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("EducationalInfo.fxml"));
        Stage window = (Stage) Btn_Back.getScene().getWindow();
        window.setScene(new Scene(root));
        window.show();
    }
    public void workdetails() {
        DBAccess connect = new DBAccess();
        Connection conn = connect.getConnection();

        String LifeOccupation= tfd_LifeOccupation.getText();
        String LofWork=tfd_Lofwork.getText();
        String NofWork=tfd_NofWork.getText();
        String WorkExperience=tfd_WorkExperience.getText();
        String PositWork=tfd_positWork.getText();
        String WrkOccupation=tfd_wrkOccupation.getText();



        String insertFields = "INSERT INTO workdetails (LifeOccupation, LofWork, NofWork, WorkExperience, PositWork," +
                "WrkOccupation)" +" VALUES (' ";

        String insertVales = LifeOccupation+ "', '" + LofWork + "', '" + NofWork + "', '" + WorkExperience+ "','" +
                PositWork + "', '"+WrkOccupation+ "')";
        String insertToDatabase = insertFields + insertVales;

        try {
            Statement statement = conn.createStatement();
            statement.executeUpdate(insertToDatabase);
            lb_View.setText("Successfully added");

            Parent root = FXMLLoader.load(getClass().getResource("FamilyBackground.fxml"));
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
        if (tfd_LifeOccupation.getText().isBlank() == false && tfd_Lofwork.getText().isBlank() == false && tfd_wrkOccupation.getText().isBlank() == false &&
                tfd_WorkExperience.getText().isBlank() == false) {
            workdetails();

        } else {
            lb_View.setText("Please Fill in all the required fields");
        }
    }
}
