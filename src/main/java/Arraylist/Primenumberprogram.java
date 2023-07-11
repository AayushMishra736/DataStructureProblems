package Arraylist;

public class Primenumberprogram {
	public static void main(String[] args) {
	for(int i = 2;i < 51;i++) {
		int isPrime = 0;
		for(int j = 2;j < i/2;j++) {
			if(i % j == 0) {
				isPrime = 1;
				break;
			}
	   }
	if(isPrime == 0) {
		System.out.print(i + " ");
	}
	}		
  }
}
