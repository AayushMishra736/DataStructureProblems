package Hashset;

import java.util.HashSet;
import java.util.Spliterator;

public class Hashset1 {
	public static void main(String args[]) {
	HashSet<Integer> hasObj = new HashSet<>();
	hasObj.add(45);
	hasObj.add(34);
	hasObj.add(23);
	hasObj.add(12);
	Spliterator<Integer> s = hasObj.spliterator();
	s.forEachRemaining(System.out::println);
		
	}
}
