package datastructures.stack;

public class Stack {
	private Node top;
	private int height;

	public class Node {
		int val;
		Node next;

		public Node(int val) {
			this.val = val;
		}
	}

	public Stack(int val) {
		Node newnode = new Node(val);
		top = newnode;
		height = 1;
	}

	public void printList() {
		Node temp = top;
		while (temp != null) {
			System.out.println(temp.val);
			temp = temp.next;
		}
	}

	public void getTop() {
		System.out.println("Top   : " + top.val);
	}

	public void getHeight() {
		System.out.println("Height: " + height);
	}

	public void push(int val) {
		Node newnode = new Node(val);
		if (height == 0) {
			top = newnode;
		} else {
			newnode.next = top;
			top = newnode;
		}
		height++;
	}

	public Node pop() {
		if (height == 0) {
			return null;
		}
		Node temp = top;
		top = temp.next;
		temp.next = null;
		height--;
		return temp;
	}

}
