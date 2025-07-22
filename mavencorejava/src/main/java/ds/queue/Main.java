package datastructure.queue;

public class Main {
	public static void main(String[] args) {
		QueueExample obj = new QueueExample(5);
		
		obj.enqueue(4);
		
		obj.dequeue();
		
		obj.printList();
		
		obj.getFirst();
		obj.getLast();
		obj.getLength();
	}

}
