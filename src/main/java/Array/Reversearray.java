package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Reversearray {

    public static void main(String[] args) {
        int a[] = {2, 5, 9, 6, 4, 10,1};
        reverseArray(a);
        reverse(a);
    }

    public static void reverse(int a[]) {
        for(int i = 0;i < a.length/2;i++){
            int temp = a[i];
            a[i] = a[a.length - i -1];
            a[a.length -i -1] = temp;
        }
        System.out.println(Arrays.toString(a));
    }


    private static void reverseArray(int a[]) {
        int temp;
		int start = 0;
		int end = a.length - 1;
        while (start < end) {
          temp = a[start];
		  a[start] = a[end];
		  a[end] = temp;
		  start++;
		  end--;
        }
        System.out.print(Arrays.toString(a));
    }

}
