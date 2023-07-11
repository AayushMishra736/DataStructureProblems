package Arraylist;

public class Wordfrequency {

	public static void main(String[] args) {
	String str = "asdfdsadfafd";	
	int freq[] = new int[26];
	for(int i =0;i < str.length();i++) {
		freq[str.charAt(i)- 'a']++;
	}
	
	for(int j = 0;j < str.length();j++) {
	if(freq[str.charAt(j) - 'a'] != 0) {
	System.out.print(str.charAt(j));
	System.out.print(freq[str.charAt(j) - 'a'] + " ");
	freq[str.charAt(j) - 'a'] = 0;
	     }	
	   }
	} 
}
