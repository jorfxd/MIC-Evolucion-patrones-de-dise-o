module com.mycompany.proyectomd {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.proyectomd to javafx.fxml;
    exports com.mycompany.proyectomd;
}
