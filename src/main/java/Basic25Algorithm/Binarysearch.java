package Basic25Algorithm;

import java.sql.SQLOutput;

public class Binarysearch {

    public static void main(String... args) {
        int a[] = {1, 2, 4, 6, 8, 10, 12, 14};
        int n = a.length;
        int l = 0;
        int h = n;
        int k = 12;
        binarySearchArray(a, n, k, l, h);
        iterativeSearch(a,n,k);
    }
    //Recursive Search
    private static void binarySearchArray(int[] a, int n, int k, int l, int h) {
        if (h >= l) {
            int mid = l + (h - l) / 2;
            if (a[mid] == k) {
                System.out.println("Element is at position binarySearchArray : " + mid);
            } else if (a[mid] < k) {
                binarySearchArray(a, n, k, mid, h);
            } else if (a[mid] > k) {
                binarySearchArray(a, n, k, 0, mid);
            }
        }
    }

    //Iterative Search
    private static void iterativeSearch(int[] a, int n, int k){
        int l = 0;
        int h = n-1;
        while(l <= h){
            int m = l + (h -1) /2;
            if(a[m] == k)
            {
                System.out.println("Element is at position via iterativeSearch : " + m);
                break;
            }
            else
            if(a[m] > k){
                h = m;
            }
            else
            if(a[m] < k){
                l = m;
            }
        }
    }
}
