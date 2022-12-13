package Hashmap;

import java.util.ConcurrentModificationException;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashmap {
	
	public static void main(String args[]) {
	ConcurrentHashMap<String,Integer> conhashmap = new ConcurrentHashMap<String,Integer>();	
	conhashmap.put("1", 101);
	conhashmap.put("2", 102);
	conhashmap.put("3", 103);
	conhashmap.put("4", 104);
	conhashmap.put("5", 105);
	conhashmap.put("6", 106);	
	System.out.println("The values for concurrent hashmap is" + conhashmap);
	
	}
}
