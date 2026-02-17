package Array;

import java.util.Arrays;

public class RotateAnArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7 };
		tempArray(a);
		reversalApproach(a);
		int first = a[0];

		for (int i = 0; i < a.length - 1; i++) {
			a[i] = a[i + 1];
		}
		a[a.length - 1] = first;

		System.out.println(Arrays.toString(a));
	}

	private static void tempArray(int[] a) {
		int b[] = new int[a.length];

		int first = a[0];

		for (int i = 0; i < a.length - 1; i++) {
			b[i] = a[i + 1];
		}

		b[b.length - 1] = first;

		System.out.println(Arrays.toString(b));
	}

	private static void reversalApproach(int a[]) {
    int k = 2;
		
	}

}
