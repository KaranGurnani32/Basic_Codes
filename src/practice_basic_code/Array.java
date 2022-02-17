package practice_basic_code;

public class Array {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};
/*
        //traversal
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }

        //empty array
        int [] b = new int[5];

        //access
        System.out.println("Access :" + a[3]);

        //searching
        for (int i = 0; i < a.length; i++) {
            if (a[i] ==4) {
                System.out.println(a[i]);
            }
        }
 */

        printArray(a);

        a = insertBeginning(a, 23);
        System.out.println("Insert Beginning");
        printArray(a);

        a = delBeginning(a);
        System.out.println("Delete Beginning");
        printArray(a);

        a = insertEnd(a, 54);
        System.out.println("Insert End");
        printArray(a);

        a = delEnd(a);
        System.out.println("Delete End");
        printArray(a);

        a = insertSpecificIndexInArray(a, 12, 0);
        System.out.println("Insert Specific Index In Array");
        printArray(a);

        a = deleteSpecificIndexInArray(a, 0);
        System.out.println("Delete Specific Index In Array");
        printArray(a);

//        a = insertBeforeSpecificElement(a, 1, 11);
        System.out.println("Insert Before Specific Element");
        printArray(a);

        a = deleteSpecificElement(a, 11);
        printArray(a);

        a = insertAfterSpecificElement(a, 1, 22);
        printArray(a);
    }

    private static int[] insertAfterSpecificElement(int[] a, int element, int value) {

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
            int[] newA = insertSpecificIndexInArray(a, value, index+1);
            return newA;
        } else {
            System.out.println("element not present in the array");
            return a;
        }
    }

    private static int [] deleteSpecificElement(int [] a, int element) {
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
            int[] newA = deleteSpecificIndexInArray(a, index);
            return newA;
        } else {
            System.out.println("element not present in the array");
            return a;
        }
    }

//    private static int[] insertBeforeSpecificElement(int[] a, int element, int value) {
//
//        boolean found = true;
//        int index = -1;
//
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] == element){
//                found = true;
//                index = i;
//                break;
//            }
//        }
//
//        if (found){
//            int[] newA = insertSpecificIndexInArray(a, value, index);
//        } else {
//            System.out.println("Element not present");
//        }
//
//    }

    private static int[] deleteSpecificIndexInArray(int[] a, int index) {
        int [] newA = new int[a.length-1];

        if (index<0 || index>a.length-1){
            System.out.println("Invalid index");
        }

        for (int i = 0; i < index; i++) {
            newA[i] = a[i];
        }


        for (int i = index; i < a.length-1; i++) {
            newA[i] = a[i+1];
        }
        return newA;
    }

    private static int[] insertSpecificIndexInArray(int[] a, int element, int index) {
        int [] newA = new int[a.length+1];

        if (index<0 || index>a.length-1){
            System.out.println("Invalid index");
        }

        for (int i = 0; i < index; i++) {
            newA[i] = a[i];
        }

        newA[index] = element;

        for (int i = index; i < a.length; i++) {
            newA[i+1] = a[i];
        }
        return newA;
    }

    private static int[] delEnd(int[] a) {
        int [] newA = new int[a.length-1];

        for (int i = 0; i < a.length-1; i++) {
            newA[i] = a[i];
        }
        return newA;
    }

    private static int[] insertEnd(int[] a, int element) {
        int [] newA = new int[a.length+1];

        for (int i = 0; i < a.length; i++) {
            newA[i] = a[i];
        }

        newA[a.length] = element;

        return newA;
    }

    private static int[] delBeginning(int[] a) {
        int [] newA = new int[a.length-1];

        for (int i = 1; i < a.length; i++) {
            newA[i-1] = a[i];
        }
        return newA;
    }

    private static int[] insertBeginning(int[] a, int element) {
        int [] newA = new int[a.length+1];

        newA[0] = element;

        for (int i = 0; i < a.length; i++) {
            newA[i+1] = a[i];
        }
        return newA;
    }

    private static void printArray(int[] a) {
        System.out.println("---------");
        for (int i = 0; i < a.length; i++) {
            System.out.println(i + " => " + a[i]);
        }
        System.out.println("---------");
    }

}
