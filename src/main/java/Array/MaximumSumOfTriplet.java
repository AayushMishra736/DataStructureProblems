package Array;

import java.util.Arrays;

public class MaximumSumOfTriplet {

	public static void main(String[] args) {
		int a[] = { 3, 5, 6, 7, 9, 8, 7, 5, 43, 3, 2, 3, 4, 5, 5, 6, 7 };
		myApproach(a);
		chatGptApproach(a);

	}

	private static void chatGptApproach(int[] a) {
		int max = a[0];
		int count = 0;
		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
			count++;

			if (count == 3 || i == a.length - 1) {

				if (sum > max) {
					max = sum;
				}
                sum = 0;
				count = 0;
			}
		}
		System.out.println(max);
	}

	private static void myApproach(int a[]) {
		int triplet = a.length / 3;
		int b[] = new int[triplet + 1];
		int j = 0;

		for (int i = 0; i < a.length - 1;) {
			int v = 0;
			int pr = 0;

			while (v < 3) {
				if (i < a.length) {
					pr = pr + a[i++];

				}
				v++;
			}
			b[j] = pr;
			j++;
		}

		int max = b[0];

		for (int i = 0; i < b.length - 1; i++) {
			if (max < b[i]) {
				max = b[i];
			}
		}
		System.out.println(max);
	}

}
