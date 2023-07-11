package Programs;

public class LargestNumber {

	public static void main(String[] args) {
    int a = 10,b =40,c = 30;
    if(a > b && a > c) {
    	System.out.println("A is greater");
    }
    else 
    	if(b > a && b > c) {
    		System.out.println("B is greater");	
    	}
    	else
    		if(c > a && c > b) {
    			System.out.println("C is greater");
    		}
	}
}
