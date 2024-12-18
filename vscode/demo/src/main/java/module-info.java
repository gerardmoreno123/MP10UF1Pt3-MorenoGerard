module com.gmoreno {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.gmoreno to javafx.fxml;
    exports com.gmoreno;
}
