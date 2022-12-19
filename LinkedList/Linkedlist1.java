package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;


public class Linkedlist1 {

	public static void main(String[] args) {
		 LinkedList<String> ll=new LinkedList<String>();  
         ll.add("Ravi");  
         ll.add("Vijay");  
         ll.add("Ajay");  
         ll.add("Anuj");  
         ll.add("Gaurav");  
         ll.add("Harsh");  
         ll.add("Virat");  
         ll.add("Gaurav");  
         ll.add("Harsh");  
         ll.add("Amit");  
         Iterator<String> itr = ll.descendingIterator();
	     while(itr.hasNext()) {
	    	 System.out.println(itr.next());
	     }
	}

}
