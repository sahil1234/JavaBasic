package com.basic.stuff.LinkedList;

/**
 * Created by sahilk on 07/01/17.
 */
public class Node {

    private int value;
    private Node next;

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }


}
