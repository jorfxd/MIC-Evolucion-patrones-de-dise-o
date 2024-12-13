/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import TDAs.List;
import javafx.scene.image.Image;

//import javax.swing.ImageIcon;

import TDAs.ArrayList;
import TDAs.CircularDoublyLinkedList;
import java.util.PriorityQueue;
import java.util.Iterator;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;




/**
 *
 * @author Olivier MZ
 */
public class Juego {

    private String Titulo;
    private String Descripcion;
    private ArrayList<Image> Screenshot;

    public enum Genero {
        ACCION, ESTRATEGIA, HORROR, INDIE, DEPORTES, MULTIJUGADOR
    };
    private String Genero;
    private String Desarrolladores;
    private ArrayList<Reseña> Reseñas;
    private Date fecha_l;

    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
    
    

    public Juego(String Titulo, String Descripcion, String genero, ArrayList<Image> Screenshot, String Desarrolladores, String fecha) {
            this.Titulo = Titulo;
            this.Descripcion = Descripcion;
            this.Screenshot = new ArrayList();
            this.Genero=genero;
            this.Desarrolladores = Desarrolladores;
            this.Reseñas = new ArrayList();
        try {
            this.fecha_l = sdf.parse(fecha);
        } catch (ParseException ex) {
           ex.printStackTrace();
        }
        
    }


    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public ArrayList<Image> getScreenshot() {
        return Screenshot;
    }

    public String getDesarrolladores() {
        return Desarrolladores;
    }

    public void setDesarrolladores(String Desarrolladores) {
        this.Desarrolladores = Desarrolladores;
    }

    public ArrayList<Reseña> getReseñas() {
        return Reseñas;
    }

    public Date getFecha_l() {
        return fecha_l;
    }

    public static SimpleDateFormat getSdf() {
        return sdf;
    }

    public void setScreenshot(ArrayList<Image> Screenshot) {
        this.Screenshot = Screenshot;
    }

    public void setReseñas(ArrayList<Reseña> Reseñas) {
        this.Reseñas = Reseñas;
    }

    public void setFecha_l(Date fecha_l) {
        this.fecha_l = fecha_l;
    }

    public static void setSdf(SimpleDateFormat sdf) {
        Juego.sdf = sdf;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(Genero genero) {
        this.Genero = genero.toString();
    }
    
    
}