/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TDAs;

/**
 *
 * @author USER
 */
public class Node<T> {
        private T val;
        private Node next;
        private Node last;
        
        public Node(T val){
            this.val= val;
            this.next = null;
            this.last = null;
        }
        
        public Node(T val, Node sgte, Node ante) {
            this.val = val;
            this.next = sgte;
            this.last = ante;
        }

    public void setVal(T val) {
        this.val = val;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public T getVal() {
        return val;
    }

    public Node getNext() {
        return next;
    }

    public Node getLast() {
        return last;
    }

}
   