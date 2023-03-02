package src.caftc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;

public class Finance {

    @FXML
   private Button Btn_Add;

    @FXML
    private Button Btn_Divide;

    @FXML
    private Button Btn_Back;

    @FXML
    private Button Btn_Multiply;

    @FXML
    private Button Btn_Subtract;

    @FXML
    private TextField tfd_date;

    @FXML
    private TextField tfd_foundation;

    @FXML
    private TextField tfd_generalOffering;

    @FXML
    private TextField tfd_thanksGiving;

    @FXML
    private double tfd_tot;


    private double thanksGiving;
    private double generalOffering;
    private double foundation ;
    private double tot;
    FinanceModel model =new FinanceModel ();





    @FXML
    void toBack(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("FamilyBackground.fxml"));
        Stage window = (Stage) Btn_Back.getScene().getWindow();
        window.setScene(new Scene(root));
        window.show();
    }



//        public void Finance() {
//            DBAccess connect = new DBAccess();
//            Connection conn = connect.getConnection();
//        }
//        @FXML
//      public void Add(ActionEvent event){
//            tfd_thanksGiving.getText();
//            tfd_generalOffering.getText();
//            tfd_foundation.getText();
//            tfd_tot=model.Calculate(thanksGiving,generalOffering,foundation ,'+');
//
//      }
//        @FXML
//        public void Multiply(ActionEvent event){
//            tfd_thanksGiving.getText();
//            tfd_generalOffering.getText();
//            tfd_foundation.getText();
//            tfd_tot=model.Calculate(thanksGiving,generalOffering,foundation ,'-');
//
//        }
//
//


}
