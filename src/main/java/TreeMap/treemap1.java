package TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class treemap1 {

	public static void main(String args[]) {
	TreeMap<Integer,String> treemap = new TreeMap<>();
	treemap.put(102,"Abhay");
	treemap.put(104,"John");
	treemap.put(103,"Peter");
	treemap.put(101,"Vijay");
	for(Map.Entry n : treemap.entrySet()) {
		System.out.println(n.getKey() + " " +n.getValue());
	}
  }
}