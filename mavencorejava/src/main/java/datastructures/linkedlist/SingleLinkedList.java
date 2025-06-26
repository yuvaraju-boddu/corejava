package datastructures.linkedlist;

public class SingleLinkedList {
	
	private Node head;
	private Node tail;
	private int length;
	class Node{
		int value;
		Node next;
		Node(int value){
			this.value = value;
		}
	}
	
	public SingleLinkedList(int value) {
		
		Node newnode = new Node(value);
		head = newnode;
		tail = newnode;
		length = 1;
	}
	
	public void getHead() {
		System.out.println("Head: "+ head.value);
	}
	public void getTail() {
		System.out.println("Tail: "+ tail.value);
	}
	public void getLength() {
		System.out.println("Length: "+ length);
	}
	
	public void printList(){
		Node temp = head;
		while(temp !=null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}
	
	
	public void append(int value) {
		Node newnode = new Node(value);
		if(length == 0) {
			head = newnode;
			tail = newnode;
		}else {
			tail.next=newnode;
			tail=newnode;
		}
		length++;
	}
	
	public Node removelast(){
		if(length == 0) return null;
		Node temp = head;
		Node pre = head;
		while(temp.next !=null) {
			pre = temp;
			temp=temp.next;
		}
		pre = tail;
		tail.next = null;
		length--;
		
		if(length == 0) {
			head = null;
			tail =null;
		}
		return temp;
	}
	
	public void prepend(int value) {
		Node newnode = new Node(value);
		if(length == 0) {
			head = newnode;
			tail = newnode;
		}else {
			newnode.next=head;
			head=newnode;
		}
		length++;
	}
	
}
