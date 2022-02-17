package linkedlist;

public class SingleLinkedList {

    Node start;

    SingleLinkedList() {
        start = null;
    }

    void createList(int inputData) {
        Node node = new Node(inputData);
        start = node;
    }

    void insertBegin(int inputData) {

        //if my list is empty
        if(start == null) {
            createList(12);
            return;
        }

        //if list is not empty
        Node node = new Node(inputData);

        //always connect the new node first and then change the pointers of the existing nodes
        node.next = start;
        start = node;
    }

    void insertEnd(int inputData) {
        //if my list is empty
        if(start == null) {
            createList(inputData);
            return;
        }

        Node current = start;

        while(current.next != null) {
            current = current.next;
        }

        Node node = new Node(inputData);
        current.next = node;
    }

    int deleteEnd() {
        //if my list is empty
        if(start == null) {
            System.out.println("cannot delete as no nodes. underflow");
            return -404;
        }

        //if list has only one element
        if(start.next == null) {
            Node node = start;
            start = null;
            return node.data;
        }

        Node current = start;

        while(current.next.next != null) {
            current = current.next;
        }

        Node node = current.next;

        current.next = null;
        return node.data;

    }

    int deleteBegin() {
        //if my list is empty
        if(start == null) {
            System.out.println("cannot delete as no nodes. underflow");
            return -404;
        }

        Node node = start;
        start = start.next;
        node.next = null;
        return node.data;
    }

    void printList() {
        Node current = start;

        System.out.println("------------------------");
        while(current != null) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println("------------------------");
    }
}