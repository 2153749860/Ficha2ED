/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha2ed;

/**
 *
 * @author tiago
 */
public class LinkedList<T> {
    private int count;
    
    private Node<T> head;
    private Node<T> tail;

    public LinkedList() {
        this.count = 0;
        this.head = null;
        this.tail = null;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public void setTail(Node<T> tail) {
        this.tail = tail;
    }
    
    public void add(T element){
        Node<T> newNode = new Node<T>(element);
        
        if(this.count == 0){
            this.head = newNode;
            this.tail = newNode;
        }
        else{
            newNode.setNext(this.head);
            this.head = newNode;
        }
        this.count++;
    }
    
    public void remove(T element){
        if(this.count == 0){
            System.out.println("Lista vazia!");
        }
        else{
            Node<T> previous = new Node<>();
            Node<T> current = new Node<>();
            
            current = this.head;
            
            for(int i=0; i<this.count-1; i++){
                if(!current.getElement().equals(element)){
                    current = current.getNext();
                    previous = current;
                    System.out.println("Current: " + current.getElement().toString());
                    System.out.println("Previous: " + previous.getElement().toString());
                }
            }
            
            
        }
    }
    
    
    
    
    
    
    
    public void print(){
        System.out.println(this.head.getElement().toString());
        System.out.println(this.tail.getElement().toString());
        System.out.println(this.count);
    }
    
    
}
