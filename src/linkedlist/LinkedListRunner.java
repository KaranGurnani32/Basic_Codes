package linkedlist;

public class LinkedListRunner {

    public static void main(String[] args) {
        SingleLinkedList linkedList = new SingleLinkedList();

        linkedList.printList();

        linkedList.createList(12);
        linkedList.printList();

//        linkedList.insertEnd(56);
//        linkedList.printList();
//
//        linkedList.insertBegin(69);
//        linkedList.printList();
//
//        linkedList.insertBegin(78);
//        linkedList.printList();
//
//
//        System.out.println("removed value is = " + linkedList.deleteBegin());
//        linkedList.printList();
//
        linkedList.deleteEnd();
        linkedList.printList();
//
//        linkedList.deleteBegin();
//        linkedList.printList();

    }
}
