package Array;

public class Removeevenelement {

	public static void main(String[] args) {
	int a[] = {2,5,9,6,1,4,10,8};
	for(int i =0;i < a.length ;i++) {
	if(a[i] % 2 == 0) {
		continue;
	}
	System.out.print(a[i] + " ");
	  }
	}

}
