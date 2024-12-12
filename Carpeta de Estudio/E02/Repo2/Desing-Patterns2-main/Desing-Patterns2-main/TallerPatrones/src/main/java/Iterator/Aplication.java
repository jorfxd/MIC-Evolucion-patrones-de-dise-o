/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Iterator;

/**
 *
 * @author julio
 */
public class Aplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         ProductsCollection pc = new ProductsCollection();
         pc.cargarProductos();
         Iterator it=pc.crearCompradorIterator();
         while (it.hasNext()){
             Product p = it.getNext();
             System.out.println("Producto: "+ p.getCod_bodega());
         }
    }
    
}
