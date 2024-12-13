/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectomd;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
/**
 * FXML Controller class
 *
 * @author Det-Pc
 */
public class Cinematica3Controller implements Initializable {


    private ImageView img;
    private Label lbl;
    @FXML
    private Button btnJugar;
    @FXML
    private ImageView imgviewPersonaje;
    @FXML
    private Label lblTextoCinematica;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        llenarCampos();
    }    
    

    
    private void llenarCampos(){
        cargarImagen("ironman.jpg");
        lblTextoCinematica.setText("\"Hola amigo, necesito tu ayuda para un experimento.\nVerás, necesito revisar la edad de los vengadores para\nsaber que vengador es más viejo que otros vengadores\nUsaré la información que recolectes para crear nuevos trajes.\nCuento contigo amigo!\"");
    }
    
    
    private void cargarImagen(String ruta){
        try (FileInputStream input = new FileInputStream(App.pathImg + ruta)) {
            Image image = new Image(input,500,500,false,false);
            imgviewPersonaje.setImage(image);

        } catch (IOException e) {
            System.out.println("No se encuentra la imagen");
        }

    }

    @FXML
    private void nivel3(ActionEvent event) throws IOException {
        App.setRoot("nivel3");
    }

}
