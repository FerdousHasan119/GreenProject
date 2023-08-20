module com.example.green {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.green to javafx.fxml;
    exports com.example.green;
}