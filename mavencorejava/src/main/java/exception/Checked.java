package exception;

import java.io.IOException;

public class Checked // examples of checked exceptions all IO exceptions only compile time errors.
{
	void meth1() throws IOException {
		int a[] = new int[3];
		try {
			System.out.println("Display the a index value " + a[3]);
			System.out.println("Checked.meth1()");

		} catch (Exception e) {
			System.err.println(e.getMessage());
			throw new IOException();
		}
	}
}
