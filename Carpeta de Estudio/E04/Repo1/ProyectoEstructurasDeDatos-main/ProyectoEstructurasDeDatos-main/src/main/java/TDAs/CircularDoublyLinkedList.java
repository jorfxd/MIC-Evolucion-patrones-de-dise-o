/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TDAs;

/**
 *
 * @author Olivier MZ
 */
public class CircularDoublyLinkedList<T> implements List<T> {
    
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public CircularDoublyLinkedList(){
        this.head=null;
        this.tail=null;
    }


    @Override
    public boolean isEmpty() {
        return this.head == null;
    }

    @Override
    public boolean addFirst(T value) {
        Node<T> node= new Node(value);
        if(!this.isEmpty()){
            node.setNext(head);
            node.setLast(tail);
            head.setLast(node);
            tail.setNext(node);
            this.head = node;
            this.size += 1;
            return true;
        }else if(this.isEmpty()){
            this.head = node;
            this.tail = node;
            this.size += 1;
            return true;
        }else{
            return false;
        }
        
    }

    @Override
    public boolean addLast(T value) {
        Node<T> node= new Node(value);
        if(head != null){
            node.setNext(head);
            node.setLast(tail);
            head.setLast(node);
            tail.setNext(node);
            this.tail = node;
            this.size += 1;
            return true;
        }else if(head == null){
            this.head = node;
            this.tail = node;
            this.size += 1;
            return true;
        }else{
        return false;
        }
    }

    @Override
    public void add(int index, T element) {
        if(!this.isEmpty()&& index <= this.size -1){
            Node<T> nodoIngreso = new Node(element);
            Node<T> nodoAnterior;
            Node<T> nodoActual= this.head;
            for(int i = 0 ; i<index;i++){
                nodoActual = nodoActual.getNext();
            }
            nodoAnterior = nodoActual.getLast();
            nodoAnterior.setNext(nodoIngreso);
            nodoActual.setLast(nodoIngreso);
            nodoIngreso.setLast(nodoAnterior);
            nodoIngreso.setNext(nodoActual);
            if(nodoAnterior == this.tail && index!=0){
                this.tail = nodoIngreso;
            }
            this.size += 1;
        }else{
            throw new IndexOutOfBoundsException("Indice fuera de rango");
        }
    }

    @Override
    public T removeFirst() {
        if(!this.isEmpty()){
            Node<T> salida = this.head;
            this.head = salida.getNext();
            this.head.setLast(this.tail);
            this.tail.setNext(this.head);
            this.size -= 1;
            return salida.getVal();
        }
        return null;
    }

    @Override
    public T removeLast() {
        if(!this.isEmpty()){
            Node<T> salida = this.tail;
            this.tail = salida.getLast();
            this.head.setLast(this.tail);
            this.tail.setNext(this.head);
            this.size -= 1;
            return salida.getVal();
        }
        return null;
    }

    @Override
    public T remove(int index) {
        if(!this.isEmpty()&& index <= this.size -1){
            Node<T> nodoSalida= this.head;
            Node<T> nodoAnterior;
            Node<T> nodoNext;
            for(int i = 0 ; i<index;i++){
                nodoSalida = nodoSalida.getNext();
            }
            nodoAnterior = nodoSalida.getLast();
            nodoNext = nodoSalida.getNext();
            nodoAnterior.setNext(nodoNext);
            nodoNext.setLast(nodoAnterior);
            this.size -= 1;
            return nodoSalida.getVal();
        }else{
            throw new IndexOutOfBoundsException("Indice fuera de rango");
        }
    }

    @Override
    public T get(int pos) {
        if(!this.isEmpty()&& pos <= this.size -1){
            Node<T> nodoSalida= this.head;
            for(int i = 0 ; i<pos;i++){
                nodoSalida = nodoSalida.getNext();
            }
            return nodoSalida.getVal();
        }else{
            throw new IndexOutOfBoundsException("Indice fuera de rango");
        }   
    }

    @Override
    public T set(int index, T element) throws IndexOutOfBoundsException {
        if(!this.isEmpty()&& index <= this.size -1){
            Node<T> nodoSalida= this.head;
            for(int i = 0 ; i<index;i++){
                nodoSalida = nodoSalida.getNext();
            }
            T salida = nodoSalida.getVal();
            nodoSalida.setVal(element);
            return salida;
        }else{
            throw new IndexOutOfBoundsException("Indice fuera de rango");
        }   
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void clear() {
        this.head=null;
        this.tail=null;
    }
    
    
    public void setHead(Node head) {
        this.head = head;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getSize() {
        return size;
    }
    
    
}
