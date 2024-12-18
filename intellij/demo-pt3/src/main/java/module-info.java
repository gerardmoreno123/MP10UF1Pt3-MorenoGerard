module com.example.demopt3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demopt3 to javafx.fxml;
    exports com.example.demopt3;
}