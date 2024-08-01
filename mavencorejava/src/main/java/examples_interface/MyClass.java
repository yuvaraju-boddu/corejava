package examples_interface;

public abstract class MyClass implements MyInterface {

	@Override
	public void interfacemethod() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("MyClass.method()" + i);
		}
	}



}
