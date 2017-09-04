package org.sahu.geeksforgeeks.list;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
	}
}

public class LinkedList {
	static int count = 0;
	static Node head = null;

	public static void main(String[] args) {
		insertAtEnd(40);
		insertAtEnd(10);
		insertAtEnd(8);
		insertAtEnd(50);
		System.out.println("Number of node: " + getNodeCount());
		System.out.println("------------------------");
		traverse();
		insertAtBegin(88);
		insertAtBegin(5);
		System.out.println("------------------------");
		System.out.println("Number of node: " + getNodeCount());
		traverse();
		System.out.println("-------------------------");
		insertAtMiddle(15, 3);
		traverse();
	}

	public static void insertAtEnd(int data) {
		if (head == null) {
			head = new Node(data);
		} else {
			Node start = head;
			while (start.next != null) {
				start = start.next;
			}
			Node node = new Node(data);
			start.next = node;
		}
		count++;
	}

	public static void insertAtBegin(int data) {
		if (head == null) {
			head = new Node(data);
		} else {
			System.out.println("beginning part: data: " + data);
			Node node = new Node(data);
			node.next = head;
			head = node;
		}
		count++;
	}

	public static void insertAtMiddle(int data, int position) {
		if (position <= 0) {
			position = 1;
		} else if (position > count) {
			position = count;
		}
		if (head == null) {
			head = new Node(data);
		} else {
			Node start = head;
			int cc = 1;
			Node ptr = null;
			while (start != null) {
				if (cc == position) {
					Node node = new Node(data);
					node.next = start;
					ptr.next = node;
					count++;
					break;
				}
				cc++;
				ptr = start;
				start = start.next;
			}
		}
		count++;

	}

	public static int getNodeCount() {
		return count;
	}

	public static void traverse() {
		if (head == null) {
			return;
		}
		Node start = head;
		while (start != null) {
			System.out.println(start.data);
			start = start.next;
		}
	}

}
