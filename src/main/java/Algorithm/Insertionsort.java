package Algorithm;

public class Insertionsort {

	public static void main(String[] args) {
	int a[]= {34,56,12,13,23,43,24};
	insertionSort(a);
	for(Integer i : a) {
		System.out.print(i + " ");
	}
	}

	private static void insertionSort(int[] a) {
	int n = a.length;
	for(int i = 1;i < n;i++) {
	int key = a[i];
	int j = i - 1;
	while((j > -1) && (a[j] > key)) {
		a[j + 1] = a[j];
		j--;
	    }
	a[j + 1] = key;
	  }
	}
}
