/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Iterator;

/**
 *
 * @author julio
 */
public class Product {
    String type;
    int cantidad;
    String cod_bodega;
    boolean en_reparacion;

    public Product(String type, int cantidad, String cod_bodega) {
        this.type = type;
        this.cantidad = cantidad;
        this.cod_bodega = cod_bodega;
    }
    
    

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCod_bodega() {
        return cod_bodega;
    }

    public void setCod_bodega(String cod_bodega) {
        this.cod_bodega = cod_bodega;
    }

    public boolean isEn_reparacion() {
        return en_reparacion;
    }

    public void setEn_reparacion(boolean en_reparacion) {
        this.en_reparacion = en_reparacion;
    }
}
