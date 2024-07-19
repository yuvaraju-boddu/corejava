package exception;

import java.io.IOException;

public class MainException {
	public static void main(String[] args) throws IOException {
		Checked obj = new Checked();
		obj.meth1();
		System.out.println("Calling checked meth1");
		Unchecked obj1 = new Unchecked();
		obj1.meth1();
		System.out.println("Calling unchecked meth1 ");
		obj1.meth2();
		System.out.println(" Calling CustonException demo method)");
		try {
			obj1.customExceptionDemo();
		} catch (CustomException e) {
			e.printStackTrace();
		}
	}

}
