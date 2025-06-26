package javacodingproblems;

public class AverageofArrayElements {
	public static void main(String[] args) {
		AverageofArrayElements obj =new AverageofArrayElements();
		int [] array = {1,2,3,4,5,8,10};
		double average = obj.add(array);
		System.out.println("Average of Array Elements "+average);
		
	}
	
	public double add(int []array) {
		int sum = 0;
		for(int i=0;i<array.length;i++){
			sum = sum+array[i];
		}
		return (double)sum/array.length;
	}
}
