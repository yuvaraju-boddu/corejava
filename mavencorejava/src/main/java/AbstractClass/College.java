package AbstractClass;

public class College extends University {

	public void fee() {
		System.out.println("college fee depends on course type(override abstract method)");
		this.gym();
		this.sport();
	}

	public void sport() {

		System.out.println("sport type depends student interest(override abstract method)");
	}

	public void staff() {
		System.out.println("implements menthod by interface");
		this.fee();
	}

	void gym() {

		System.out.println("only child class present gym mthod ");
	}

	// In abstract class(base class) not directly create objection by using extends
	// another class
	public static void main(String[] args) {
		// University obj = new University();
		College obj = new College();
		obj.course();
		// obj.fee();
		// obj.sport();
	}

}
