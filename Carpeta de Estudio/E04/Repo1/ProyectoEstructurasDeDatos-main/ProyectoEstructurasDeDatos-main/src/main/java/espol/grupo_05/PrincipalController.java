/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espol.grupo_05;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author quint
 */
public class PrincipalController implements Initializable {

    @FXML
    private Label usernamePrincipal;
    @FXML
    private Label passwordPrincipal;
    @FXML
    private TextField UsernameFieldPrincipal;
    @FXML
    private TextField passwordFieldPrincipal;
    @FXML
    private Button botonIniciarSesion;
    @FXML
    private Button botonCrearUsuario;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void cambiar(MouseEvent event) throws IOException {
    App.setRoot("catalogo");
    }
    
    
    
}
