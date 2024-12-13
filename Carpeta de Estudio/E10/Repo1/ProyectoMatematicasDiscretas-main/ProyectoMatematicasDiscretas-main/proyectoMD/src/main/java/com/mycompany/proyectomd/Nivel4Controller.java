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
public class Nivel4Controller implements Initializable {


    @FXML
    private ImageView imgIronman1;
    @FXML
    private TextField txtIronman;
    @FXML
    private ImageView imgBatman1;
    @FXML
    private TextField txtBatman;
    @FXML
    private ImageView imgSpiderman1;
    @FXML
    private TextField txtSpiderman;
    @FXML
    private ImageView imgSuperman1;
    @FXML
    private TextField txtSuperman;
    @FXML
    private ImageView imgLoki1;
    @FXML
    private TextField txtLoki;
    @FXML
    private ImageView imgIronman2;
    @FXML
    private ImageView imgBatman2;
    @FXML
    private ImageView imgSpiderman2;
    @FXML
    private ImageView imgSuperman2;
    @FXML
    private ImageView imgLoki2;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        llenarCampos();
        preCambio();
        
        System.out.println(Lector.generarTarjetas());
    }    


    
    
    
    
    private void llenarCampos(){
        cargarImagen("superman.jpg", imgSuperman1);
        cargarImagen("superman.jpg", imgSuperman2);
        cargarImagen("spiderman.jpg", imgSpiderman1);
        cargarImagen("spiderman.jpg", imgSpiderman2);
        cargarImagen("batman.jpg", imgBatman1);
        cargarImagen("batman.jpg", imgBatman2);
        cargarImagen("loki.jpg", imgLoki1);
        cargarImagen("loki.jpg", imgLoki2);
        cargarImagen("ironman.jpg", imgIronman1);
        cargarImagen("ironman.jpg", imgIronman2);

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
        imgIronman2.setOnMouseClicked(eh->{
            VistaPersonajeController.personaje = Lector.generarTarjetas().get(3);
            cambiarDeVentana();
        });
        imgBatman2.setOnMouseClicked(eh->{
            VistaPersonajeController.personaje = Lector.generarTarjetas().get(0);
            cambiarDeVentana();
        });
        
        imgLoki2.setOnMouseClicked(eh->{
            VistaPersonajeController.personaje = Lector.generarTarjetas().get(9);
            cambiarDeVentana();
        });
        imgSpiderman2.setOnMouseClicked(eh->{
            VistaPersonajeController.personaje = Lector.generarTarjetas().get(1);
            cambiarDeVentana();
        });
        imgSuperman2.setOnMouseClicked(eh->{
            VistaPersonajeController.personaje = Lector.generarTarjetas().get(2);
            cambiarDeVentana();
        });
    }
    
    
 private int comprobarIronman(String entrada){
        String[] respuestas =entrada.split(",");
        int resultado=0;
        int r1=0;
        int r2=0;
        int r3 = 0;
        for(String respuesta:respuestas){
            if(respuesta.trim().toUpperCase().equals("IRONMAN") || respuesta.trim().toUpperCase().equals("IRON-MAN")|| respuesta.trim().toUpperCase().equals("IRON MAN")){
                r3 = 1;
            }
            if(respuesta.trim().toUpperCase().equals("BATMAN")){
                r1=1;
            }
            if(respuesta.trim().toUpperCase().equals("LOKI")){
                r2=1;
            }
        }  
        
        resultado=r1+r2+r3;
        return resultado;
    }
    
    
    private int comprobarBatman(String entrada){
        String[] respuestas =entrada.split(",");
        int resultado=0;
        int r1=0;
        int r2=0;
        int r3 = 0;
        for(String respuesta:respuestas){
            if(respuesta.trim().toUpperCase().equals("IRONMAN") || respuesta.trim().toUpperCase().equals("IRON-MAN") || respuesta.trim().toUpperCase().equals("IRON MAN")){
                r3 = 1;
            }
            if(respuesta.trim().toUpperCase().equals("BATMAN")){
                r1=1;
            }
            if(respuesta.trim().toUpperCase().equals("LOKI")){
                r2=1;
            }
        }  
        
        resultado=r1+r2+r3;
        return resultado;
    }
    
    private int comprobarLoki(String entrada){
        String[] respuestas =entrada.split(",");
        int resultado=0;
        int r1=0;
        int r2=0;
        int r3 = 0;
        for(String respuesta:respuestas){
            if(respuesta.trim().toUpperCase().equals("IRONMAN") || respuesta.trim().toUpperCase().equals("IRON-MAN") || respuesta.trim().toUpperCase().equals("IRON MAN")){
                r3 = 1;
            }
            if(respuesta.trim().toUpperCase().equals("BATMAN")){
                r1=1;
            }
            if(respuesta.trim().toUpperCase().equals("LOKI")){
                r2=1;
            }
        }  
        
        resultado=r1+r2+r3;
        return resultado;
    }
    
    
    private int comprobarSpiderman(String entrada){
        String[] respuestas =entrada.split(",");
        int resultado=0;
        int r1=0;
        int r2=0;
        for(String respuesta:respuestas){
            if(respuesta.trim().toUpperCase().equals("SUPERMAN")){
                r1=1;
            }
            if(respuesta.trim().toUpperCase().equals("SPIDERMAN") || respuesta.trim().toUpperCase().equals("SPIDER MAN") || respuesta.trim().toUpperCase().equals("SPIDER-MAN")){
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
        int r2=0;
        for(String respuesta:respuestas){
            if(respuesta.trim().toUpperCase().equals("SUPERMAN")){
                r1=1;
            }
            if(respuesta.trim().toUpperCase().equals("SPIDERMAN") || respuesta.trim().toUpperCase().equals("SPIDER MAN") || respuesta.trim().toUpperCase().equals("SPIDER-MAN")){
                r2=1;
            }
        } 
        resultado=r1+r2;
        return resultado;
    }
   
       private int comprobarResultados() {
        int resultado=0;
        resultado = comprobarIronman(txtIronman.getText())+
                comprobarSuperman(txtSuperman.getText())+comprobarSpiderman(txtSpiderman.getText())+comprobarLoki(txtLoki.getText())+comprobarLoki(txtBatman.getText());
        return resultado;
    }

    @FXML
    private void switchToResultados4(ActionEvent event) throws IOException {
        
        
        System.out.println("PUNTOS: "+comprobarResultados());
        
        Resultado4Controller.totalPuntos = comprobarResultados();
        App.setRoot("resultado4");
    }

}
