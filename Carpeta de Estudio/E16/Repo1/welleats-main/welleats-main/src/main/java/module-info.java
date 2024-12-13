module com.mycompany.welleats {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.welleats to javafx.fxml;
    exports com.mycompany.welleats;
}
