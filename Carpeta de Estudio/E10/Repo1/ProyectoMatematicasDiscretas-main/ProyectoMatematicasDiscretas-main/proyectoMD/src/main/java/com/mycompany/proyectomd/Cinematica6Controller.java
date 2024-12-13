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
public class Cinematica6Controller implements Initializable {


    @FXML
    private Label lblTituloNivel;
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
    
    @FXML
    private void nivel6(ActionEvent event) throws IOException {
        App.setRoot("nivel6");
    }
    
    
    private void llenarCampos(){
        cargarImagen("venom.jpg");
        lblTextoCinematica.setText("\"Hola humano.\nNecesito tu ayuda!!!.\nDeberás relacionar a estos personajes que te mostraré\npor su altura. Pero ahora debes fijarte en los más bajos.\nDebes ver si el héroe A tiene la misma altura o es más\n bajo que el héroe B. Venom cuenta contigo!\"");
    }
    
    
    private void cargarImagen(String ruta){
        try (FileInputStream input = new FileInputStream(App.pathImg + ruta)) {
            Image image = new Image(input,500,500,false,false);
            imgviewPersonaje.setImage(image);

        } catch (IOException e) {
            System.out.println("No se encuentra la imagen");
        }

    }

}
