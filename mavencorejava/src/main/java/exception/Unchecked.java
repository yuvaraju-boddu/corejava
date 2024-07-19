package exception;

public class Unchecked {

	// private String str=null;

	void meth1() {
		int[] a = new int[2];
		String str = null;

		try {
			System.out.println("Index value " + a[1]);
			System.out.println("");
			System.out.println(str.length());
		} catch (ArrayIndexOutOfBoundsException e1) {
			System.err.println(e1.getMessage());
			throw new ArrayIndexOutOfBoundsException();
		} catch (NullPointerException e2) {
			System.err.println("NPE for str " + e2.getMessage());
			// throw new NullPointerException(); //when you place this line of code stop
			// execution because throw break the message from user (calling one)

		}

	}

	void meth2() {
		String strDemo = "xy";
		try {
			System.out.println(strDemo.length());
		} catch (NullPointerException e) {
			System.err.println(" Str Demo :  " + e.getMessage());
			throw new NullPointerException();
		}
	}

	public void customExceptionDemo() throws CustomException {
		String strDemo = null;
		try {
			System.out.println(strDemo.length());
		} catch (Exception e) {
			System.err.println(" Str Demo :  " + e.getMessage());
			throw new CustomException("Exception from CustomException Demo");
		}
	}
}
