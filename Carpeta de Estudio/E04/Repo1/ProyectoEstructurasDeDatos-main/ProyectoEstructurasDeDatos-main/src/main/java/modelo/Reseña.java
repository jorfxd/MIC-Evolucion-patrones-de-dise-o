
package modelo;

import TDAs.ArrayList;
import java.text.ParseException;
import java.util.Date;
import java.util.PriorityQueue;
import static modelo.Juego.sdf;



/**
 *
 * @author Olivier MZ
 */
public class Reseña {
    private String Titulo;
    private String NombreJuego;
    private String Contenido;
    private int Puntuacion;
    private String Autor;
    private Date Fecha;

    public Reseña(String Titulo, String NombreJuego,String Contenido, int Puntuacion, String Autor, String Fecha) {
        this.Titulo = Titulo;
        this.NombreJuego= NombreJuego;
        this.Contenido = Contenido;
        this.Puntuacion = Puntuacion;
        this.Autor = Autor;
        try {
            this.Fecha = sdf.parse(Fecha);
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
    
    public String getNombreJuego(){
        return NombreJuego;
    }
    
    public String getContenido() {
        return Contenido;
    }

    public void setContenido(String Contenido) {
        this.Contenido = Contenido;
    }

    public int getPuntuacion() {
        return Puntuacion;
    }

    public void setPuntuacion(int Puntuacion) {
        this.Puntuacion = Puntuacion;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }
    
}
