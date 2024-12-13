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
public class Cinematica4Controller implements Initializable {


    @FXML
    private Label lblTituloNivel;
    @FXML
    private Button btnJugar;
    @FXML
    private ImageView imgViewPersonaje;
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
    private void nivel4(ActionEvent event) throws IOException {
        App.setRoot("nivel4");
    }
    private void llenarCampos(){
        cargarImagen("thor.jpg");
        lblTextoCinematica.setText("\"Hola humano!\nDeseo que me ayudes con algo.\nVerás, debo saber como puedo relacionar a estos personajes por su color de cabello\nPor ejemplo: Qué vengadores tienen el mismo color de cabello?\nComo sabrás mi cabello es único e increíble, pero debo conocer\ncomo puedo relacionar los cabellos de los demás.\nThor el dios del trueno cuenta contigo!\"");
    }
    
    
    private void cargarImagen(String ruta){
        try (FileInputStream input = new FileInputStream(App.pathImg + ruta)) {
            Image image = new Image(input,500,500,false,false);
            imgViewPersonaje.setImage(image);

        } catch (IOException e) {
            System.out.println("No se encuentra la imagen");
        }

    }

}
