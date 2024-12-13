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
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import modelo.Tarjeta;

public class VistaPersonajeController implements Initializable {
    boolean fin = false;

    @FXML
    public Label lblTitulo;
    @FXML
    private ImageView imgview;
    
    public static Tarjeta personaje;
    @FXML
    private Label lblNombre;
    @FXML
    private Label lblEdad;
    private Label lblAmigos;
    @FXML
    private Label lblEnemigos;
    @FXML
    private Label lblCabello;
    private Label lblGustos;
    private Label lblDatos;
    @FXML
    private Label gustos;
    @FXML
    private Label lblEstatura;
    @FXML
    private Label lblPoderes;
    @FXML
    private Label estatura;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        if(personaje!=null){
            lblTitulo.setText("");

            cargarImagen(personaje.getImagen());
            llenarCampos();
            countdown(lblTitulo);
            
            
        }else{
            System.out.println("El personaje no se ha inicializado");
        }
    }    
    
    
    
    private void cargarImagen(String ruta){
        try (FileInputStream input = new FileInputStream(App.pathImg + ruta)) {
            Image image = new Image(input,500,500,false,false);
            imgview.setImage(image);

        } catch (IOException e) {
            System.out.println("No se encuentra la imagen");
        }

    }
    
    
    private void llenarCampos(){
        lblNombre.setText(personaje.getNombrePersonaje());
        lblEdad.setText(String.valueOf(personaje.getEdad()));
        
        lblEnemigos.setText(personaje.getEnemigos().toString());
        lblCabello.setText(personaje.getColorCabello());
        lblPoderes.setText(personaje.getPoderes().toString());
        /*
        Duende verde 1,8 , Guason 1,82, Lex Luthor 1,90, Mr Freeze 1,83, Thanos  2,62, Gorr 1,60
        */
        if(personaje.getNombrePersonaje().equalsIgnoreCase("duende verde")){
            lblEstatura.setText("1.80 metros");
        }else if(personaje.getNombrePersonaje().equalsIgnoreCase("guason")){
            lblEstatura.setText("1.82 metros");
        }else if(personaje.getNombrePersonaje().equalsIgnoreCase("lex luthor")){
            lblEstatura.setText("1.90 metros");
        }else if(personaje.getNombrePersonaje().equalsIgnoreCase("mr freeze")){
            lblEstatura.setText("1.83 metros");
        }else if(personaje.getNombrePersonaje().equalsIgnoreCase("thanos")){
            lblEstatura.setText("2.62 metros");
        }else if(personaje.getNombrePersonaje().equalsIgnoreCase("gorr")){
            lblEstatura.setText("1.60 metros");
        }else if(personaje.getNombrePersonaje().equalsIgnoreCase("batman")){
            lblEstatura.setText("1.88 metros");
        }else if(personaje.getNombrePersonaje().equalsIgnoreCase("super-man")){
            lblEstatura.setText("1.91 metros");
        }else if(personaje.getNombrePersonaje().equalsIgnoreCase("spider-Man")){
            lblEstatura.setText("1.70 metros");
        }else if(personaje.getNombrePersonaje().equalsIgnoreCase("iron-man")){
            lblEstatura.setText("1.74 metros");
        }else if(personaje.getNombrePersonaje().equalsIgnoreCase("thor")){
            lblEstatura.setText("1.90 metros");
        }else{
            estatura.setVisible(false);
            lblEstatura.setVisible(false);
        }

    }
    
    
    
    public void countdown(Label label){
        
        Thread hilo = new Thread(new Runnable(){
            @Override
            public void run(){
                for(int i=5; i>=0; i--){
                    int valor = i;
                    try {
                        Thread.sleep(1000);
                        Platform.runLater(new Runnable(){
                            @Override
                            public void run(){
                                label.setText("Tiempo restante: "+String.valueOf(valor) + " segundos");
                            }
                        });
                        
                    } catch (InterruptedException ex) {
                        
                    }
                    if(valor==0){
                        final Stage stage = (Stage) label.getScene().getWindow();

                        Platform.runLater(new Runnable() {
                            @Override
                            public void run() {
                                stage.close();
                            }
                        });   
                    }

                }
            }
            
        });
        hilo.setDaemon(true);
        hilo.start();
        


        

        
    }
    
}
