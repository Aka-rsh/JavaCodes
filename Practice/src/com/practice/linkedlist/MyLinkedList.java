package com.practice.linkedlist;

public class MyLinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;

    public void display() {
        System.out.println("=========================================");
        Node temp = this.head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addFirst(int data) {
        Node nn = new Node(data);
        nn.next = this.head;
        this.head = nn;
    }

    public void addLast(int data) {
        if (this.head == null) {
            addFirst(data);
            return;
        }

        Node temp = this.head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = new Node(data);
    }

    public void addAt(int data, int idx) {
        if (idx < 0) {
            System.out.println("Invalid index");
            return;
        }

        if (idx == 0) {
            addFirst(data);
            return;
        }

        Node temp = this.head;
        int i = 0;

        while (i < idx - 1 && temp != null) {
            temp = temp.next;
            i++;
        }

        if (temp == null) {
            System.out.println("Index out of bounds");
            return;
        }

        Node nn = new Node(data);
        nn.next = temp.next;
        temp.next = nn;
    }

    public int removeFirst() {
        if (this.head == null) {
            System.out.println("List is empty");
            return -1;
        }

        int rr = this.head.data;
        this.head = this.head.next;
        return rr;
    }
    
    public int removeLast() {
    	if(head == null) {
    		return -1;
    	}
    	
    	if(head.next == null) {
    		int rr = head.data;
    		head = null;
    		return rr;
    	}
    	
    	Node temp = this.head;
    	while (temp.next.next != null) {
    		temp = temp.next;
    	}
    	
    	int rr = temp.next.data;
    	temp.next = null;
    	return rr;
    }
    
    public int removeAt(int idx) {
        if (idx < 0 || head == null) {
            return -1; // invalid index or empty list
        }
        
        if (idx == 0) {
            return removeFirst();
        }
        
        Node temp = head;
        int i = 0;
        while (i < idx - 1 && temp.next != null) {
            temp = temp.next;
            i++;
        }
        
        if (temp.next == null) { // index out of bounds
            return -1;
        }
        
        int rv = temp.next.data;
        temp.next = temp.next.next;
        
        return rv;
    }

    // Main method
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);

        list.addLast(90);
        list.addAt(100, 3);
        list.removeLast();
        list.removeAt(2);

        list.display();
    }
}
