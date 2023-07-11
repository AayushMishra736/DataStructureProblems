package Array;

public class MissingNumberInAnArray {

	public static void main(String[] args) {
	int arr[] = {1,2,3,4,5,6,7,9};
	int n = arr.length;
	missingNumber(arr,n);
	}

	private static void missingNumber(int[] a, int n) {
	n = n + 1;
	int sum = (n * (n + 1))/2;

	for(int num : a) {
	sum = sum - num;	
	}
	System.out.print("Missing Number : " + sum);
	}
}
