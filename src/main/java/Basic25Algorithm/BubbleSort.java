package Basic25Algorithm;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int a[] = {5, 6, 1, 2, 3, 7, 9};
        int n = a.length;
        bubbleSort(a, n);
    }

    private static void bubbleSort(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
