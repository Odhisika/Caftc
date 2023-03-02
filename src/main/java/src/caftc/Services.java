package src.caftc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import org.w3c.dom.events.MouseEvent;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;




public class Services {



        @FXML
        private Button btn_Back;


   public  void toBack(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
        Stage window = (Stage) btn_Back.getScene().getWindow();
        window.setScene(new Scene(root));
        window.show();
    }






}
