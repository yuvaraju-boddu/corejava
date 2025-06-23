package CollectionFrameWorks;

import java.util.*;

public class SetExample {
	public static void main(String[] agrs) {
		HashSet<String> fruits = new HashSet<String>();
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("banana");
		fruits.add("apple");

		System.out.println("Set of fruits " + fruits);
	}

}
