package Algorithm.Doublylinkedlist;

import Algorithm.Linkedlist.Node;

public class DoublyEndList {
	
	private Node head;
	private Node tail;
	
	public void insertAtTail(int data) {
		Node newNode = new Node(data);
		
		if(this.head == null) {
		this.head = newNode;
		}
		
		if(this.tail != null) 
		this.tail.setNextNode(newNode);
		this.tail = newNode;
		
	}

	public String toString() { 
	String result = "{";
	Node current = this.head;
	
	while(current != null) {
	result += current.toString() + ",";	
	current = current.getNextNode();	
	   }
	result += "}";
	return result;
	}
	
}
