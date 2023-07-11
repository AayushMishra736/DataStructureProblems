package Hashmap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class HashMapHighestsalary {

	public static void main(String[] args) {
	Map<String,Integer> map = new HashMap<String,Integer>();
	map.put("Tony",10000);
	map.put("Stark",12000);
	map.put("STEVE",11000);
	map.put("Hulk",15000);
	
	Collection<Integer> value= map.values();

	
	Integer finalmax = value.stream().mapToInt(v -> v).max().getAsInt();

	Integer max = value.stream().mapToInt(v -> v).max().getAsInt();
	
	
     System.out.println(finalmax);
	
	}

}
