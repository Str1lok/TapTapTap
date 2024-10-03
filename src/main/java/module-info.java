module com.example.taptaptap {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.taptaptap to javafx.fxml;
    exports com.example.taptaptap;
}