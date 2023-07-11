package Algorithm.Doublylinkedlist;

public class DoublyLinkedList {

   private DoublyLinkedNode head;
	
   public void insertAtHead(int data) {
	   DoublyLinkedNode newNode = new DoublyLinkedNode(data);
	   newNode.setNextNode(this.head);
	   if(this.head == null) {
		   this.head.setPreviuosNode(newNode);
	   }
	   this.head = newNode;
   }
   
    public int length() {
    DoublyLinkedNode current = this.head;
    int length = 0;	
    if(head == null)
    	return 0;
    while(head != null) {
    	length += 1;
    	current = current.getNextNode();
    }
    return length;
    }

}
