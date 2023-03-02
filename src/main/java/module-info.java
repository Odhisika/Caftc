module src.caftc {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens src.caftc to javafx.fxml;
    exports src.caftc;
}