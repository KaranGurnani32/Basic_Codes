package linkedlist3;

public class LinkedListRunner {
    public static void main(String[] args) {
        SingleLinkedList linkedList = new SingleLinkedList();

        linkedList.printList();

        linkedList.createList("Karan");
        linkedList.printList();

        linkedList.insertBegin("Kanishk");
        linkedList.printList();

        linkedList.insertEnd("kunal");
        linkedList.printList();

        linkedList.deleteBegin();
        linkedList.printList();

        linkedList.deleteEnd();
        linkedList.printList();

    }
}
