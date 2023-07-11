package Hashmap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;

public class ConvertHashmapToArraylist {

	public static void main(String[] args) {
	HashMap<String,Integer> map = new HashMap<>();
	map.put("India", 101);
	map.put("Australia",102);
	map.put("Amazon", 103);
	
	Set<Map.Entry<String, Integer>> entryset = map.entrySet();
	
	ArrayList<Map.Entry<String, Integer>> al = new ArrayList<Map.Entry<String, Integer>>(entryset);
	
	System.out.println(al);
	
	Optional<Integer> max = map.entrySet().stream().map(v -> v.getValue()).sorted(Comparator.reverseOrder()).findFirst();
			
			
	System.out.println(max);

	}

}
