package oops;

public class Parent {

	public void parent() {
		System.out.println("Its parent class");
	}
	public static void main(String[] args) {
		Child2 mychild = new Child2();
		mychild.parent();
		mychild.child1();
		mychild.child2();
	}
}
