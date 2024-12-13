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
public class Resultado6Controller implements Initializable {

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
        lblTotalPuntos.setText("Obtuviste "+totalPuntos+" puntos de un total de 15");
    }    
    
    @FXML
    private void finDelJuego(ActionEvent event) throws IOException {
       //Se cambia a la ventana final
       App.setRoot("finJuego");
        
    }

    private void llenarCampos(){
        cargarImagen("venom.jpg");
        lbl1.setText("\"Esta relación cumple las propiedades para ser reflexiva,ya que por ejemplo:\n Spiderman mide lo mismo que spiderman" +
",transitiva, porque si Spiderman \nes más bajo que Ironman y Ironman  es más bajo que Thor\n entonces spiderman es más bajo que Ironman y finalmente antisimétrica, porque\n" +
"nunca se dará el caso en el que Superman sea más bajo que Batman \npero siempre se dará que Batman sea más bajo que Superman.\n" +
"Cuando una relación cumple con estas 3 propiedades se la conoce como:");
        
        lbl2.setText("RELACIÓN DE ORDEN");
        
        lbl3.setText("\nMuchas gracias por tu ayuda. \"");
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
