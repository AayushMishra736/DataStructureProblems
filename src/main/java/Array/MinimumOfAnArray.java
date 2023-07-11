package Array;

import java.util.Arrays;

public class MinimumOfAnArray {

	public static void main(String[] args) {
	int a[] = {10,45,23,78,12,90};
    int min = a[0];
    for(int i = 1;i <= a.length - 1;i++) {
    if(min > a[i]) {
    min = a[i];
          }	
       }
    System.out.print(min);
	}
}
