/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectomd;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Stack;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import modelo.Lector;
import modelo.Tarjeta;


public class Nivel1Controller implements Initializable {

    @FXML
    private Label lblTitulo;
    @FXML
    private Button btnComprobarRelacion;
    private FlowPane root;
    @FXML
    private ScrollPane scrollPane1;
    @FXML
    private ScrollPane scrollPane2;
    private AnchorPane anchorPane1;
    private AnchorPane anchorPane2;
    @FXML
    private FlowPane fp1;
    @FXML
    private FlowPane fp2;
    @FXML
    private ImageView imgBatman1;
    @FXML
    private TextField txtBatman;
    @FXML
    private ImageView imgSpiderman1;
    @FXML
    private TextField txtSpiderman;
    @FXML
    private ImageView imgSuperman;
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
    private ImageView imgDuende;
    @FXML
    private ImageView imgGorr;
    @FXML
    private ImageView imgGuason;
    @FXML
    private ImageView imgLex;
    @FXML
    private ImageView imgLoki;
    @FXML
    private ImageView imgMrFreeze;
    @FXML
    private ImageView imgVenom;
    @FXML
    private ImageView imgThanos;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lblTitulo.setText("Relaciona a cada héroe con su villano!");
        System.out.println(Lector.generarTarjetas());
        llenarCampos();
        preCambio();
    }    

    @FXML
    private void comprobarResultados(ActionEvent event) throws IOException {

        Resultado1Controller.totalPuntos = comprobarResultadosHeroes();
        System.out.println("RESULTADO NIVEL 1: "+comprobarResultadosHeroes());
        App.setRoot("resultado1");
        
    }
    
    private int comprobarResultadosBatman(String entrada){
        String[] respuestas =entrada.trim().split(",");

        int r1=0;
        int r2=0;
        for(String respuesta:respuestas){
            if(respuesta.trim().toUpperCase().equals("GUASON")){

                r1 = 1;
            }
            if(respuesta.trim().toUpperCase().equals("MR.FREEZE") || respuesta.trim().toUpperCase().equals("MR. FREEZE")||respuesta.trim().toUpperCase().equals("MR FREEZE")){
                r2=1;
            }
        }  

        return r1+r2;
    }
    
    private int comprobarResultadosSuperman(String entrada){
        String[] respuestas =entrada.trim().split(",");
        int r1=0;
        for(String respuesta:respuestas){
            if(respuesta.trim().toUpperCase().equals("LEX LUTHOR") || respuesta.trim().toUpperCase().equals("LEXLUTHOR")){
                r1=1;
            }
        }  

        return r1;
    }
    
    
    private int comprobarSpiderman(String entrada){
        String[] respuestas =entrada.trim().split(",");

        int r1=0;
        int r2=0;
        int r3 = 0;
        for(String respuesta:respuestas){
            if(respuesta.trim().toUpperCase().equals("VENOM")){
                r1=1;
            }
            if(respuesta.trim().toUpperCase().equals("THANOS")){
                r2=1;
            }
            if(respuesta.trim().toUpperCase().equals("DUENDE VERDE")|| respuesta.trim().toUpperCase().equals("DUENDEVERDE")){
                r3=1;
            }
        }  
        
        return r1+r2+r3;
    }
    
    private int comprobarIronman(String entrada){
        String[] respuestas =entrada.trim().split(",");

        int r1=0;
        int r2=0;
        for(String respuesta:respuestas){
            if(respuesta.trim().toUpperCase().equals("THANOS")){
                r1=1;
            }
            if(respuesta.trim().toUpperCase().equals("LOKI")){
                r2=1;
            }
        }  
        

        return r1+r2;
    }
    
    private int comprobarResultadosThor(String entrada){
        String[] respuestas =entrada.trim().split(",");

        int r1=0;
        int r2=0;
        for(String respuesta:respuestas){
            if(respuesta.trim().toUpperCase().equals("THANOS")){
                r1=1;
            }
            if(respuesta.trim().toUpperCase().equals("GORR")){
                r2=1;
            }
        }
        return r1+r2;
    }
    
    
    
    private void llenarCampos(){
        cargarImagen("batman.jpg", imgBatman1);
        cargarImagen("superman.jpg", imgSuperman);
        cargarImagen("spiderman.jpg", imgSpiderman1);
        cargarImagen("thor.jpg", imgThor);
        cargarImagen("ironman.jpg", imgIronman);
        cargarImagen("gorr.jpg", imgGorr);
        cargarImagen("duendeverde.jpg", imgDuende);
        cargarImagen("thanos.jpg", imgThanos);
        cargarImagen("venom.jpg", imgVenom);
        cargarImagen("mrfreeze.jpg", imgMrFreeze);
        cargarImagen("loki.jpg", imgLoki);
        cargarImagen("lexluthor.jpg", imgLex);
        cargarImagen("guason.jpg", imgGuason);


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
        imgDuende.setOnMouseClicked(eh->{
            VistaPersonajeController.personaje = Lector.generarTarjetas().get(10);
            cambiarDeVentana();
        });
        imgGuason.setOnMouseClicked(eh->{
            VistaPersonajeController.personaje = Lector.generarTarjetas().get(5);
            cambiarDeVentana();
        });
        
        imgLex.setOnMouseClicked(eh->{
            VistaPersonajeController.personaje = Lector.generarTarjetas().get(6);
            cambiarDeVentana();
        });
        imgMrFreeze.setOnMouseClicked(eh->{
            VistaPersonajeController.personaje = Lector.generarTarjetas().get(12);
            cambiarDeVentana();
        });
        imgThanos.setOnMouseClicked(eh->{
            VistaPersonajeController.personaje = Lector.generarTarjetas().get(7);
            cambiarDeVentana();
        });
        imgVenom.setOnMouseClicked(eh->{
            VistaPersonajeController.personaje = Lector.generarTarjetas().get(8);
            cambiarDeVentana();
        });
        imgGorr.setOnMouseClicked(eh->{
            VistaPersonajeController.personaje = Lector.generarTarjetas().get(11);
            cambiarDeVentana();
        });
        imgLoki.setOnMouseClicked(eh->{
            VistaPersonajeController.personaje = Lector.generarTarjetas().get(9);
            cambiarDeVentana();
        });
    }
    

    
    
    private int comprobarResultadosHeroes() {
        int resultado=0;
        resultado = comprobarIronman(txtIronman.getText())+comprobarResultadosBatman(txtBatman.getText())+
                comprobarResultadosSuperman(txtSuperman.getText())+comprobarSpiderman(txtSpiderman.getText())+comprobarResultadosThor(txtThor.getText());
        return resultado;
    }

}
