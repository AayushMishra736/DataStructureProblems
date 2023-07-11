package Algorithm.Linkedlist;

public class Linkedlistinsertion {

	public static void main(String[] args) {
	LinkedList list = new LinkedList();
	list.insertAtHead(24);
	list.insertAtHead(12);
	list.insertAtHead(11);
	list.insertAtHead(10);
	list.insertAtHead(34);
	list.insertAtHead(45);
	list.insertAtHead(56);
	list.insertAtHead(43);
	list.insertAtHead(23);
	list.deleteAtHead();
	list.deleteAtHead();
	System.out.println("List :" + list);
	System.out.println("Length : " +list.length());
	System.out.println("Node value : " + list.find(34));
	}

}
