/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espol.grupo_05;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
/**
 * FXML Controller class
 *
 * @author quint
 */
public class RegistrarUsuarioController implements Initializable {


    @FXML
    private Button botonRegresar;
    @FXML
    private Button botonCrearUsuario;
    @FXML
    private TextField password;
    @FXML
    private TextField name;
    @FXML
    private TextField age;
    @FXML
    private TextField username;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void regresarPrincipal(MouseEvent event) {
    }

    @FXML
    private void guardaUsuario(MouseEvent event) {
    }

}
