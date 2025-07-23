package sorting.algorithms.ds;

import java.util.Arrays;

public class SelectionSort {

	public void selectionsort(int array[]) {

		System.out.println("Entrying the selection method");

		for (int i = 0; i < array.length; i++) {
			int minindex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[minindex]) {
					minindex = j;
				}
			}
			if (i != minindex) {
				int temp = array[i];
				array[i] = array[minindex];
				array[minindex] = temp;
			}
		}
	}

	public static void main(String[] args) {
		int[] array = { 5, 89, 14, 65, 35, 12, 2, 45, 47 };

		SelectionSort obj = new SelectionSort();

		obj.selectionsort(array);

		System.out.println(Arrays.toString(array));
	}
}
