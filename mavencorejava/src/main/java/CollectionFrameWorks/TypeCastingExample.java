package CollectionFrameWorks;
import java.util.*;

public class TypeCastingExample {
	
	public static void main(String [] args) {
		//without generics 
		List list = new ArrayList();
		/*list.add("without generices and using type casting");
		String str =(String)list.get(0);//using exclipt 
		System.out.println(str);*/
		list.add(2);
		int i =(Integer)list.get(0);
		System.out.println("without generics using the Integer typecasting " +i);
		
		//With Generices 
		List<String> gen = new ArrayList<>();
		gen.add("with generics");
		System.out.println(gen.get(0));//no any type casting 
		
		List<Double> dou = new ArrayList<>();
		dou.add(10.258);
		dou.add(56.1257);
		dou.add(12.0254);
		System.out.println(dou);
		Collections.reverse(dou);
		System.out.println(dou);
		
		//Set<Integer> set =new HashSet<>(); when using hashset negative values unsorted order (0,-1,1,5,-8,89)
		//Set<Integer> set = new TreeSet<>(Collections.reverseOrder());  this command use for reverse the setorder
		Set<Integer> set = new TreeSet<>();//Normal order like ascending order
		set.add(5);
		set.add(1);
		set.add(89);
		set.add(0);
		set.add(-8);
		set.add(-1);
		System.out.println(set);
		
		
		
		
		
		
	}

}
