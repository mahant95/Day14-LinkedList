package com.Day14.Linkedlist.mahant;

public class LinkedList {
	Node head;
	class Node
	{
		Object data;
		Node ref;
		Node(Object data)
		{
			this.data = data;
		}
	}
	public void elements(Object data)
	{
		Node newNode = new Node(data);
		System.out.print(newNode.data+" ");
	}
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		System.out.println("Welcome to LinkedList program");
		list.elements(56);
		list.elements(30);
		list.elements(70);
	}
	
}