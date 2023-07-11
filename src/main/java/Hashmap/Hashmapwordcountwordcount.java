package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class Hashmapwordcountwordcount {

	public static void main(String args[]) {
	String str = "geeksforgeek";
	countWord(str);	
	}

	private static void countWord(String str) {
	Map<Character,Integer> map = new HashMap<Character,Integer>();
	for(int i = 0;i < str.length();i++) {
		if(map.containsKey(str.charAt(i))) {
			map.put(str.charAt(i), map.get(str.charAt(i))+ 1);
		}
		else {
			map.put(str.charAt(i), 1);
		}
		  
	}
	for(Map.Entry m: map.entrySet()) {
		System.out.println(m.getKey() +" "  +m.getValue());
	}
		
		
		
//    Map<Character,Integer> map = new HashMap<Character,Integer>();
//    for(int i =0 ;i < str.length();i++) {
//    	if(map.containsKey(str.charAt(i))) {
//        map.put(str.charAt(i), map.get(str.charAt(i))+1);
//        }	
//    	else {
//    		map.put(str.charAt(i), 1);
//    	}
//    }
//    
//	for(Map.Entry m: map.entrySet()) {
//		System.out.println(m.getKey() +" "  +m.getValue());
//	}
	}
}
