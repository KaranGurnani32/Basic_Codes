package student_linked_list;

public class LinkedList {

    Node start;

    LinkedList() {
        this.start = null;
    }

    void createList(Student inputData) {
        Node node = new Node(inputData);
        start = node;
    }

    void insertBegin(Student inputData) {

        //if my list is empty
        if(start == null) {
            createList(inputData);
            return;
        }

        //if list is not empty
        Node node = new Node(inputData);

        //always connect the new node first and then change the pointers of the existing nodes
        node.next = start;
        start = node;
    }

    void insertEnd(Student inputData) {
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

    Student deleteEnd() {
        //if my list is empty
        if(start == null) {
            System.out.println("cannot delete as no nodes. underflow");
            return null;
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

    Student deleteBegin() {
        //if my list is empty
        if(start == null) {
            System.out.println("cannot delete as no nodes. underflow");
            return null;
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
//            System.out.println(current.data);
            current.data.showDetail();
            current = current.next;
        }
        System.out.println("------------------------");
    }
}
