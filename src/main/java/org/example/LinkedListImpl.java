package org.example;

public class LinkedListImpl {

    Node head;
     class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public static void main(String[] args){
        LinkedListImpl ll = new LinkedListImpl();
        Node first = ll.new Node(60);
        ll.head = first;

        Node second = ll.new Node(40);
        first.next = second;

        Node third = ll.new Node(50);
        second.next = third;

        ll.printMyLL();

    }

    public void printMyLL(){
         Node n = head;
         while(n!=null){
             System.out.println(n.data);
             n=n.next;
         }
    }
}
