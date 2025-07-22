package sorting.algorithms.ds;

import java.util.Arrays;

public class BubbleSort {

	public void bubblesort(int array[]) {
		for (int i = array.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		BubbleSort obj = new BubbleSort();

		int array[] = { 8, 52, 46, 2, 98, 55 };

		obj.bubblesort(array);
		/*
		 * System.out.println(array); output :[I@27f674d this array location address IN
		 * Array can not read directly by using Arrays.toString() is a static method in
		 * the java.util.Arrays class used to convert an array into a readable string
		 * format.
		 */
		System.out.println(Arrays.toString(array));
	}

}
