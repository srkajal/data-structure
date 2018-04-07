package org.mallick.datastructure.hashtable;

public class PersonLinkedList {
	
	private Node head;
	private Node tail;
	
	public boolean insertNode(Person person) {
		Node node = head;
		
		Node newNode = new Node(person, null);
		
		if(node == null) {
			head = newNode;
			tail  = newNode;
			
			return true;
		}
		
		else {
			/*while(node.next != null) {
				node = node.next;
			}*/
			
			tail.next = newNode;
			tail = newNode;
			
			return true;
		}

	}
	
	public Node findPersonByRollNo(String rollNo) {
		Node node = head;
		
		while(node != null) {
			if(rollNo.equals(node.getPerson().getRollNo())) {
				return node;
			}
			
			node = node.next;
		}
		
		return null;
	}
	
	public void show() {
		Node node = head;
		System.out.println("New List:");
		while(node != null) {
			System.out.println(node.getPerson());
			
			node = node.next;
		}
	}
	
	public class Node{
		private Person person;
		private Node next;
		
		public Node(Person person, Node next) {
			super();
			this.person = person;
			this.next = next;
		}

		public Person getPerson() {
			return person;
		}

		public void setPerson(Person person) {
			this.person = person;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
		
		
		
	}

}
