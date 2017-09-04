package geekforgeeksPractice;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
	}
}

public class LinkedList1 {
	public static Node head = null;
	public static int length = 0;

	public static void main(String args) {
		insertAtBegin(30);
		insertAtBegin(2);
		insertAtBegin(8);
		insertAtBegin(44);
		insertAtBegin(71);
		insertAtBegin(1);
		System.out.println("size is: "+size());
	}

	public static void insertAtBegin(int data) {
		if (head == null) {
			head = new Node(data);
		} else {
			Node node = new Node(data);
			node.next = head;
			head = node;
			length++;
		}
	}

	public static int size() {
		return length;
	}
}
