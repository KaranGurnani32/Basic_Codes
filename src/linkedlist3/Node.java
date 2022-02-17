package linkedlist3;

public class Node {
    String data;
    Node next;

    Node(){
        next = null;
    }

    public Node(String inputData) {
        this.data = inputData;
        this.next = null;
    }
}
