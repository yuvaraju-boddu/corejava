package CollectionFrameWorks;
import java.util.*;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<>();
		try {
			num.add(1);
			num.add(2);
			num.add(5);
			System.out.println(num);
		}catch(Exception e) {
			System.out.println("This is catch block");
			
		}
	}

}
