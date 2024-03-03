package Practise;

import java.util.Arrays;

public class DuplicateInAnArray {
    static void printRepeating(int a[], int size) {
        int b[] = new int[size];
        for (int i = 0; i < size; i++) {
            int count = 1;
            for (int j = i+ 1; j < size; j++) {
                if (a[i] == a[j] && !Arrays.equals(a,b)) {
                    count++;
                    b[i] = a[i];
                }
            }
            System.out.println("Count of a number " + a[i] + " is " + count);
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 2, 4, 5, 2, 3, 1};
        int arr_size = arr.length;
        printRepeating(arr, arr_size);
    }
}
