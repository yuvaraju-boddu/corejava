package datastructures.linkedlist;

public class SingleLinkedList {
	
	private Node head;
	private Node tail;
	private int length;
	
	//Node Class with value and node 
	class Node{
		int value;
		Node next;
		//node constructore with passing the value
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
	
	//printlist to display the list values
	public void printList(){
		Node temp = head;
		while(temp !=null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}
	
	//append function new value adding end of the linkedlist 
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
	
	//removeLast node in list 
	public Node removeLast(){
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
	
	public Node removeFirst() {
		if(length == 0) return null;
		Node temp = head;
		head = head.next;
		temp.next=null;
		length--;
		if(length == 0) {
			tail =null;
		}
		return temp;
	}
	
	public Node get(int index) {
		
		if(index<0 || index>=length) {
			return null;
		}
		Node temp=head;
		for(int i=0;i<index;i++) {
			temp=temp.next;
		}
		return temp;
	}
	
	public boolean set(int index, int value) {
		Node temp=get(index);
		if(temp !=null) {
			temp.value=value;
			return true;
		}
		return false;
	}
	
	public boolean insert(int index, int value) {
		if(index < 0 || index > length) {
			return false;
		}
		if(index == 0) {
			prepend(value);
			return true;	
		}
		if(index == length) {
			append(value);
			return true;
		}
		Node newnode = new Node(value);
		Node temp = get(index-1);
		newnode.next=temp.next;
		temp.next=newnode;
		length++;
		return true;
	}
	
	public Node remove(int index) {
		if(index<0 || index >= length) {
			return null;
		}
		if(index == 0) {
			return removeFirst();
		}
		if(index == length-1) {
			return removeLast();
		}
		Node pre = get(index-1);
		Node temp = pre.next;
		pre.next = temp.next;
		temp.next= null;
		length--;
		return temp;
	}
	
	public void reverse() {
		Node temp = head;
		head      = tail;
		tail    = temp;
		Node After = temp.next;
		Node before = null;
		for(int i=0;i<length;i++) {
			After = temp.next;
			temp.next = before;
			before =temp;
			temp = After;
		}
	}
}
