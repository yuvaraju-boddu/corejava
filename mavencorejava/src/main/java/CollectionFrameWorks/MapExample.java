package CollectionFrameWorks;

import java.util.*;

public class MapExample {
	public static void main(String[] agrs) {
		HashMap<String, Integer> fruitcount = new HashMap<>();
		fruitcount.put("apple", 10);
		fruitcount.put("mango", 5);
		fruitcount.put("cherry", 20);
		fruitcount.put("watermelon", 20);
		fruitcount.put("coconet", 20);
		System.out.println("Map of fruitcount " + fruitcount);
		System.out.println(fruitcount.get("mango"));
		System.out.println(fruitcount.remove("cherry"));
		//System.out.println(fruitcount.containsKey("coconet"));
		System.out.println(fruitcount.isEmpty());
		System.out.println(fruitcount.size());
		System.out.println("Map of fruitcount " + fruitcount);
	}

}
