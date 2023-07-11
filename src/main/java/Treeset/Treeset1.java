package Treeset;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class Treeset1 {

	public static void main(String[] args) {
	TreeSet<String> tree = new TreeSet<String>();
	Collections.synchronizedSet(tree);
    tree.add("John");
    tree.add("Martin");
    tree.add("Ravi");  
    tree.add("Vijay");  
    tree.add("Ravi");  
    tree.add("Ajay");  
    
    Iterator<String> itr = tree.descendingIterator();
    while(itr.hasNext()) {
    System.out.println(itr.next());
    }
	}

}
