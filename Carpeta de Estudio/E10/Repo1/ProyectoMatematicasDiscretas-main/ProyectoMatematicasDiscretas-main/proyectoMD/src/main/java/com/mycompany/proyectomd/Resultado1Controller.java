/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectomd;

import com.mycompany.proyectomd.App;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
/**
 * FXML Controller class
 *
 * @author Det-Pc
 */
public class Resultado1Controller implements Initializable {
        
    public static int totalPuntos;

    @FXML
    private ImageView imgvPersonaje;
    @FXML
    private Label lblTexto;
    @FXML
    private Label lblRelacion;
    @FXML
    private Label lbl2;
    @FXML
    private Label lblResultado;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        llenarCampos();
        lblResultado.setText("Obtuviste "+totalPuntos+" puntos de un total de 10");
    }    
    
    @FXML
    private void siguienteNivel(ActionEvent event) throws IOException {
        App.setRoot("nuevaCinematica");
    }
    
    private void llenarCampos(){
        cargarImagen("batman.jpg");
        lblTexto.setText("\"Muy buen trabajo amigo. Ahora ya sé a que héroe llamar cuando me enfrente\na un villano.\nComo puedes observar la relación de enemistad funciona en ambos sentidos\nSi Iron man es enemigo de Thanos entonces Thanos es enemigo de Iron man.\nA esto se la llama una relación: ");
        
        lblRelacion.setText("SIMÉTRICA");
        
        lbl2.setText("Este conocimiento te será útil en las siguientes misiones!\"");
    }
    
    
    private void cargarImagen(String ruta){
        try (FileInputStream input = new FileInputStream(App.pathImg + ruta)) {
            Image image = new Image(input,500,500,false,false);
            imgvPersonaje.setImage(image);

        } catch (IOException e) {
            System.out.println("No se encuentra la imagen");
        }

    }
}
