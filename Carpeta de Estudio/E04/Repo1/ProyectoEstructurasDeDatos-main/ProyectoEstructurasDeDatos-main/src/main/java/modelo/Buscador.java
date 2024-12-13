/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import TDAs.CircularDoublyLinkedList;
import TDAs.Node;
import TDAs.ArrayList;
import java.util.Date;

/**
 *
 * @author anton
 */
//
public class Buscador {
    //el proceso busca los juegos que contengan la palabra buscada
    public static CircularDoublyLinkedList<Juego> buscarTitulo(CircularDoublyLinkedList<Juego> juegos,String busqueda){
        if(!juegos.isEmpty()){
            CircularDoublyLinkedList<Juego> salida = new CircularDoublyLinkedList<>();
            Node<Juego> juegoac= juegos.getTail() ;
            for(int i = 0 ; i<juegos.size();i++){
                juegoac= juegoac.getNext();
                if(juegoac.getVal().getTitulo().contains(busqueda)){
                    salida.addLast(juegoac.getVal());
                }
            }
            return salida;
        }else{
        return juegos;
        }
    }
    //busca los juegos que se lanzaron en una fecha especifica y los devuelve en la linkedlist
    public static CircularDoublyLinkedList<Juego> buscarLanzamiento(CircularDoublyLinkedList<Juego> juegos,Date busqueda){
        if(!juegos.isEmpty()){
            CircularDoublyLinkedList<Juego> salida = new CircularDoublyLinkedList<>();
            Node<Juego> juegoac= juegos.getTail() ;
            for(int i = 0 ; i<juegos.size();i++){
                juegoac= juegoac.getNext();
                if(juegoac.getVal().getFecha_l()==busqueda){
                    salida.addLast(juegoac.getVal());
                }
            }
            return salida;
        }else{
        return juegos;
        }
    }
    //busca los juegos segun el desarrollador y los devuelve en una litsa circular enlazada
    public static CircularDoublyLinkedList<Juego> buscarDesarrollador(CircularDoublyLinkedList<Juego> juegos,String busqueda){
        if(!juegos.isEmpty()){
            CircularDoublyLinkedList<Juego> salida = new CircularDoublyLinkedList<>();
            Node<Juego> juegoac= juegos.getTail() ;
            for(int i = 0 ; i<juegos.size();i++){
                juegoac= juegoac.getNext();
                if(juegoac.getVal().getDesarrolladores().equals(busqueda)){
                    salida.addLast(juegoac.getVal());
                }
            }
            return salida;
        }else{
        return juegos;
        }
    }
    //busca los juegos que tengan una calificacion igual o mayor al numero buscado
    public static CircularDoublyLinkedList<Juego> buscarCalificacion(CircularDoublyLinkedList<Juego> juegos,int busqueda){
        if(!juegos.isEmpty()){
            CircularDoublyLinkedList<Juego> salida = new CircularDoublyLinkedList<>();
            Node<Juego> juegoac= juegos.getTail() ;
            boolean istop=true;
            for(int i = 0 ; i<juegos.size();i++){
                juegoac= juegoac.getNext();
                ArrayList<Reseña> resenas = juegoac.getVal().getReseñas();
                for(int j = 0 ; j<resenas.size();i++){
                    if(resenas.get(j).getPuntuacion()< busqueda){
                        j=resenas.size();
                        istop=false;
                    }
                }  
                if(istop){
                    salida.addLast(juegoac.getVal());
                }
                istop=true;
            }
            return salida;
        }else{
        return juegos;
        }
    }
    
}

