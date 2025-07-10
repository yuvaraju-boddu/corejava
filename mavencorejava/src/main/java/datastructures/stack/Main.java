package datastructures.stack;

public class Main {

	public static void main(String[] args) {
		Stack obj = new Stack(5);

		obj.push(2);
		obj.push(1);
		obj.push(6);

		//obj.pop();
		
		obj.printList();

		obj.getTop();
		obj.getHeight();
		
		System.out.println("Minimum Value of Stack :"+obj.getMin());

	}

}
