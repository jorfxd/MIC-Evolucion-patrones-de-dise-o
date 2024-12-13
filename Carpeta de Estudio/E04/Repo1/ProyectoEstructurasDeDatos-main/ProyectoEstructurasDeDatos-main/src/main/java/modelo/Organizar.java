/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import TDAs.*;
import java.util.PriorityQueue;
import java.util.Queue;



/**
 *
 * @author anton
 */
public class Organizar {
    
    //ordena los juegos por orden alfabetico segun el titulo
    public static ArrayList<Juego> organizarJuegos(ArrayList<Juego> juegos){
        if(!juegos.isEmpty()){
            ArrayList<Juego> salida = new ArrayList<>();
            Queue<Juego> orden = new PriorityQueue<>();
            for(int i = 0 ; i<juegos.size();i++){
                orden.add(juegos.get(i));
            }
            for(int i = 0 ; i<juegos.size();i++){
                salida.add(i,orden.remove());
            }
            return salida;
        }else{
            return null;
        }
    }
    
    //ordena las resenas por calificacion
    public static ArrayList<Reseña> organizarCalificacion(ArrayList<Reseña> resenas){
        if(!resenas.isEmpty()){
            ArrayList<Reseña> salida = new ArrayList<>();
            Queue<Reseña> orden = new PriorityQueue<>();
            for(int i = 0 ; i<resenas.size();i++){
                orden.add(resenas.get(i));
            }
            for(int i = 0 ; i<resenas.size();i++){
                salida.add(i,orden.remove());
            }
            return salida;
        }else{
            return null;
        }
    }
    
    //ordena las resenas segun sus fechas
    public static ArrayList<Reseña> organizarFecha(ArrayList<Reseña> resenas){
        if(!resenas.isEmpty()){
            ArrayList<Reseña> salida = new ArrayList<>();
            Queue<Reseña> orden = new PriorityQueue<>();
            for(int i = 0 ; i<resenas.size();i++){
                orden.add(resenas.get(i));
            }
            for(int i = 0 ; i<resenas.size();i++){
                salida.add(i,orden.remove());
            }
            return salida;
        }else{
            return null;
        }
    }
    
}
