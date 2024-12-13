/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tresenraya;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Kenny
 */
public class FXMLvistaJuegoController {

    private FXMLvistaElegirController controllerWindow2;
    private Stage stage;

    @FXML
    private void showWindow2(ActionEvent event) {
        controllerWindow2.show();
        stage.close();
    }

    void init(Stage stage, FXMLvistaElegirController aThis) {
        this.controllerWindow2 = aThis;
        this.stage = stage;
    }

}
