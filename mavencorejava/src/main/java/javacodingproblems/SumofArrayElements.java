package javacodingproblems;

public class SumofArrayElements {
	public static void main(String[] args) {
		SumofArrayElements obj = new SumofArrayElements();
		int [] array = {1,2,3,4,5};
		int sum =obj.add(array);
		System.out.println(sum);
		
	}
	public int add(int [] array) {
		int sum = 0;
		for(int i =0;i<array.length;i++) {
			sum = sum + array[i];
		}
		return sum;

	}
}
