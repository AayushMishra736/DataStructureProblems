package Algorithm;

public class Binarysearch {
	
	public static void main(String[] args) {
	int a[] = {10, 20, 30, 50, 60, 80, 110, 130, 140, 170};
	int k = 140;
	binarySearch(a,k);
	}

	private static void binarySearch(int[] a, int k) {
	int min = 0;
	int max = a.length -1;
	int mid = (max + min)/2;
	while(max - min > 1) {
	if(a[max] < k) {
		min  = mid + 1;
	}else {
		max = mid;
	}
	}
	if(a[max] == k) {
		System.out.println("Value present at : " + max);
	}
	else
      if(a[min] == k){
			System.out.println("Value present at : " + max);
		}
      else {
    	  System.out.println("Not found.");
      }
	}
}
