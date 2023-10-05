package Basic25Algorithm;

import java.util.Arrays;

public class insertionSort {
    public static void main(String... args){
        int a[] = {5,6,1,2,3,7,9};
        int l = a.length;
        insertionSortMethod(a,l);
    }
    private static void insertionSortMethod(int[] a, int l) {
       int temp = 0,j = 0;
       for(int i = 1;i < l;i++){
           temp = a[i];
           j = i;
           while(j > 0 && a[j -1] > temp){
               a[j] = a[j-1];
               j = j-1;
           }
           a[j] = temp;
       }
        System.out.println(Arrays.toString(a));
    }
}
