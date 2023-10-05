package Basic25Algorithm;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String... args) {
        int a[] = {5, 6, 1, 2, 3, 7, 9};
        int n = a.length;
        selectionSort(a, n);
    }

    private static void selectionSort(int[] a, int n) {
        int min;int temp = 0;
        for (int i = 0; i < n; i++) {
            min = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
