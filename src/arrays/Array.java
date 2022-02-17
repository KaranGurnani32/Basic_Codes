package arrays;

public class Array {

    public static void main(String[] args) {

        //initialisation

        //pre field data
        int [] a = {12, 3, 5, 46, 87, 92, 16};

        //empty array
        int [] b = new int[6];

        //access
        System.out.println("this is access vala : " + a[3]);
        System.out.println("yeh hai direct print : ");
        System.out.println(a);
        System.out.println("==============================");
        //traversal
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        //searching
        for (int i = 0; i < a.length; i++) {
            if(a[i] == -87) {
                System.out.println("mil gaya saada, " + a[i]);
            }
        }

        System.out.println("----------------------------");
        //update
        a[2] = -100;
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        //insert
        printArray(a);
        a = insertEnd(a, 25);
        printArray(a);

        a = insertBeginning(a, 69);
        printArray(a);
        //delete

        a = insertSpecificIndex(a, 78, 4);
        printArray(a);

        a = insertAfterSpecificElement(a, 78, 100);
        printArray(a);

        a = insertbeforeSpecificElement(a, 78, 150);
        printArray(a);

        a = deleteEnd(a);
        printArray(a);

        a = deleteBeginning(a);
        printArray(a);

        a = deleteSpecificIndex(a, 5);
        printArray(a);

        a = deleteSpecificElement(a, 92);
        printArray(a);

    }

    private static int[] deleteSpecificIndex(int[] a, int index) {

        if(index < 0 || index > a.length-1) {
            System.out.println("invalid index");
            return a;
        }

        int [] newA = new int[a.length - 1];

        for (int i = 0; i < index; i++) {
            newA[i] = a[i];
        }

        for (int i = index; i < a.length - 1; i++) {
            newA[i] = a[i+1];
        }

        return newA;

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
            int[] newA = deleteSpecificIndex(a, index);
            return newA;
        } else {
            System.out.println("element not present in the array");
            return a;
        }
    }

    private static int[] deleteEnd(int[] a) {

        int [] newA = new int[a.length - 1];

        for (int i = 0; i < a.length - 1; i++) {
            newA[i] = a[i];
        }

        return newA;
    }

    private static int[] deleteBeginning(int[] a) {
        int [] newA = new int[a.length - 1];

        for (int i = 1; i < a.length; i++) {
            newA[i-1] = a[i];
        }

        return newA;
    }



    private static int[] insertBeginning(int[] a, int element) {
        //i have the original
        //i have the element to be inserted

        //i will create a new array of size original.length + 1
        int [] newA = new int[a.length + 1];
        //[0, 0, 0, 0, ..., 0]

        //copy all the elements of the original array to new array
        for (int i = 0; i < a.length; i++) {
            //update all the elements of new Array
            newA[i+1] = a[i];
        }
        //add the new element to the last of the array
        newA[0] = element;

        return newA;
    }
    private static int[] insertbeforeSpecificElement(int[] a, int element, int value) {

        boolean found = true;
        int index = -1;

        for (int i = 0; i < a.length; i++) {
            if(a[i] == element) {
                found = true;
                index = i;
                break;
            }
        }

        if(found) {
            int[] newA = insertSpecificIndex(a, value, index);
            return newA;
        } else {
            System.out.println("element not present in the array");
            return a;
        }


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
            int[] newA = insertSpecificIndex(a, value, index+1);
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

        if(index < 0 || index >= a.length) {
            System.out.println("invalid index");
            return a;
        }

        //i will create a new array of size original.length + 1
        int [] newA = new int[a.length + 1];
        //[0, 0, 0, 0, ..., 0]

        //copy all the elements of the original array to new array
        for (int i = 0; i < index; i++) {
            //update all the elements of new Array
            newA[i] = a[i];
        }

        newA[index] = element;

        for (int i = index; i < a.length; i++) {
            //update all the elements of new Array
            newA[i+1] = a[i];
        }

        return newA;
    }

    private static void printArray(int[] a) {
        System.out.println("-------------------------------------");
        for (int i = 0; i < a.length; i++) {
            System.out.println(i + " ==> " + a[i]);
        }
        System.out.println();
        System.out.println("-------------------------------------");
    }

    private static int [] insertEnd(int [] a, int element) {
        //i have the original
        //i have the element to be inserted

        //i will create a new array of size original.length + 1
        int [] newA = new int[a.length + 1];
         //[0, 0, 0, 0, ..., 0]

        //copy all the elements of the original array to new array
        for (int i = 0; i < a.length; i++) {
            //update all the elements of new Array
            newA[i] = a[i];
        }
        //add the new element to the last of the array
        newA[newA.length - 1] = element;

        return newA;
    }
}