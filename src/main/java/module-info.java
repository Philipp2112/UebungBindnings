module com.example.uebung230607_1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.uebung230607_1 to javafx.fxml;
    exports com.example.uebung230607_1.view;
    opens com.example.uebung230607_1.view to javafx.fxml;
    exports com.example.uebung230607_1.model;
    opens com.example.uebung230607_1.model to javafx.fxml;
    exports com.example.uebung230607_1;
}