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

import javafx.scene.control.Label;
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
public class Nivel3Controller implements Initializable {


    @FXML
    private Label lbl;
    @FXML
    private TextField txtHeroe3;
    @FXML
    private TextField txtHeroe4;
    @FXML
    private ImageView imgSpiderman;
    @FXML
    private ImageView imgThor;
    @FXML
    private ImageView imgIronman;
    public static int puntaje;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        llenarCampos();
        preCambio();
    }    

    @FXML
    private void switchToResultados3(ActionEvent event) throws IOException {
        
        
        System.out.println("PUNTOS: "+comprobarRespuestas());
        int r1 = comprobarRespuestas();
        Resultado3Controller.totalPuntos =r1;
        puntaje = comprobarRespuestas();
        System.out.println(Resultado3Controller.totalPuntos);
        System.out.println("TOTAL: "+puntaje);
        App.total = comprobarRespuestas();
        System.out.println("TOTAL2: "+App.total);
        Resultado3Controller.texto = "Obtuviste "+comprobarRespuestas()+" puntos de un total de 3";
        App.setRoot("resultado3");
    }
    
    
    private void llenarCampos(){

        cargarImagen("spiderman.jpg", imgSpiderman);
        cargarImagen("thor.jpg", imgThor);


        cargarImagen("ironman.jpg", imgIronman);

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

        imgSpiderman.setOnMouseClicked(eh->{
            VistaPersonajeController.personaje = Lector.generarTarjetas().get(1);
            cambiarDeVentana();
        });
        
        imgThor.setOnMouseClicked(eh->{
            VistaPersonajeController.personaje = Lector.generarTarjetas().get(4);
            cambiarDeVentana();
        });
        imgIronman.setOnMouseClicked(eh->{
            VistaPersonajeController.personaje = Lector.generarTarjetas().get(3);
            cambiarDeVentana();
        });
    }
    
    
    private int comprobarH1(String entrada){
        String[] respuestas =entrada.split(",");
        int resultado=0;
        int r1=0;
        int r2=0;
        for(String respuesta:respuestas){
            if(respuesta.trim().toUpperCase().equals("SPIDERMAN") || respuesta.trim().toUpperCase().equals("SPIDER MAN") || respuesta.trim().toUpperCase().equals("SPIDER-MAN")){
                r1=1;
            }
            if(respuesta.trim().toUpperCase().equals("THOR")){
                r2=1;
            }
        }
        resultado=r1+r2;
        return resultado; 
    }
    
    private int comprobarH2(String respuesta){
        int resultado=0;
        int r1=0;
            if(respuesta.trim().toUpperCase().equals("SPIDERMAN") || respuesta.trim().toUpperCase().equals("SPIDER MAN") || respuesta.trim().toUpperCase().equals("SPIDER-MAN")){
                r1=1;
            }
        resultado=r1;
        return resultado;
    }
    
    
    
    private int comprobarRespuestas(){
        return comprobarH1(txtHeroe3.getText())+comprobarH2(txtHeroe4.getText());
    }
    
    
    
    
}
