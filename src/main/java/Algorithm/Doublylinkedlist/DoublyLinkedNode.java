package Algorithm.Doublylinkedlist;

public class DoublyLinkedNode {

	private int data;
	private DoublyLinkedNode nextNode;
	private DoublyLinkedNode previuosNode;
	
	public DoublyLinkedNode(int data) {
		this.data = data;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public DoublyLinkedNode getNextNode() {
		return nextNode;
	}
	public void setNextNode(DoublyLinkedNode nextNode) {
		this.nextNode = nextNode;
	}
	public DoublyLinkedNode getPreviuosNode() {
		return previuosNode;
	}
	public void setPreviuosNode(DoublyLinkedNode previuosNode) {
		this.previuosNode = previuosNode;
	}	
}


