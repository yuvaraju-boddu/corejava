package java8Features;

public class Function implements FunctionalInterface {
	
	public void sayHi() {
		System.out.println("With out lambadExpression in FunctionalInterface");
	}
	
	public static void main(String args []) {
		Function fun = new Function();
		fun.sayHi();
	}

}
