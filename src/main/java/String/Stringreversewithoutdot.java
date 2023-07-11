package String;

public class Stringreversewithoutdot {

	public static void main(String[] args) {
	String str = "My name is aayush mishra.";
	reverseString(str);
	}

	private static void reverseString(String str) {
	String words[] = str.split(" ");
	for(int i = words.length - 1;i >= 0;i--) {
	boolean punctuate = i <= 0 || words[i - 1].contains(".");
	if(!words[i].contains(".")) {
		System.out.print(words[i]);
	}
	else {
		System.out.print(words[i].substring(0,words[i].length() - 1));
	 }
	System.out.print(punctuate ? ". " : " ");
    }
	}
}

//		
//		
//		
//	String words[] = str.split(" ");
//	for(int i = words.length - 1;i >= 0;i--) {
//	boolean punctuate = i <= 0 || words[i - 1].contains(".");
//	if(!words[i].contains(".")) {
//		System.out.print(words[i]);
//	}
//	else {
//		System.out.print(words[i].substring(0,words[i].length() - 1));
//	}
//	System.out.print(punctuate ? ". " : " ");
//	   }
//	}
//}