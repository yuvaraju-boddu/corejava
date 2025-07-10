package datastructure.queue;

public class QueueExample {

	private Node first;
	private Node last;
	private int length;

	class Node {
		int val;
		Node next;

		Node(int val) {
			this.val = val;
		}
	}

	public QueueExample(int val) {
		Node newnode = new Node(val);
		first = newnode;
		last = newnode;
		length = 1;

	}

	public void getFirst() {
		System.out.println("First Node of Queue: " + first.val);
	}

	public void getLast() {
		System.out.println("Last Node of the Queue: " + last.val);
	}

	public void getLength() {
		System.out.println(length);
	}

	public void printList() {
		Node temp = first;
		while (temp != null) {
			System.out.println(temp.val);
			temp = temp.next;
		}
	}

	public void enqueue(int val) {
		Node newnode = new Node(val);
		if (length == 0) {
			first = newnode;
			last = newnode;
		} else {
			last.next = newnode;
			last = newnode;
		}
		length++;

	}
	public Node dequeue() {
		if(length ==0) {
			return null;
		}
		Node temp=first;
		if(length ==1) {
			first = null;
			last = null;
		}else {
			first=temp.next;
			temp.next=null;
		}
		length--;
		return temp;
	}
	
}
