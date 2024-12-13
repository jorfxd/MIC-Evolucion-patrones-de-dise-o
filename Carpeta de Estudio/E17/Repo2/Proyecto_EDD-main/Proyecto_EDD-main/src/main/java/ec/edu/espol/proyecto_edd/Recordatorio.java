/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.proyecto_edd;

import java.io.Serializable;

/**
 *
 * @author nicolassierra
 */
public class Recordatorio implements Serializable {
    private String info;
    private String label;

    public Recordatorio(String info, String label) {
        this.info = info;
        this.label = label;
    }

    public String getInfo() {
        return info;
    }

    public void setDate(String info) {
        this.info = info;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    
    
}
