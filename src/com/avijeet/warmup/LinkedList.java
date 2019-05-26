package com.avijeet.warmup;

class Node {
	int data;
	Node next;

	Node(int d) {
		data = d;
		next = null;
	}

	@Override
	public String toString() {
		return String.valueOf(data);
	}
}

public class LinkedList {

	public static Node insert(Node head, int data) {
		Node newNode = new Node(data);
		Node last = null;
		if (null == head) {
			return newNode;
		}
		last = head;
		while (last.next != null) {
			last = last.next;
		}
		last.next = newNode;
		return head;
	}

	public static void display(Node head) {
		Node start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {
		Node head = null;
		int N[] = { 1,1,1,1,1,1,1,1,1,1,1};

		for (int ele : N) {
			head = insert(head, ele);
		}

		display(head);
		head=	removeDuplicates(head);
		System.out.println();
		display(head);

	}

	public static Node removeDuplicates(Node head) {
		if (head == null) {
			return head;
		}

		Node start = head;

		while (start.next != null) {
			Node prevNode=start;
			start=start.next;
			if(prevNode.data==start.data){
				prevNode.next=start.next;
				start=head;
			}

		}
		return head;

	}
}
