package student_linked_list;

public class Student {

    private int rollNumber;
    private String name;

    Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public void showDetail() {
        System.out.println("--------------------------");
        System.out.println("roll number : " + rollNumber);
        System.out.println("name : " + name);
        System.out.println("--------------------------");
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                '}';
    }
}
