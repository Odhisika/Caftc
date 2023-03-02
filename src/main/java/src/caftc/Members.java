package src.caftc;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Members {

    @FXML
    private Button Btn_Exit;

    @FXML
    private Button Btn_Select;

    @FXML
    private Button Btn_View;

    @FXML
    private TableColumn<?, ?> categoryColumn;

    @FXML
    private TableColumn<?, ?> idColumn;

    @FXML
    private TableColumn<?, ?> nameColumn;

    @FXML
    private TableColumn<?, ?> telephoneColumn;
    @FXML
    private TableView<PersonalModel> tb_View;



    @FXML
    void onExit (ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
        Stage window = (Stage) Btn_Exit.getScene().getWindow();
        window.setScene(new Scene(root));
        window.show();
    }

    @FXML
    void onView (ActionEvent event) {
        loader();
    }

    ObservableList<PersonalModel> PersonalModelObservableList = FXCollections.observableArrayList();
    DBAccess connect = new DBAccess();
    Connection conn = connect.getConnection();

    public void loader() {


        String query = "SELECT * FROM `personaldetails`";

        try {
            Statement statement = conn.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                Integer queryID = resultSet.getInt("ID");
                String queryFName  = resultSet.getString("FName");
                String queryHometown= resultSet.getString("Hometown");
                String queryNationality = resultSet.getString("Nationality");

                PersonalModelObservableList.add(new PersonalModel(queryID,queryFName,queryHometown,queryNationality));

            }

            idColumn.setCellValueFactory(new PropertyValueFactory<>("ID"));
            nameColumn.setCellValueFactory(new PropertyValueFactory<>("FName"));
            telephoneColumn.setCellValueFactory(new PropertyValueFactory<>("Hometown"));
            categoryColumn.setCellValueFactory(new PropertyValueFactory<>("Nationality"));

            tb_View.setItems(PersonalModelObservableList);

        } catch (SQLException e) {
            Logger.getLogger(PersonalDetails.class.getName()).log(Level.SEVERE, null, e);
            e.printStackTrace();
        }
    }




}
