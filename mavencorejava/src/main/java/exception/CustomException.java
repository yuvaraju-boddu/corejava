package exception;

public class CustomException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//@Constructoroverriding
	public CustomException() {
		super();
	}

	public CustomException(String msg) {
		super(msg);
	}

}
