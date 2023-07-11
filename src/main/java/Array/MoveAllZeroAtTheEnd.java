package Array;

import java.util.Arrays;

public class MoveAllZeroAtTheEnd {
	public static void main(String[] args) {
		int a[] = { 0, 3, 4, 0, 10, 12, 6 };
		traverseAllToTheEnd(a);
		System.out.print(Arrays.toString(a));
	}

	private static void traverseAllToTheEnd(int a[]) {
		int n = a.length;
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] != 0) {
				a[count++] = a[i];
			}
		}
		while (count < n) {
        a[count] = 0;
        count++;
		}
	}
}
