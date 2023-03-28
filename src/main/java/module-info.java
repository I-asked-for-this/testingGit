module com.example.testing0 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.testing0 to javafx.fxml;
    exports com.example.testing0;
}