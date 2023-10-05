package Array;

public class peakElement {

    public static void main(String[] args) {
        int[] a =  {10, 20, 15, 2, 23, 90, 67};
        int n = a.length;
        peakElementMethod(a, n);
    }

    private static void peakElementMethod(int[] a, int n) {
       if(n == 1){
           System.out.println(0);
       }
       else if(a[0] >= a[1]){
           System.out.println(0);
       }
       else if(a[n-1] >= a[n-2]){
           System.out.println(n-1);
       }
       for(int i = 0; i < n;i++){
           if(a[i - 1] <= a[i] && a[i] >= a[i + 1]){
               System.out.println(i);
           }
       }
    }
}
