package Programs;

public class Primenumberprogram {

	public static void main(String[] args) {
    boolean isPrime = false;
    int num = 29;
    for(int i = 2;i < num;i++) {
    if(num % i ==0) {
    	isPrime = true;
    }
       }
    if(!isPrime) {
    	System.out.println("Number is prime number");
    }
    else {
    	System.out.println("Number is not a prime number");
    }
	}

}
