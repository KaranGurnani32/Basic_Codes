package linkedlist3;

public class SingleLinkedList {

    Node start;

    public SingleLinkedList() {
        start = null;
    }

    void createList(String inputData) {
        Node node = new Node(inputData);
        start = node;
    }

    void insertBegin(String inputData) {
        if (start == null) {
            createList(inputData);
            return;
        }

        Node node = new Node(inputData);

        node.next = start;
        start = node;
    }

    String deleteBegin() {
        if (start == null) {
            System.out.println("cannot delete no nodes present");
            return "no nodes present";
        }

        Node node = start;
        start = start.next;
        node.next = null;
        return node.data;
    }

    void insertEnd(String inputData) {
        if (start == null) {
            createList(inputData);
            return;
        }

        Node node = new Node(inputData);

        Node current = start;

        while (current.next != null) {
            current = current.next;
        }

        current.next = node;

    }

    String deleteEnd() {
        if (start == null) {
            System.out.println("cannot delete no nodes");
            return "cannot delete";
        }

        if (start.next==null){
            Node node = start;
        }

        Node current = start;

        while (current.next.next != null) {
            current = current.next;
        }

        Node node = current.next;
        current.next = null;
        return node.data;
    }

    void printList() {
        Node current = start;

        System.out.println("--------");
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println("--------");

    }

    public boolean isExist(String inputData) {
        Node current = start;

        while (current != null) {
            if (current.data.equalsIgnoreCase(inputData)) {
                System.out.println("yes it is present");
                return true;
            }
            current = current.next;
        }
        System.out.println("no it is not present");
        return false;
    }
}
