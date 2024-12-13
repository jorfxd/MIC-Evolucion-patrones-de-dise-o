module espol.grupo_05 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    

    opens espol.grupo_05 to javafx.fxml;
    exports espol.grupo_05;
        opens modelo to javafx.base;
}
