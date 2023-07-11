package LinkedList;

import java.util.List;

public class InsertIntoSinglyLinkedList {

	public ListNode head;

	private static class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void display() {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.println("null");
	}

	public void length() {
		int count = 0;
		ListNode current = head;
		while (current != null) {
			count++;
			current = current.next;
		}
		System.out.println("Length of the list is :" + count);
	}

	void insertFirst(int data) {
		ListNode newNode = new ListNode(data);
		newNode.next = head;
		head = newNode;
	}

	void insertEnd(int data) {
		ListNode newNode = new ListNode(data);
		if (head == null) {
			head = newNode;
			return;
		}
		ListNode current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;
	}

	void insertAtPosition(int value, int pos) {
		ListNode node = new ListNode(value);
        if(pos == 1) {
        	node.next = head;
        	head = node;
        }
        else {
        	ListNode previous = head;
        	int count = 1;
        	while(count < pos - 1) {
        		previous = previous.next;
        		count++;
        	}
        	ListNode current = previous.next;
        	previous.next = node;
        	node.next = current;
        }
        
	}

	public static void main(String[] args) {
		InsertIntoSinglyLinkedList list = new InsertIntoSinglyLinkedList();
		list.head = new ListNode(10);
		ListNode first = new ListNode(11);
		ListNode second = new ListNode(12);
		ListNode third = new ListNode(13);
		ListNode fourth = new ListNode(14);
		list.head.next = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		list.display();
		list.length();
		list.insertFirst(9);
		list.display();
		list.insertEnd(16);
		list.display();
		list.insertAtPosition(1,4);
		list.display();
	}

}
