package Practise;

import java.util.Arrays;

public class Cyclicallyrotatetarraybyone {

    public static void main(String[] args) {
        int a[] = {1, 2, 4, 6, 8, 10, 12, 14};
        rotateArray(a, a.length);
        rotateArrayBYSuffle(a, a.length);
    }

    private static void rotateArrayBYSuffle(int[] a, int length) {
        int last = a[length - 1];
        for (int i = 1; i < length - 1; i++) {
            int temp = a[i];
            a[i] = a[i  + 1];

        }
    }

    private static void rotateArray(int[] a, int n) {
        int last = a[n - 1];
        for (int i = n - 1; i > 0; i--)
            a[i] = a[i - 1];
        a[0] = last;
        System.out.println(Arrays.toString(a));

    }

}
