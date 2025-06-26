package javacodingproblems;

public class FindSecondLargestNumber {
	
	public static void main(String[] args) {
		FindSecondLargestNumber obj = new FindSecondLargestNumber();
		
		int [] array = {5,7,1,6,89,5,82};
		
		int second =obj.findNumber(array);
		System.out.println(second);
	}
	
	public int findNumber(int[]array) {
		int large =0 ;
		int second =0;
		for(int i=0;i<array.length;i++) {
			int num =array[i];
			if(large<num) {
				second = large;
				large = num;
			}else if(num>second && num !=large){
				second = num;
			}
		}
		return second;
	}

}
