/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.welleats;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author lacab
 */
public class InicioController implements Initializable {

    @FXML
    private ImageView iv_welleats;
    @FXML
    private Button bt_registrarse;
    @FXML
    private Button bt_iniciarsesion;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        //Image img = new Image(App.pathImg + "welleats.png");
        //iv_welleats.setImage(img);
        /*
        try (FileInputStream fis = new FileInputStream(App.pathImg + "welleats.png")) {
            Image foto = new Image(fis);
            iv_welleats = new ImageView(foto);
        } catch (IOException e) {
            System.out.println("No se encuentra la imagen");
        }
    }
         */
        

    }
    
    @FXML
    private void registrarse(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("registro.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
}
