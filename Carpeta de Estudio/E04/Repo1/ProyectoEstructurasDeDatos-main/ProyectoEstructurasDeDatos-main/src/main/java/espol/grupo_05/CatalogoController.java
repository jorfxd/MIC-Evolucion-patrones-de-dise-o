/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espol.grupo_05;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Iterator;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import modelo.*;


/*
 * FXML Controller class
 *
 * @author quint
 */
public class CatalogoController implements Initializable {


    @FXML
    private Button btnAnterior;
    @FXML
    private Label labelNombreJuego;
    @FXML
    private Button btnSiguiente;
    @FXML
    private Label cantidadTotal;
    @FXML
    private ImageView imgviewJUEGO;
    @FXML
    private TextField entradaBusqueda;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        mostrarDetalle();
    }    
    
    
    // sacar una para el nodo previo y una para el nodo siguiente
  
    private void mostrarDetalle() {

        //mostrar la foto y nombre del empleado en la seccion derecha
        
        InputStream input = null;
        
   
            // se recorre la lista circular doble

           Iterator<Juego> it = (Iterator<Juego>) GameLoader.cargarJuegos();
//---------------------------------------------------
 
        while(it.hasNext()){
            
        
            try {
           
            String fileName = App.pathImg + it.next().getTitulo() + ".jpg";//armar la ruta de la foto
            System.out.println("actual "+it.next());
            labelNombreJuego.setText(it.next().getTitulo());
            //abrir el stream de la imagen de la persona
            input = App.class.getResource(fileName).openStream();

            //crear la imagen 
            Image image = new Image(input, 100, 100, false, false);
            imgviewJUEGO.setImage(image);
            
            labelNombreJuego.setText(it.next().getTitulo());

        } catch (Exception ex) {
            System.out.println("no se encuentra archivo de imagen");

        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException ex) {
                    System.out.println("no se pudo cerrar");
                }
            }
        }
            
        if (btnSiguiente.getOnAction()!= null )    {
        
        }
        
        }
        }

    @FXML
    private void cambiarPrevious(MouseEvent event) {
        
        
    }

    @FXML
    private void cambiarNext(MouseEvent event){
        
    
        
    
        
        
        
        
    }
        
        
    }

    


