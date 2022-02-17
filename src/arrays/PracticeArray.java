package arrays;

public class PracticeArray {
    public static void main(String[] args) {
        int[] a = {11, 65, 89, -73, 42, 54, 67};

        printArray(a);

//        a = insertBeginning(a, 69);
//        printArray(a);
//
//        a = insertingAtEnd(a, 83);
//        printArray(a);
//
//        a = deleteAtBeginning(a);
//        printArray(a);
//
//        a = deleteAtEnd(a);
//        printArray(a);

//        a = insertAtSpecificIndex(a, 49, 2);
//        printArray(a);

//        a = insertAfterSpecificElement(a, 10, 88);
//        printArray(a);
//
        a = insertBeforeSpecificElement(a, -73, 23);
        printArray(a);

//        a = deleteSpecificIndex(a, 1);
//        printArray(a);

//        a = deleteAtSpecificElement(a, 3);
//        printArray(a);
    }

    private static int[] deleteAtSpecificElement(int[] a, int element) {
        if (element <= 0 || element > a.length) {
            System.out.println("invalid element");
            return a;
        }

        int[] newA = new int[a.length - 1];

        for (int i = 0; i < element; i++) {
            newA[i] = a[i];
        }

        for (int i = element + 1; i < a.length; i++) {
            newA[i - 1] = a[i];
        }
        return newA;
    }

    private static int[] deleteSpecificIndex(int[] a, int index) {

        if (index < 0 || index > a.length) {
            System.out.println("invalid index Kindly try again");
        }

        int[] newA = new int[a.length - 1];

        for (int i = 0; i < index; i++) {
            newA[i] = a[i];
        }


        for (int i = index + 1; i < a.length; i++) {
            newA[i - 1] = a[i];
        }
        return newA;
    }

    private static int[] insertBeforeSpecificElement(int[] a, int element, int value) {

//        if(element <= 0 || element > a.length) {
//            System.out.println("invalid element");
//            return a;
//        }
//
//        int[] newA = new int[a.length+1];
//
//        for (int i = 0; i < element-1; i++) {
//            newA[i] = a[i];
//        }
//        newA[element-1] = value;
//
//        for (int i = element; i < a.length+1; i++) {
//            newA[i] = a[i-1];
//        }
//        return newA;


        boolean found = true;
        int index = -1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == element) {
                found = true;
                index = i;
                break;
            }
        }

        if (found) {
            int[] newA = insertSpecificIndex(a, value, index);
            return newA;
        } else {
            System.out.println("element not present in the array");
            return a;
        }

    }

    private static int[] insertSpecificIndex(int[] a, int element, int index) {
        //i have the original
        //i have the element to be inserted
        //i have the index where i need to put the element

        if (index < 0 || index > a.length) {
            System.out.println("invalid index");
            return a;
        }

        //i will create a new array of size original.length + 1
        int[] newA = new int[a.length + 1];
        //[0, 0, 0, 0, ..., 0]

        //copy all the elements of the original array to new array
        for (int i = 0; i < index; i++) {
            //update all the elements of new Array
            newA[i] = a[i];
        }

        newA[index] = element;

        for (int i = index; i < a.length; i++) {
            //update all the elements of new Array
            newA[i + 1] = a[i];
        }

        return newA;
    }

    private static int[] insertAfterSpecificElement(int[] a, int element, int value) {

        if (element <= 0 || element > a.length) {
            System.out.println("invalid element");
            return a;
        }

        int[] newA = new int[a.length + 1];

        for (int i = 0; i < element; i++) {
            newA[i] = a[i];
        }
        newA[element] = value;

        for (int i = element; i < a.length; i++) {
            newA[i + 1] = a[i];
        }
        return newA;
    }

    private static int[] insertAtSpecificIndex(int[] a, int element, int index) {
        if (index < 0 || index > a.length) {
            System.out.println("invalid index");
            return a;
        }

        int[] newA = new int[a.length + 1];

        for (int i = 0; i < index; i++) {
            newA[i] = a[i];
        }
        newA[index] = element;

        for (int i = index; i < a.length; i++) {
            newA[i + 1] = a[i];
        }
        return newA;
    }

    private static int[] deleteAtEnd(int[] a) {
        int[] newA = new int[a.length - 1];

        for (int i = 0; i < a.length - 1; i++) {
            newA[i] = a[i];
        }
        return newA;
    }

    private static int[] deleteAtBeginning(int[] a) {
        int[] newA = new int[a.length - 1];

        for (int i = 1; i < a.length; i++) {
            newA[i - 1] = a[i];
        }
        return newA;
    }

    private static int[] insertingAtEnd(int[] a, int element) {
        int[] newA = new int[a.length + 1];

        for (int i = 0; i < a.length; i++) {
            newA[i] = a[i];
        }
        newA[a.length] = element;
        return newA;
    }

    private static int[] insertBeginning(int[] a, int element) {
        int[] newA = new int[a.length + 1];

        for (int i = 0; i < a.length; i++) {
            newA[i + 1] = a[i];
        }
        newA[0] = element;
        return newA;
    }

    private static void printArray(int[] a) {
        System.out.println("--------------");
        for (int i = 0; i < a.length; i++) {
            System.out.println(i + " ==> " + a[i]);
        }
    }
}
