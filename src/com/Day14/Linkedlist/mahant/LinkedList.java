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
	public void addFirst(Object data)
	{
		Node newNode = new Node(data);
		newNode.ref = head;
		head = newNode;
	}
	public void addLast(Object data)
	{
		Node newNode = new Node(data);
		Node temp = head;
		if(head == null)
			head = newNode;
//		else if(head.ref == null)
//			head.ref = newNode;
		else
		{
			while(temp.ref != null)
			{
				temp = temp.ref;
			}
			temp.ref = newNode;
		}
	}
	public void display()
	{
		Node temp = head;
		while(temp != null)
		{
			if(temp.ref != null)
				System.out.print(temp.data+" > ");
			else
				System.out.println(temp.data);
			temp = temp.ref;
		}
		
	}
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		System.out.println("Welcome to LinkedList program");
		System.out.println("Add nodes at first");
		list.addFirst(70);
		list.display();
		list.addFirst(30);
		list.display();
		list.addFirst(56);
		list.display();
		System.out.println("Add nodes at last");
		list.addLast(56);
		list.display();
		list.addLast(30);
		list.display();
		list.addLast(70);
		list.display();
		
	}
	
}