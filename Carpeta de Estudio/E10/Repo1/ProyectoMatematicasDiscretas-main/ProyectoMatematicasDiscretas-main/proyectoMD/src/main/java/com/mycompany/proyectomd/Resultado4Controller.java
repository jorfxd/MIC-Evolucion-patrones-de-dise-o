/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectomd;

import com.mycompany.proyectomd.App;
import static com.mycompany.proyectomd.Resultado2Controller.totalPuntos;
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
public class Resultado4Controller implements Initializable {

    public static int totalPuntos;
    @FXML
    private ImageView img;
    @FXML
    private Label lbl1;
    @FXML
    private Label lbl2;
    @FXML
    private Label lbl3;
    @FXML
    private Label lblTotalPuntos;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        llenarCampos();
        lblTotalPuntos.setText("Obtuviste "+totalPuntos+" puntos de un total de 13");
    }    
    
    @FXML
    private void switchToCinematica5(ActionEvent event) throws IOException {
        App.setRoot("cinematica5");
    }


    private void llenarCampos(){
        cargarImagen("thor.jpg");
        lbl1.setText("\"Muchas gracias compañero. Esta información me ayudará mucho.\nComo pudiste ver en los primeros ejemplos, esta relación\ncumple con las propiedades de ser simétrica,transitiva y reflexiva\nComo estas 3 propiedades se cumplen\npodemos decir que esta es una relación de:");
        
        lbl2.setText("EQUIVALENCIA");
        
        lbl3.setText("Muchas gracias por tu ayuda compañero!\"");
    }
    
    
    private void cargarImagen(String ruta){
        try (FileInputStream input = new FileInputStream(App.pathImg + ruta)) {
            Image image = new Image(input,500,500,false,false);
            img.setImage(image);

        } catch (IOException e) {
            System.out.println("No se encuentra la imagen");
        }

    }
    
    

}
