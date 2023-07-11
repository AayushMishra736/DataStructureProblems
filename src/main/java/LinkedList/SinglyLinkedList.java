package LinkedList;

public class SinglyLinkedList {

    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void display() {
        ListNode currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + "-->");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    void length() {
        int sum = 0;
        ListNode curreNode = head;
        while (curreNode != null) {
            sum = sum + 1;
            curreNode = curreNode.next;
        }
        System.out.println("length is " + sum);
    }

    void insertAtFirst(int value) {
        ListNode currentNode = new ListNode(value);
        currentNode.next = head;
        head = currentNode;
    }

    void deleteAtFirst(){
        ListNode previousNode = head;
        head = previousNode.next;
        previousNode = null;
    }

    void insertAtEnd(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }


    void insertAtGivenPosition(int pos, int value)
    {
        ListNode newNode = new ListNode(value);
        if(pos == 1){
            head = newNode;
        }
        else{
            ListNode previousNode = head;
            int count = 0;
            while(count < pos - 1){
                previousNode = previousNode.next;
                count++;
            }
            ListNode currentNode = previousNode.next;
            newNode.next = currentNode;
            previousNode.next = newNode;
        }
    }

    void deleteAtGivenPosition(int pos){
        if(pos == 1){
            head = head.next;
        }
        else{
            ListNode previous = head;
            int count = 0;
            while(count < pos - 1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList sl = new SinglyLinkedList();
        sl.head = new ListNode(1);
        ListNode first = new ListNode(2);
        ListNode second = new ListNode(3);
        ListNode third = new ListNode(4);
        sl.head.next = first;
        first.next = second;
        second.next = third;
        sl.display();
        sl.length();
        System.out.println("Insert at first.");
        sl.insertAtFirst(0);
        sl.display();
        System.out.println("Insert at end.");
        sl.insertAtEnd(5);
        sl.display();
        System.out.println("Insert at given position.");
        sl.insertAtGivenPosition(3, 6);
        sl.display();
        System.out.println("Delete from given position.");
        sl.deleteAtGivenPosition(4);
        sl.display();
        System.out.println("Delete from first position.");
        sl.deleteAtFirst();
        sl.display();
        System.out.println("Delete from end position.");
        sl.deleteFromEnd();
        sl.display();
    }

}