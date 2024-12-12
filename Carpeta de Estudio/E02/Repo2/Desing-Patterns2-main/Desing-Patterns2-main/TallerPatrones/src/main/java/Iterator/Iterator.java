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
public class Iterator implements ProductIterator{
    
    List<Product> productos = new LinkedList();
    Product PActual;
    int ind=0;

    @Override
    public Product getNext() {
        PActual=productos.get(ind);
        ind++;
        return PActual;
    }

    @Override
    public boolean hasNext() {
        try{
           productos.get(ind+1); 
        } catch(Exception e){
            return false;
        }
        return true;
    }
    
}
