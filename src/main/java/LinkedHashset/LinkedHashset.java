package LinkedHashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashset {

	public static void main(String[] args) {
	LinkedHashSet<String> set=new LinkedHashSet();  
	set.add("Up");
	set.add("Left");
	set.add("Down");
	set.add("Right");
	Iterator<String> iterator = set.iterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	}

}
