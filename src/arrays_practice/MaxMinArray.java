package arrays_practice;

public class MaxMinArray {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 2, 8};

        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max){
                max = a[i];
            }
        }

        int min = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min){
                min = a[i];
            }
        }

        System.out.println(max);
        System.out.println(min);
    }
}
