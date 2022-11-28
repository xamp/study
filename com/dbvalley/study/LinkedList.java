package com.dbvalley.study;

public class LinkedList {
    //field
    private Node head;
    private Node tail;
    private int size = 0;

    //constructor
    private class Node {
        private Object data;
        private Node next;

        public Node (Object input) {
            this.data = input;
            this.next = null;
        }

        public String toString() {
            return String.valueOf(this.data);
        }
    }

    //method
    public void addFirst(Object input) {
        Node newNode = new Node(input);

        newNode.next = head;
        head = newNode;

        size++;

        if (head.next == null) {
            tail = head;
        }
    }

    //method
    public void addLast(Object input) {
        Node newNode = new Node(input);

        if (size == 0) {
            addFirst(input);
        }
        else {
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }
}
