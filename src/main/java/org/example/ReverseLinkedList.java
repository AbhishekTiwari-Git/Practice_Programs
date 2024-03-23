package org.example;


public class ReverseLinkedList {

    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static Node reverseLL(Node head) {
        Node previous = null;
        Node current = head;
        Node nextNode;

        while (current != null) {
            nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }
        head = previous;
        return head;
    }

    public static void main(String[] args) {

        ReverseLinkedList rll = new ReverseLinkedList();
        Node first = new Node(60);
        head = first;

        Node second = new Node(50);
        first.next = second;

        Node third = new Node(40);
        second.next = third;

        Node forth = new Node(30);
        third.next = forth;

        Node fifth = new Node(20);
        forth.next = fifth;

        System.out.println("=====Original LL========");
        rll.printMyLL(head);

        System.out.println();

        System.out.println("=====Reversed LL========");
        Node reversed = reverseLL(head);
        rll.printMyLL(reversed);
    }

    public void printMyLL(Node node){
        while (node!=null){
            System.out.print(" "+node.data);
            node = node.next;
        }
    }

}
