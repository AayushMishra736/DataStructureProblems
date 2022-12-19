package LinkedList;

import java.util.LinkedList;

class Book {
	int id;
	String bookName;
	String bookPublication;
	String bookAuthor;
	Book(int id,String bookName,String bookPublication,String bookAuthor){
		this.id = id;
		this.bookName = bookName;
		this.bookPublication = bookPublication;
		this.bookAuthor = bookAuthor;
	}
}

public class LinkedList2  {

	public static void main(String[] args) {
	LinkedList<Book> linkedlist = new LinkedList<Book>();
	linkedlist.add(new Book(101,"Let us C","Yashwant Kanetkar","BPB"));  
	linkedlist.add(new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill"));  
	linkedlist.add(new Book(103,"Operating System","Galvin","Wiley")); 
	for(Book b : linkedlist) {
	System.out.println(b.id + " " + b.bookName + " " + b.bookAuthor + " " + b.bookPublication);	
	}

	}
}