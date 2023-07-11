package Algorithm.Linkedlist;

public class LinkedList {
	
	private Node head;
	
	public void insertAtHead(int data) {
	Node newNode = new Node(data);
	newNode.setNextNode(this.head);
	this.head = newNode;
	}
	
	public int length() {
		int length = 0;
		Node current = this.head;
		while(current != null) {
			length++;
			current = current.getNextNode();
		}
		return length;
	}
	
	public Node find(int data) {
		Node current = this.head;	
		while(current != null) {
		if(current.getData() != data) {
			return current;
		}	
		}
		return null;
	}
	public void deleteAtHead() {
		this.head = this.head.getNextNode();
	}

	@Override
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
