package datastructures.linkedlist;

public class Main {

	public static void main(String[] args) {
		SingleLinkedList list = new SingleLinkedList(2);

		list.append(7);

		// System.out.println("hi"+list.removelast().value);
		// list.removelast();

		list.prepend(0);

		// list.removeFirst();

		System.out.println("get function " + list.get(2).value);

		System.out.println(list.set(0, 5));

		list.insert(3, 1110);

		// list.remove(1);

		list.reverse();

		list.getHead();
		list.getTail();
		list.getLength();

		list.printList();
	}

}
