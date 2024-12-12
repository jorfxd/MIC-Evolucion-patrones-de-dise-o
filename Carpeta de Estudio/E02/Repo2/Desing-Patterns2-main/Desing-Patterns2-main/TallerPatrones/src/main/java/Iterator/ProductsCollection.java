/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Iterator;

import java.util.List;
import java.util.LinkedList;

/**
 *
 * @author julio
 */
public class ProductsCollection implements iterableCollection {
    List<Product> productos = (List<Product>) new LinkedList();
    
    public void addProduct(Product p){
        productos.add(p);
    }
    
    public void cargarProductos(){
        Product p1 = new Product("laptop",389,"A121");
        Product p2 = new Product("celular",150,"B434");
        Product p3 = new Product("television",456,"Z777");
        
        productos.add(p1);
        productos.add(p2);
        productos.add(p3);
    }

    public ProductsCollection() {
    }

    @Override
    public Iterator crearCompradorIterator() {
        return new Iterator(); //ve todos los productos
    }

    @Override
    public Iterator crearVendedorIterator() {
        System.out.println("Iterando para asistente de vendedor...");
        return new Iterator();
    }

    @Override
    public Iterator crearProveedorIterator() {
        System.out.println("Iterando para proveedor...");
        return new Iterator();
    }

    @Override
    public Iterator crearMantenimientoIterator() {
        System.out.println("Iterando para asistente de mantenimiento...");
        return new Iterator();
    }
}
