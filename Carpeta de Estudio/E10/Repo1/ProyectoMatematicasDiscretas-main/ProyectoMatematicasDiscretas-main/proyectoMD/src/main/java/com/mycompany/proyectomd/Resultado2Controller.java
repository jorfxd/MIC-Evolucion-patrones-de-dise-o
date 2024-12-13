/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectomd;

import com.mycompany.proyectomd.App;
import com.mycompany.proyectomd.App;
import com.mycompany.proyectomd.App;
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
public class Resultado2Controller implements Initializable {

    public static int totalPuntos;
    @FXML
    private ImageView imvSpiderman;
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
        lblTotalPuntos.setText("Obtuviste "+totalPuntos+" puntos de un total de 10");
    }    
    
    @FXML
    private void switchToNivel3(ActionEvent event) throws IOException {
        App.setRoot("cinematica3");
    }
    
    private void llenarCampos(){
        cargarImagen("spiderman.jpg");
        lbl1.setText("\"Muchas gracias compañero. Esta información me ayudará mucho.\nAlgo curioso es que la relación se puede aplicar entre los héroes mismos.\nUn spiderman puede trepar muros así como otro spiderman del multiverso!\nEste tipo de relación se conoce como:");
        
        lbl2.setText("REFLEXIVA");
        
        lbl3.setText("Usaremos estos datos para el futuro.\nMuchas gracias por tu ayuda compañero!\"");
    }
    
    
    private void cargarImagen(String ruta){
        try (FileInputStream input = new FileInputStream(App.pathImg + ruta)) {
            Image image = new Image(input,500,500,false,false);
            imvSpiderman.setImage(image);

        } catch (IOException e) {
            System.out.println("No se encuentra la imagen");
        }

    }
}
