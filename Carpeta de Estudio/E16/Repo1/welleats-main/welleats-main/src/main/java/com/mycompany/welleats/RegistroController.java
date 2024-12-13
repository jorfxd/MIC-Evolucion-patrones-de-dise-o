/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.welleats;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
/**
 * FXML Controller class
 *
 * @author lacab
 */
public class RegistroController implements Initializable {


    @FXML
    private TextField tf_nombres;
    @FXML
    private TextField tf_apellidos;
    @FXML
    private TextField tf_celular;
    @FXML
    private TextField tf_email;
    @FXML
    private DatePicker dp_nacimiento;
    @FXML
    private TextField tf_email1;
    @FXML
    private TextField tf_email2;
    @FXML
    private Button bt_cancelar;
    @FXML
    private Button bt_guardar;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
