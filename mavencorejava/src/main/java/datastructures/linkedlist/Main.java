package datastructures.linkedlist;

public class Main {
	
	public static void main(String [] args) {
		SingleLinkedList list = new SingleLinkedList(2);
		
		list.append(7);
		list.append(1);
		
		//System.out.println("hi"+list.removelast().value);
		//list.removelast();
		
		list.prepend(0);
		
		list.getHead();
		list.getTail();
		list.getLength();
		
		list.printList();
	}

}
