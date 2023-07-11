package Array;

import java.util.Arrays;

public class Reversearray {

	public static void main(String[] args) {
	int a[] = {2,5,9,6,1,4,10,8};
	for(int i = a.length - 1;i >=0 ;i--) {
		System.out.print(a[i] + ", ");
	   }
	System.out.println();
	System.out.println("-----Print an array using function-----");
	reverseArray(a);
	}
	
	private static void reverseArray(int a[]) {
    int start = 0;
    int end = a.length - 1;
    int temp = 0;
	while(start < end) {
	temp = a[start];
	a[start] = a[end];
	a[end] = temp;
	start++;
	end--;
	    }
	System.out.print(Arrays.toString(a));
	}
	
}
