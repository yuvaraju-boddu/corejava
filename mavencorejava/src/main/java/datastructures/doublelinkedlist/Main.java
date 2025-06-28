package datastructures.doublelinkedlist;

public class Main {
	
	public static void main(String [] args) {
		
		doubleLinkedList dll = new doubleLinkedList(4);
		
		dll.removeLast();
		
		dll.prepend(1);
		
		//dll.removeLast();
		
		dll.append(5);
		
		
		
		dll.printList();
		
		dll.getHead();
		dll.getTail();
		dll.getLength();
	}

}
