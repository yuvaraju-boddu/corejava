package CollectionFrameWorks;

//public class GenericExample<T> {-->generic version either String or Integer
//public class GenericExample<T extends Number/Integer/Short/Long/Double> { only for Integer values 
//public class GenericExample<T extends String> { only for String values 
public class GenericExample<T extends Object> {
	
	public boolean name(T value1, T value2) {
		return value1==value2;
	}
	
	public static void main(String args[]) {
		
		GenericExample<Integer> in = new GenericExample<>();
		System.out.println(in.name(10,1));
		
		GenericExample<String> str = new GenericExample<>();
		System.out.println(str.name("hello", "hello"));
		}
}
