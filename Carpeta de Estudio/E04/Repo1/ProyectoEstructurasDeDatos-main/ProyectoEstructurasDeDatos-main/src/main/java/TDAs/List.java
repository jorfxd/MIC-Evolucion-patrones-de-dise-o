/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package TDAs;

/**
 *
 * @author Olivier MZ
 */
public interface List<G> {
    public boolean isEmpty();
    
    public boolean addFirst (G e);
    public boolean addLast (G e);
    public void add(int index, G element);
    
    public G removeFirst ();
    public G removeLast ();
    public G remove(int index); 
    
    public G get (int pos);
    public G set(int index, G element) throws IndexOutOfBoundsException;
    
    public int size();
    public void clear();
    
    @Override
    public String toString ();
}
