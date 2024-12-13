module com.mycompany.g3_proyecto1_contactos {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.g3_proyecto1_contactos to javafx.fxml;
    exports com.mycompany.g3_proyecto1_contactos;
}
