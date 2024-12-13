/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectomd;


import com.mycompany.proyectomd.App;
import com.mycompany.proyectomd.App;

import com.mycompany.proyectomd.VistaPersonajeController;
import com.mycompany.proyectomd.VistaPersonajeController;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;

import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import modelo.Lector;
/**
 * FXML Controller class
 *
 * @author Det-Pc
 */
public class Nivel6Controller implements Initializable {


    @FXML
    private ImageView imgBatman1;
    @FXML
    private ImageView imgSpiderman1;
    @FXML
    private TextField txtSpiderman;
    @FXML
    private ImageView imgSuperman1;
    @FXML
    private TextField txtSuperman;
    @FXML
    private ImageView imgIronman;
    @FXML
    private TextField txtIronman;
    @FXML
    private ImageView imgThor;
    @FXML
    private TextField txtThor;
    @FXML
    private ImageView imgBatman11;
    @FXML
    private ImageView imgSpiderman11;
    @FXML
    private ImageView imgSuperman11;
    @FXML
    private ImageView imgIronman1;
    @FXML
    private ImageView imgThor1;
    @FXML
    private TextField txtBatman;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        llenarCampos();
        preCambio();
    }    
    
    @FXML
    private void switchToResultado6(ActionEvent event) throws IOException {
        Resultado6Controller.totalPuntos = comprobarResultados();
        App.setRoot("resultado6");
    }
    
    
    private void llenarCampos(){
        cargarImagen("superman.jpg", imgSuperman1);
        cargarImagen("superman.jpg", imgSuperman11);
        cargarImagen("spiderman.jpg", imgSpiderman1);
        cargarImagen("spiderman.jpg", imgSpiderman11);
        cargarImagen("batman.jpg", imgBatman1);
        cargarImagen("batman.jpg", imgBatman11);
        cargarImagen("thor.jpg", imgThor);
        cargarImagen("thor.jpg", imgThor1);
        cargarImagen("ironman.jpg", imgIronman);
        cargarImagen("ironman.jpg", imgIronman1);
    }
    
    
    private void cargarImagen(String ruta,ImageView contenedor){
        try (FileInputStream input = new FileInputStream(App.pathImg + ruta)) {
            Image image = new Image(input,500,500,false,false);
            contenedor.setImage(image);

        } catch (IOException e) {
            System.out.println("No se encuentra la imagen");
        }

    }
    
    
    
    private void cambiarDeVentana(){
        try {
            //muestra una nueva ventana para poder actualizar el stock de cualquier producto
            Stage st = new Stage();
            st.setTitle("Detalle");
            FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("vistaPersonaje.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            st.setScene(scene);
            st.show();
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    
    
    private void preCambio(){
        imgIronman1.setOnMouseClicked(eh->{
            VistaPersonajeController.personaje = Lector.generarTarjetas().get(3);
            cambiarDeVentana();
        });
        imgBatman11.setOnMouseClicked(eh->{
            VistaPersonajeController.personaje = Lector.generarTarjetas().get(0);
            cambiarDeVentana();
        });
        
        imgThor1.setOnMouseClicked(eh->{
            VistaPersonajeController.personaje = Lector.generarTarjetas().get(4);
            cambiarDeVentana();
        });
        imgSpiderman11.setOnMouseClicked(eh->{
            VistaPersonajeController.personaje = Lector.generarTarjetas().get(1);
            cambiarDeVentana();
        });
        imgSuperman11.setOnMouseClicked(eh->{
            VistaPersonajeController.personaje = Lector.generarTarjetas().get(2);
            cambiarDeVentana();
        });
    }
    
    
    private int comprobarSpiderman(String entrada){
        String[] respuestas =entrada.split(",");
        int resultado=0;
        int r1=0;
        int r2=0;
        int r3 = 0;
        int r4=0;
        int r5=0;
        for(String respuesta:respuestas){
            if(respuesta.trim().toUpperCase().equals("SPIDERMAN") || respuesta.trim().toUpperCase().equals("SPIDER MAN") || respuesta.trim().toUpperCase().equals("SPIDER-MAN")){
                r1=1;
            }
            if(respuesta.trim().toUpperCase().equals("SUPERMAN")){
                r2=1;
            }
            if(respuesta.trim().toUpperCase().equals("THOR")){
                r3=1;
            }
            if(respuesta.trim().toUpperCase().equals("IRONMAN") || respuesta.trim().toUpperCase().equals("IRON-MAN")){
                r4=1;
            }
            if(respuesta.trim().toUpperCase().equals("BATMAN") || respuesta.trim().toUpperCase().equals("BAT-MAN")){
                r5=1;
            }
        }  
        resultado=r1+r2+r3+r4+r5;
        return resultado;
    }
   
   
   private int comprobarIronman(String entrada){
        String[] respuestas =entrada.split(",");
        int resultado=0;
        int r1=0;
        int r2=0;
        int r3 = 0;
        int r4=0;
        for(String respuesta:respuestas){
            if(respuesta.trim().toUpperCase().equals("SUPERMAN")){
                r1=1;
            }
            if(respuesta.trim().toUpperCase().equals("THOR")){
                r2=1;
            }
            if(respuesta.trim().toUpperCase().equals("IRONMAN") || respuesta.trim().toUpperCase().equals("IRON-MAN")){
                r3=1;
            }
            if(respuesta.trim().toUpperCase().equals("BATMAN") || respuesta.trim().toUpperCase().equals("BAT-MAN")){
                r4=1;
            }
        }  
        resultado=r1+r2+r3+r4;
        return resultado;
    }
    
   
   private int comprobarBatman(String entrada){
        String[] respuestas =entrada.split(",");
        int resultado=0;
        int r1=0;
        int r2=0;
        int r3 = 0;
        for(String respuesta:respuestas){
            if(respuesta.trim().toUpperCase().equals("SUPERMAN")){
                r1=1;
            }
            if(respuesta.trim().toUpperCase().equals("THOR")){
                r2=1;
            }
            if(respuesta.trim().toUpperCase().equals("BATMAN") || respuesta.trim().toUpperCase().equals("BAT-MAN")){
                r3=1;
            }
        }  
        resultado=r1+r2+r3;
        return resultado;
    }
   private int comprobarThor(String entrada){
        String[] respuestas =entrada.split(",");
        int resultado=0;
        int r1=0;
        int r2=0;
        for(String respuesta:respuestas){
            if(respuesta.trim().toUpperCase().equals("SUPERMAN")){
                r1=1;
            }
            if(respuesta.trim().toUpperCase().equals("THOR")){
                r2=1;
            }
        }  
        resultado=r1+r2;
        return resultado;
    }
   
   private int comprobarSuperman(String entrada){
        String[] respuestas =entrada.split(",");
        int resultado=0;
        int r1=0;
        for(String respuesta:respuestas){
            if(respuesta.trim().toUpperCase().equals("SUPERMAN")){
                r1=1;
            }
        }  
        resultado=r1;
        return resultado;
    }
   
   
   private int comprobarResultados(){
       return comprobarSpiderman(txtSpiderman.getText())+comprobarBatman(txtBatman.getText())+
               comprobarIronman(txtIronman.getText())+comprobarSuperman(txtSuperman.getText())+
               comprobarThor(txtThor.getText());
   }
    

}
