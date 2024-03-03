package Practise;

import java.util.Arrays;

public class Quicksort {

    public static void main(String[] args) {
        int[] a = {10, 7, 8, 9, 1, 5};
        int N = a.length;
        quickSort(a, 0, N - 1);
        System.out.println(Arrays.toString(a));
    }

    private static void quickSort(int[] a, int low, int high) {
        if (low < high) {
            int pi = partition(a, low, high);
            quickSort(a, low, pi - 1);
            quickSort(a, pi + 1, high);
        }
    }

    private static int partition(int[] a, int low, int high) {
        int pivot = a[high];
        int i = low - 1;
        for (int j = low; j < high - 1; j++) {
            if (a[j] > pivot) {

            }
        }
        return i + 1;
    }


}
