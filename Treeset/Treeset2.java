package Treeset;

import java.util.Set;
import java.util.TreeSet;


class Book implements Comparable<Book>{
	int id;
	String name;
	String publication;
	String author;
	int quantity;
	Book(int id, String name, String publication, String author, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.publication = publication;
		this.author = author;
		this.quantity = quantity;
	}
	@Override
	public int compareTo(Book o) {
	if(id > o.id) {
		return 1;}
	else
		if(id < o.id) {
		return -1;
	}else
	return 0;
}
}

public class Treeset2 {
	public static void main(String[] args) {
	Set<Book> set = new TreeSet<Book>();
	set.add(new Book(102,"Vinci code","Galvin","Wiley",20));
	set.add(new Book(101,"Secret","Tata","Leonardo",10));
   
    
    for(Book b : set) {
    System.out.println(b.id + b.name +b.author + b.quantity +b.publication);	
    }
    
	}
}
