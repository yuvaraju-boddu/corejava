package examples_interface;

public abstract class ClassInterface implements MyInterface {

	@Override
	public void interfacemethod() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("ClassInterface.interfacemethod()" + i);
		}
	}

}
