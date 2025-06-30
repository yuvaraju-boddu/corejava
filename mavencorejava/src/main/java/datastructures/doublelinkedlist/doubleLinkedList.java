package datastructures.doublelinkedlist;

public class doubleLinkedList {

	private Node head;
	private Node tail;
	private int length;

	public class Node {
		int val;
		Node next;
		Node pre;

		public Node(int val) {
			this.val = val;
		}
	}

	public doubleLinkedList(int val) {
		Node newnode = new Node(val);

		head = newnode;
		tail = newnode;
		length = 1;
	}

	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.val);
			temp = temp.next;
		}
	}

	public void getHead() {
		System.out.println("Head: " + head.val);
	}

	public void getTail() {
		System.out.println("Tail: " + tail.val);
	}

	public void getLength() {
		System.out.println("Length: " + length);
	}

	public void append(int val) {
		Node newnode = new Node(val);
		if (length == 0) {
			head = newnode;
			tail = newnode;
		} else {
			tail.next = newnode;
			newnode.pre = tail;
			tail = newnode;
		}
		length++;
	}

	public Node removeLast() {
		Node temp = tail;
		try {
			if (length == 0) {
				return null;
			}

			if (length == 1) {
				head = null;
				tail = null;
			} else {
				temp.pre = tail;
				tail.next = null;
				temp.next = null;
			}
			length--;

		} catch (Exception e) {
			System.err.println("Null value" + e);
		}
		return temp;
	}

	public void prepend(int val) {
		Node newnode = new Node(val);
		if (length == 0) {
			head = newnode;
			tail = newnode;
		} else {
			newnode.next = head;
			head.pre = newnode;
			head = newnode;
		}
		length++;
	}

	public Node removeFirst() {
		Node temp = head;
		if (length == 0) {
			return null;
		}
		if (length == 1) {
			head = null;
			tail = null;
		} else {
			head.next = head;
			head.pre = null;
			temp.next = null;
			length--;
		}
		return temp;
	}

	public Node get(int index) {
		if (index < 0 || index >= length) {
			return null;
		}
		Node temp = head;
		if (index < length / 2) {
			for (int i = 0; i < index; i++) {
				temp = temp.next;
			}
		} else {
			temp = tail;
			for (int i = length - 1; i > index; i++) {
				temp = temp.pre;
			}
		}
		return temp;
	}

	public boolean set(int index, int val) {
		Node temp = get(index);
		if (temp != null) {
			temp.val = val;
			return true;
		}
		return false;
	}

	public boolean insert(int index, int val) {
		if (index < 0 || index > length) {
			return false;
		}
		if (index == 0) {
			prepend(val);
			return true;
		}
		if (index == length) {
			append(val);
			return true;
		}
		Node newnode = new Node(val);
		Node before = get(index - 1);
		Node after = before.next;
		newnode.next = after;
		newnode.pre = before;
		after.pre = newnode;
		before.next = newnode;
		length++;
		return true;
	}

}
