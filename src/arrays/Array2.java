package arrays;

public class Array2 {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};

//        a = insertatspecificindex(a,55,2);

//        a = reverseArray(a);
//        printArray(a);

        int min = minFromArray(a);
        int max = maxFromArray(a);

        System.out.println("Max is : " + max);
        System.out.println("Min is : " + min);
    }

    private static int maxFromArray(int[] a) {
        int max = a[0];

        for (int i = 0; i < a.length; i++) {
            if (max<a[i]){
                max = a[i];
            }
        }
        return max;
    }

    private static int minFromArray(int[] a) {
        int min = a[0];

        for (int i = 0; i < a.length; i++) {
            if (min>a[i]){
                min = a[i];
            }
        }
        return min;
    }

    private static int[] reverseArray(int[] a) {
        int left = 0;
        int right = a.length-1;

        while (left<right){
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
        return a;
    }

    public static int [] insertatspecificindex(int [] a, int element, int index){

        if(index<0 || index>a.length){
            System.out.println("invalid index");
            return a;
        }

        int [] newA = new int[a.length + 1];

        for (int i = 0; i < index; i++) {
            newA[i] = a[i];
        }

        newA[index] = element;

        for (int i = index; i < a.length; i++) {
            newA[i+1]=a[i];
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

}
