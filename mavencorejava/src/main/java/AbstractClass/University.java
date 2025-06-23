package AbstractClass;

public abstract class University implements Management{
	
	//concrete (non-abstract) method 
	public void course() {
		this.department();
		System.out.println("University courses ");	
	}
	
	//must have one abstract method in only abstract class without any implements 
	
	public abstract void fee();
	
	abstract void sport();
	
	public void department() {
		System.out.println("this method override by interface");
		this.staff();
	}
	
}
