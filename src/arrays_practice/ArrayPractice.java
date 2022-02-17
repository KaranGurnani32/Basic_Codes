package arrays_practice;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] a = {11, 65, 89, -73, 42, 54, 67};

        printArray(a);

        a = insertBeginning(a, 69);
        printArray(a);

        a = deleteBeginning(a);
        printArray(a);

        a = insertEnd(a, 69);
        printArray(a);

        a = deleteEnd(a);
        printArray(a);

        // 11,65,89,-73,78,42,54,67
        a = insertSpecificIndex(a, 78, 4);
        printArray(a);

        //11,65,89,-73,78,42,54,50,67
        a = insertAfterSpecificElement(a, 54, 50);
        printArray(a);

        a = insertBeforeSpecificElement(a, 42, 99);
        printArray(a);

        a = deleteSpecificIndex(a, 5);
        printArray(a);
    }

    private static int[] insertAfterSpecificElement(int[] a, int element, int value) {

        boolean found = true;
        int index = -1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == element){
                found = true;
                index = i;
                break;
            }
        }

        if (found){
            int[] newA = insertSpecificIndex(a,value, index + 1);
            return newA;
        } else {
            System.out.println("element not present");
            return a;
        }
    }

    private static int[] deleteSpecificElement(int[] a, int element) {

        boolean found = true;
        int index = -1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == element){
                found = true;
                index = i;
                break;
            }
        }

        if (found){
            int[] newA = deleteSpecificIndex(a, index);
            return newA;
        } else {
            System.out.println("element not present");
            return a;
        }
    }

    private static int[] insertBeforeSpecificElement(int[] a, int element, int value) {

        boolean found = true;
        int index = -1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == element){
                found = true;
                index = i;
                break;
            }
        }

        if (found){
            int[] newA = insertSpecificIndex(a,value, index);
            return newA;
        } else {
            System.out.println("element not present");
            return a;
        }
    }

    private static int[] insertSpecificIndex(int[] a, int element, int index) {
        if (index < 0 || index >= a.length){
            System.out.println("Error");
        }

        int[] newA = new int[a.length + 1];


        for (int i = 0; i < index; i++) {
            newA[i] = a[i];
        }

        newA[index] = element;

        for (int i = index; i < a.length; i++) {
            newA[i+1] = a[i];
        }
        return newA;
    }

    private static int[] deleteSpecificIndex(int[] a, int index) {
        if (index < 0 || index >= a.length){
            System.out.println("Error");
        }

        int[] newA = new int[a.length - 1];


        for (int i = 0; i < index; i++) {
            newA[i] = a[i];
        }


        for (int i = index; i < newA.length; i++) {
            newA[i] = a[i+1];
        }
        return newA;
    }

    private static int[] deleteEnd(int[] a) {
        int[] newA = new int[a.length -1];

        for (int i = 0; i < newA.length; i++) {
            newA[i] = a[i];
        }
        return newA;
    }

    private static int[] insertEnd(int[] array, int element) {
        int[] newA = new int[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            newA[i] = array[i];
        }

        newA[array.length] = element;
        return newA;
    }

    private static int[] deleteBeginning(int[] array) {
        int[] newA = new int[array.length - 1];

        for (int i = 1; i < array.length; i++) {
            newA[i - 1] = array[i];
        }

        return newA;
    }

    private static int[] insertBeginning(int[] array, int element) {
        int[] newA = new int[array.length + 1];

        newA[0] = element;

        for (int i = 1; i < newA.length; i++) {
            newA[i] = array[i - 1];
        }
        return newA;
    }

    private static void printArray(int[] array) {
        System.out.println("-------------------------------");
        for (int element : array) {
            System.out.print(element + ", ");
        }
        System.out.println();
        System.out.println("-------------------------------");
    }
}
