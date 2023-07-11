package Array;

import java.util.Arrays;

public class SecondMaximunOfAnArray {

	public static void main(String[] args) {
	int a[] = {15,78,98,56,68,12,65};
	int max = a[0];
	int secondMax = a[0];
	for(int i =0;i < a.length ;i++) {
		if(a[i] > max) {
			secondMax = max;
			max = a[i];
		}
		else
			if(a[i] > secondMax && a[i] != max) {
				secondMax = a[i];	
	     }
	   }
	System.out.print(secondMax);
	}	
}
