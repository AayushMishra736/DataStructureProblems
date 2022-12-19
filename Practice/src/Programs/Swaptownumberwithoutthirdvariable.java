package Programs;

public class Swaptownumberwithoutthirdvariable {

	public static void main(String[] args) {
	int a = 10;
	int b = 20;
	b = a + b;
	a = b - a;
	b = b - a;
	System.out.print("a : " + a + " b ; " + b);
	}

}
