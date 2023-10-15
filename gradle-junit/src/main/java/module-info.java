module com.example.gradlejunit {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gradlejunit to javafx.fxml;
    exports com.example.gradlejunit;
}