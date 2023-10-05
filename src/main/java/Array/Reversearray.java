package Array;

import java.util.Arrays;

public class Reversearray {

    public static void main(String[] args) {
        int a[] = {2, 5, 9, 6, 1, 4, 10, 8};
        reverseArray(a);
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
