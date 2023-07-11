package Algorithm;

public class Linearsearch {

	public static void main(String[] args) {
	int a[]  =	{10, 20, 80, 30, 60, 50,110, 100, 130, 170};
	int k = 110;
	int result = search(a,k);
    System.out.println("Number present at index " + result);
	}

	private static int search(int a[],int k) {
	int result = 0;
	for(int i =0;i < a.length;i++) {
	if(k == a[i]) {
		result = i;
	    }
	}	
		return result;
	}
	
}
