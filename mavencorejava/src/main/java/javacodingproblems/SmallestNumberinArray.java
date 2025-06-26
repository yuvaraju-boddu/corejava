package javacodingproblems;

public class SmallestNumberinArray {
	
	public static void main(String[] args) {
		
		SmallestNumberinArray obj= new SmallestNumberinArray();
		int [] array = {5,4,8,1,0,3};
		int SmallestNumber =obj.smallNumber(array);
		System.out.println(SmallestNumber);
		
	}
	
	public int smallNumber(int[] array) {
		int val = array[0];
		for(int i=1;i<array.length;i++) {
			if(val > array[i]) { //if find largest number if(val <array[i])
				val = array[i];
			}
		}
		return val;
	}

}
