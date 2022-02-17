package arrays_practice;

public class PeakElement {
    //An element is called a peak element if its value is bigger
    // than the value of its adjacent elements(if they exist).
    // Given an array arr[] of size N, find the index of any one of its peak elements.

    /* O(n) time complexity code
    public static int findPeak(int[] a, int n) {
        /* O(n) time complexity code
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            if (a[0] >= a[1]) {
                return 0;
            } else {
                return 1;
            }
        } else {
            if (a[0] >= a[1]) {
                return 0;
            }
            if (a[n - 1] >= a[n - 2]) {
                return n - 1;
            }
            for (int i = 1; i < n - 1; i++) {
                if (a[i] >= a[i - 1] && a[i] >= a[i + 1]) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main (String[] args){
        int[] a = {1, 2};
        int n = a.length;
        int peak = findPeak(a, n);
        System.out.println(peak);
    }
     */

    // O(log n) time complexity
    static int peakElement(int[] a, int n) {
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if ((mid == 0 || a[mid] >= a[mid - 1]) &&
                    (mid == n - 1 || a[mid] >= a[mid + 1])) {
                System.out.println("found in 1st");
                return mid;
            } else if (a[mid] <= a[mid + 1]) {
                System.out.println("found in 2nd");
                low = mid + 1;
            } else {
                System.out.println("found in 3rd");
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main (String[] args){
        int[] a = {8, 2, 8 , 5, 3, 1, 0};
        int n = a.length;
        int peak = peakElement(a, n);
        System.out.println(peak);
    }
}