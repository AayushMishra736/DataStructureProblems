package Array;

public class PalindromeOfString {

	public static void main(String[] args) {
	String s = "rrrr";
	String reverse = "";
	char ch[];
    for(int i = 0;i < s.length();i++) {
    ch = s.toCharArray();
    reverse = ch[i] + reverse;	
    }
    boolean isPalindrome  = isPalindrome(s);   
    if(s.equals(reverse) || isPalindrome) {
    	System.out.println("String is palindrome.");
    }
    else {
    	System.out.println("String is not a palindrome.");	
    }
     
	}

	private static boolean  isPalindrome(String s) {
	char ch[] = s.toCharArray();
	int start = 0;
	int end = s.length() - 1;
	while(start < end) {
	if(ch[start] != ch[end]) {
		return false;
	       }
	start++;
	end--;
	   }
	return true;
	}
}
