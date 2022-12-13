package String;

public class ReverseSentence {

	public static void main(String[] args) {
	String str = "My name is aayush mishra.";
	str  = str.substring(0, str.length()-1);
    String words[] = str.split(" ");
    String output = "";
    for(int i = words.length - 1;i >= 0;i--) {
    	output = output +words[i] + " ";
        }
    System.out.println(output);
	}
}
