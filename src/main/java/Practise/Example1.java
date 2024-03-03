package Practise;

public class Example1 {
    public static void main(String[] args) {
        int a[] = {1, 2, 4, 6, 8, 10, 12, 14};
        int n = a.length;
        int l = 0;
        int h = n;
        int k = 12;
        binarySearchArray(a, n, k, l, h);
        iterativeSearch(a,n,h);
    }

    private static void binarySearchArray(int[] a, int n, int k, int l, int h) {
        if (h >= l) {
            int mid = l + (h - l) / 2;
            if (a[mid] == k) {
                System.out.println("Value present at index " + l);
            } else if (a[mid] < k) {
                binarySearchArray(a, n, k, mid, h );
            } else if (a[mid] > k) {
                binarySearchArray(a, n, k, 0, mid);
            }
        }
    }

    private static void iterativeSearch(int a[] ,int n,int k){
        int l = 0;
        int h = n - 1;
        while(l <= h){
            int mid = l + (h - l)/2;
            if(a[mid] == k){
                System.out.println("Result of iterative serach " + mid);
                break;
            }
            else if(a[mid] < k){
               l = mid;
            }else if(a[mid] > k){
               h = mid;
            }

        }

    }

}
