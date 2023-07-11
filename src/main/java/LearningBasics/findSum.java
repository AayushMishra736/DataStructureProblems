package LearningBasics;

import java.util.Scanner;

public class findSum {

	public static void main(String[] args) {
	System.out.println("----Calculate using for loop.----");
	System.out.print("Enter the digit: ");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	findByForLoop(n);
	finByFormula(n);
	}
	
	
	private static void finByFormula(int n) {
		double now =  System.currentTimeMillis();
		double sum = n *(n + 1)/2;
	    System.out.println("Sum is " + sum);
	    System.out.println("Total time taken by formula    " + (System.currentTimeMillis() - now));
		
	}


	private static void findByForLoop(int n) {
	int sum = 0;
	double now =  System.currentTimeMillis();
	for(int i = 1;i < n;i++) {
		sum = sum + i;
	}
    System.out.println("Sum is " + sum);
    System.out.println("Total time taken by for loop " + (System.currentTimeMillis() - now));
	}

}
