package com.Day14.Linkedlist.mahant;


import java.util.Scanner;

public class LinkedList {
	Node head;

	class Node {
		Object data;
		Node ref;

		Node(Object data) {
			this.data = data;
		}
	}

	public void addFirst(Object data) {
		Node newNode = new Node(data);
		newNode.ref = head;
		head = newNode;
	}

	public void addLast(Object data) {
		Node newNode = new Node(data);
		Node temp = head;
		if (head == null)
			head = newNode;
//		else if(head.ref == null)
//			head.ref = newNode;
		else {
			while (temp.ref != null) {
				temp = temp.ref;
			}
			temp.ref = newNode;
		}
	}

	public void addAtPosition(Object data, int position) {
		int index = 0;
		Node newNode = new Node(data);
		Node left = head;
		Node right = left.ref;

		/*
		 * position-1 is used because the value of index will be incremented and stops
		 * before the position at which user wants to add the node
		 */
		while (index < (position - 1)) {

			left = left.ref;
			right = right.ref;
			index++;
		}
		/*
		 * if we do index < position is used because the value of index will be
		 * incremented and will point to the index user has entered and the new element
		 * will be added after the entered position
		 */
		newNode.ref = right;
		left.ref = newNode;
	}

	public Object display() {
		int values = 0;
		Node temp = head;
		while (temp != null) {
			values++;
			if (temp.ref != null)
				System.out.print(temp.data + " > ");
			else
				System.out.println(temp.data);
			temp = temp.ref;
		}
		return "The size of list: " + values;
	}

	public void deleteFirst() {
		head = head.ref;
	}

	public void deleteLast() {

		if (head == null)
			System.out.println("Linked List is Empty");
		else if (head.ref == null)
			head = null;
		else {
			Node temp = head;
			while (temp.ref.ref != null) {
				temp = temp.ref;
			}
			temp.ref = null;
		}
	}

	public Object searchElement(Object input) {
		Node temp = head;
		int index = 0;
		while (temp != null) {
			index++;
			if (temp.data == input) {
				String res = temp.data + " found at index " + index;
				return res;
			}
			temp = temp.ref;
		}
		return null;
	}

	public void insertElement(Object input, Object value) {
		Node newNode = new Node(value);
		Node temp = head;
		/*
		 * first while loop is to find the element after which user wants to add new
		 * element
		 */
		int index = 0;
		while (temp.data != input) {
			index++;
			temp = temp.ref;
		}
		/*
		 * second while loop is to add the value i.e new node to the linked list
		 */
		Node left = head;
		Node right = left.ref;
		int index1 = 0;
		while (index1 < index) {
			index1++;
			left = left.ref;
			right = right.ref;
		}
		newNode.ref = right;
		left.ref = newNode;
	}

	public void deleteAtPosition(Object data) {
		int index = 0;
		Node left = head;
		Node right = left.ref;
		while (right.data != data) {
			left = left.ref;
			right = right.ref;
			index++;
		}
		left.ref = right.ref;

	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		System.out.println("Welcome to LinkedList program");
		Scanner sc = new Scanner(System.in);
		list.addFirst(56);
		list.addLast(30);
		list.addLast(40);
		list.addLast(70);
		list.display();
		
		
		list.deleteAtPosition(40);
		System.out.println(list.display());

	}

}