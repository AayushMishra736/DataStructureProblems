package Arraylist;

import java.util.ArrayList;

public class Arraylist2 {
	
	public static void main(String args[]) {
    ArrayList<String> list = new ArrayList<>();
    list.add("Ravi");
    list.add("Vijay");
    list.add("Tezza");
    list.add("John");
    list.add("Rohan");
    
    for(String i: list) {
    	System.out.println(i);
    }
    ArrayList al = (ArrayList) list.clone();
	
    
    System.out.println(al);
	}
}
