module com.programacion2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.programacion2 to javafx.fxml;
    exports com.programacion2;
}
