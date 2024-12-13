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
public class Resultado3Controller implements Initializable {
    public static int totalPuntos;
    @FXML
    private Label lbl1;
    @FXML
    private Label lbl2;
    @FXML
    private Label lbl3;
    @FXML
    private ImageView img;
    private Label lblTotalPuntos;
    @FXML
    private Label lbT;
    public static String texto;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("--->"+totalPuntos);
        lbT.setText("Obtuviste "+App.total+" puntos de un total de 3");
//lbT.setText(texto);
        llenarCampos();

    }    
    
    @FXML
    private void switchToCinematica4(ActionEvent event) throws IOException {
        App.setRoot("cinematica4");
        
        
        
    }
    private void llenarCampos(){
        cargarImagen("ironman.jpg");
        lbl1.setText("\"Buen trabajo. Al decir que soy más viejo que Thor, y que Thor es más viejo que \nSpiderman, podemos llegar a la conclusión que también soy \nmás viejo que Spiderman. \nEsta relación se conoce como relación:");
        
        lbl2.setText("TRANSITIVA");
        
        lbl3.setText("Vaya, tu si que sabes mucho de números.\n Sigue así y quizás algún día podamos trabajar juntos\nen industrias Stark!\"");
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
