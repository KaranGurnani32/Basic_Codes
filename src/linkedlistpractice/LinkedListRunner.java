package linkedlistpractice;

public class LinkedListRunner {
    public static void main(String[] args) {
        SingleLinkedList linkedList = new SingleLinkedList();

        linkedList.printList();

        linkedList.createList(12);
        linkedList.printList();
//        linkedList.insertBegin(52);
//        linkedList.printList();
//        linkedList.insertBegin(78);
//        linkedList.printList();
//        linkedList.deleteBegin();
//        linkedList.printList();
//        linkedList.insertEnd(55);
//        linkedList.printList();
        linkedList.deleteEnd();
        linkedList.printList();
    }
}

class SingleLinkedList {

    Node start;

    SingleLinkedList() {
        start = null;
    }

    void printList() {
        Node current = start;

        System.out.println("---------------------------------");
        while (current != null) {
            System.out.print(current.data + ", ");
            current = current.next;
        }
        System.out.println();
        System.out.println("---------------------------------");
    }

    void createList(int inputData) {
        //object created and constructor called
        //same data is entered as in the inout argument
        Node node = new Node(inputData);
        //value of node goes into start
        //new node created will be
        //start is just a reference
        start = node;
    }

    void insertBegin(int inputData) {

        //if list is empty
        if (start == null) {
            createList(12);
            return;
        }

        //if list not empty
        Node node = new Node(inputData);

        //always connect new node first
        node.next = start;
        start = node;
    }

    void insertEnd(int inputData){
        if (start == null) {
            createList(12);
            return;
        }

        //if not empty
        Node current = start;

        while (current.next != null) {
            current = current.next;
        }

        Node node = new Node(inputData);
        current.next = node;

    }

    public void deleteBegin() {
        if (start == null) {
            System.out.println("list empty");
        }

        Node node = start;
        start = start.next;
        node.next = null;
    }

    int deleteEnd() {
       if (start == null){
           System.out.println("empty list");
           return -1;
       }

       if (start.next == null){
           Node node = start;
           start = null;
           return node.data;
       }

       Node current = start;

       while (current.next.next !=null){
           current = current.next;
       }

       Node node = current.next;
       current.next = null;
       return node.data;
    }
}

class Node {
    int data;
    Node next;

    //Constructor formed where next is null
    //data is the input argument passes when constructor called
    //while creating object
    Node(int data) {
        this.data = data;
        next = null;
    }
}
