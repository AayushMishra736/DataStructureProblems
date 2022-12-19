package Programs;

public class Factorialofnumber {

	public static void main(String[] args) {
	int fact = 1;;
	for(int i = 1;i <= 30;i++) {
		fact = fact * i;
	}
    System.out.print("Factorial of a number " + fact);
	
	}

}
