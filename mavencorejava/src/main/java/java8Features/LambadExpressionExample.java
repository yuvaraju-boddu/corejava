package java8Features;

public class LambadExpressionExample {
	
	public static void main(String[] args) {
		//LambadExpressionExample obj = new LambadExpressionExample();
		
		//(a,b) ->{(body of lambad expression;}; no.of statement into single line code by using lanbadexpression to code reusebleity
		FunctionalInterface function =() -> { System.out.println("This is LambadExpressioon Example ");
		System.out.println("Second statement in lambadaexpression");System.out.println("Thrid Statemenet in LambadExpression ");
			
		};
		function.sayHi();
	}

}
