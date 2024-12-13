/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tresenraya;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Kenny
 */
public class FXMLvistaElegirController {

    private FXMLvistaPrincipalController controllerWindow1;
    private Stage stage;

    void init(Stage stage, FXMLvistaPrincipalController aThis) {
        this.controllerWindow1 = aThis;
        this.stage = stage;
    }

    @FXML
    private void showWindow3(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/tresenraya/FXMLvistaJuego.fxml"));
        Parent root = loader.load();
        FXMLvistaJuegoController controller = loader.getController();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        controller.init(stage, this);
        stage.show();
        this.stage.close();
    }

    void show() {
        stage.show();
    }
    
    

}
