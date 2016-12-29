package com.jyothesh;

public class LinkedList {

	Node head;
	
	public void printList() {
		Node nextNode = head;
		
		while(nextNode != null){
			System.out.print(nextNode.data + " ");
			nextNode = nextNode.next;
		}
	}
	
	public static void main(String args[]) {
		LinkedList list = new LinkedList();
		
		list.head = new Node(1);
		Node second = new Node(2);
		Node three = new Node(3);
		
		list.head.next = second;
		second.next = three;
		
		list.printList();
	}
	
}
