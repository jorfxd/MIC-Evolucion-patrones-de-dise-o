
package modelo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;


public class Tarjeta {
    private String nombrePersonaje;
    private String nombre;
    private int edad;
    private int altura;
    private LinkedList<Tarjeta> enemigos;
    private LinkedList<Tarjeta> amigos;
    private String colorCabello;
    private LinkedList<String> poderes;
    private String ciudad;
    private String colorDeOjos;
    private LinkedList<String> gustos;
    private LinkedList<String> caracteristicasExtra;
    private String imagen;

    public String getNombrePersonaje() {
        return nombrePersonaje;
    }

    public void setNombrePersonaje(String nombrePersonaje) {
        this.nombrePersonaje = nombrePersonaje;
    }

    public LinkedList<String> getCaracteristicasExtra() {
        return caracteristicasExtra;
    }

    public void setCaracteristicasExtra(LinkedList<String> caracteristicasExtra) {
        this.caracteristicasExtra = caracteristicasExtra;
    }

    public Tarjeta(String nombrePersonaje, String nombre, int edad, LinkedList<Tarjeta> enemigos, LinkedList<Tarjeta> amigos, String colorCabello, LinkedList<String> poderes, String ciudad, String colorDeOjos, LinkedList<String> gustos) {
        this.nombrePersonaje = nombrePersonaje;
        this.nombre = nombre;
        this.edad = edad;
        this.enemigos = enemigos;
        this.amigos = amigos;
        this.colorCabello = colorCabello;
        this.poderes = poderes;
        this.ciudad = ciudad;
        this.colorDeOjos = colorDeOjos;
        this.gustos = gustos;
    }
    
        public Tarjeta(String nombrePersonaje, String nombre, int edad,int altura, LinkedList<Tarjeta> enemigos, LinkedList<Tarjeta> amigos, String colorCabello, LinkedList<String> poderes, String ciudad, String colorDeOjos, LinkedList<String> gustos) {
        this.nombrePersonaje = nombrePersonaje;
        this.nombre = nombre;
        this.edad = edad;
        this.altura=altura;
        this.enemigos = enemigos;
        this.amigos = amigos;
        this.colorCabello = colorCabello;
        this.poderes = poderes;
        this.ciudad = ciudad;
        this.colorDeOjos = colorDeOjos;
        this.gustos = gustos;
    }

    @Override
    public String toString() {
        return nombrePersonaje;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tarjeta other = (Tarjeta) obj;
        if (!Objects.equals(this.nombrePersonaje, other.nombrePersonaje)) {
            return false;
        }
        return true;
    }

    public Tarjeta(String nombrePersonaje,String nombre, int edad, String colorCabello, LinkedList<String> poderes, String ciudad, String colorDeOjos, LinkedList<String> gustos) {
        this.nombrePersonaje = nombrePersonaje;
        this.nombre = nombre;
        this.edad = edad;
        this.colorCabello = colorCabello;
        this.poderes = poderes;
        this.ciudad = ciudad;
        this.colorDeOjos = colorDeOjos;
        this.gustos = gustos;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    
    
    public void addAmigo(Tarjeta t){
        this.amigos.add(t);
    }
    
    public void addEnemigo(Tarjeta t){
        this.enemigos.add(t);
    }
    
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LinkedList<Tarjeta> getEnemigos() {
        return enemigos;
    }

    public void setEnemigos(LinkedList<Tarjeta> enemigos) {
        this.enemigos = enemigos;
    }

    public LinkedList<Tarjeta> getAmigos() {
        return amigos;
    }

    public void setAmigos(LinkedList<Tarjeta> amigos) {
        this.amigos = amigos;
    }

    public String getColorCabello() {
        return colorCabello;
    }

    public void setColorCabello(String colorCabello) {
        this.colorCabello = colorCabello;
    }

    public LinkedList<String> getPoderes() {
        return poderes;
    }

    public void setPoderes(LinkedList<String> poderes) {
        this.poderes = poderes;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getColorDeOjos() {
        return colorDeOjos;
    }

    public void setColorDeOjos(String colorDeOjos) {
        this.colorDeOjos = colorDeOjos;
    }

    public LinkedList<String> getGustos() {
        return gustos;
    }

    public void setGustos(LinkedList<String> gustos) {
        this.gustos = gustos;
    }
    
    
    
    
    
    
}
