module com.example.revist {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.revist to javafx.fxml;
    exports com.example.revist;
}