package String;

import java.util.regex.Pattern;

public class ReverseSentence2 {

	public static void main(String[] args) {
    String s1 = "Welcome to geeksforgeeks";
	System.out.println(reverseWords(s1));
	}

	private static String reverseWords(String s) {
	Pattern pattern = Pattern.compile("\\s");
	String[] temp = pattern.split(s);
    String reverse = "";
    for(int i = 0;i < temp.length;i++) {
    	if(i == temp.length - 1) {
    		reverse = temp[i] + reverse;
    	}
    	else {
    		result = " " + result + 
    	}
      }	
	}
}
