package oops;

public class Methodoverloading 
{
	public int add(int a,int b) {
		return a+b;
	}
	public int add(int a,int b, int c) {
		return a+b+c;
	}
	public Methodoverloading(int a, int b,int c ,int d) {
		this(5,7,8);
		System.out.println("Four parameters constructor calling "+a+b+c+d);
		
	}
public Methodoverloading(int a, int b,int c ) {
		
		System.out.println("Three parametres construroe calling "+a+b+c);
}
	public float add(float a, float b) {
		return a+b;
	}
	public static void main(String[] args) {
		Methodoverloading obj = new Methodoverloading(1,2,3,4);
		System.out.println(obj.add(2,3));
		System.out.println(obj.add(2.4f,8.90f));
		System.out.println(obj.add(2,3,8));
	}

}
