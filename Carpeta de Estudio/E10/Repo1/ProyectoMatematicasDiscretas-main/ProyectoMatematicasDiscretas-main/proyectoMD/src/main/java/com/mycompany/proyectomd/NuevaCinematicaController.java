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
import javafx.scene.layout.BorderPane;
/**
 * FXML Controller class
 *
 * @author Det-Pc
 */
public class NuevaCinematicaController implements Initializable {


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
    private void nivel2(ActionEvent event) throws IOException {
        App.setRoot("nivel2");
    }
    
    
    private void llenarCampos(){
        cargarImagen("spiderman.jpg");
        //lblTituloNivel.setText("Spider-Man necesita tu ayuda!");
        lblTextoCinematica.setText("\"Hola compañero, necesito tu ayuda para un reportaje.\nVerás, necesito investigar que héroes tienen poderes en común, como por ejemplo:\nSaber qué superhéroes pueden trepar muros como yo.\nEste trabajo me sería útil para poder apoyar a mis otros compañeros.\nCuento contigo amigo!\"");
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
