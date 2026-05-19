module com.mycompany.javafxapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.javafxapp to javafx.fxml;
    exports com.mycompany.javafxapp;
}
