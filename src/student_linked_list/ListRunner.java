package student_linked_list;

public class ListRunner {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.printList();
        Student student1 = new Student(1, "kanishk");

        linkedList.createList(student1);
        linkedList.printList();

        linkedList.insertEnd(new Student(2, "karan"));
        linkedList.printList();

        linkedList.insertBegin(new Student(67, "kunal"));
        linkedList.printList();

        linkedList.insertBegin(new Student(24, "amit"));
        linkedList.printList();


        System.out.println("removed value is = " + linkedList.deleteBegin());
        linkedList.printList();

        linkedList.deleteEnd();
        linkedList.printList();

        linkedList.deleteBegin();
        linkedList.printList();

    }
}
