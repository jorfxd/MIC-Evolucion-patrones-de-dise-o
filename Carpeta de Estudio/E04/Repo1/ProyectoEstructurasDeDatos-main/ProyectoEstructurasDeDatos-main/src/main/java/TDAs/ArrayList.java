/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TDAs;

/**
 *
 * @author Olivier MZ
 */

import java.util.Iterator;


public class ArrayList<G> implements List<G> {
    
    
    private int capacity = 100;
    private G[] elements = null;
    private int effectiveSize = 0;
    
    public ArrayList(){
        elements = (G[]) new Object[capacity];
    }
    
    @Override
    public boolean isEmpty() {
        return effectiveSize == 0;
    }
    
    public boolean isFull(){
        return effectiveSize== capacity;
    }

    @Override
    public boolean addFirst(G e) {
        if(e == null){
            return false;
        }
        else if (this.isFull()){
            this.addCapacity();   
        }
        for (int i= effectiveSize; i>=0 && i+1<elements.length;i--){
            elements[i+1]= elements[i];
        }
        elements[0]= e;
        effectiveSize++;
        return true;
    }
    
    @Override
    public boolean addLast(G e) {
        if(e== null){
            return false;
        } else if (this.isFull()){
            this.addCapacity();
        }
        int index = effectiveSize;
        elements[index]= e;
        effectiveSize++;
        return true;
    }

    @Override
    public void add(int index, G element) {
         if(element== null){
             throw new NullPointerException("Elemento null ingresado");
         } else if(index<0 || index>this.effectiveSize){
             throw new IndexOutOfBoundsException();
         } else if (isEmpty()){
             elements[effectiveSize++]= element;
         } else if( capacity == effectiveSize){
             this.addCapacity();
         } else{
             effectiveSize++;
             for (int i = effectiveSize; i> index; i--){
                 elements[i]= elements[i-1];
             }
             elements[index]= element;
         }
    }
    
    public void addCapacity(){
        capacity *= 2;
        G[] nuevo= (G[]) new Object[capacity];
        for (int i=0; i<elements.length;i++){
            nuevo[i] = elements[i];
        }
        elements = nuevo;
    }

    @Override
    public G removeFirst() {
        return remove(0);
    }

    @Override
    public G removeLast() {
        return remove(this.effectiveSize-1);
    }

    @Override
    public G remove(int index) {
        G elementRemove= null;
        if(this.isEmpty()|| index>= this.effectiveSize|| index<0){
            throw new IndexOutOfBoundsException();
        } else{
            elementRemove= elements[index];
            for(int i= index; i<this.effectiveSize-1; i++){
                elements[i]= elements[i+1];
            }
            this.effectiveSize--;
        }
        return elementRemove;
    }

    @Override
    public G get(int pos) {
        if(pos <0 || pos>= this.effectiveSize){
            throw new IndexOutOfBoundsException();
            
        } else {
            return elements[pos];
        }
    }

    @Override
    public G set(int index, G element) throws IndexOutOfBoundsException {
        if (index < 0 || index >= this.effectiveSize){
            throw new IndexOutOfBoundsException();
        }
        G elementOld= elements[index];
        elements[index]= element;
        return elementOld;
    }

    @Override
    public int size() {
        return effectiveSize;
    }

    @Override
    public void clear() {
        effectiveSize=0;
    }
    
    @Override
    public boolean equals(Object obj){
        if (obj == null|| !(obj instanceof ArrayList)){
            return false;
        }
        ArrayList<G> other= (ArrayList<G>) obj;
        
        if(this.effectiveSize != other.effectiveSize){
            return false;
        }
        
        for (int i=0; i< effectiveSize; i++){
            if(!this.elements[i].equals(other.elements[i])){
                return false;
            }
        }
        return true;
    }
    
    
    public Iterator<G> iterator(){
        Iterator<G> it= new Iterator<G>(){
            private int index=0;
            
            
            @Override
            public boolean hasNext() {
               return index<effectiveSize;
            }

            @Override
            public G next() {
               G tmp= get(index);
               index++;
               return tmp;
            }
            
        };
        return it;
    }
    
    @Override
    public String toString() {
        StringBuilder st = new StringBuilder();
        st.append("[ ");

        for (int i = 0; i < effectiveSize; i++) {
            if (i != effectiveSize - 1) {
                st.append(elements[i] + " , ");
            } else {
                st.append(elements[i]);
            }
        }

        st.append(" ]");
        return st.toString();
    }
    
    
    
    
    
    
    
    
    
}
