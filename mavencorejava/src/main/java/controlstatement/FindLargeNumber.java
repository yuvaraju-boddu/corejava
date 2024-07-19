package controlstatement;

import java.util.Scanner;

public class FindLargeNumber {
	public static void main (String [] args) {
		System.out.println("0");
		int a, b;
		long c;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a value ");
			a = sc.nextInt();
			System.out.println("Enter b value ");
			b = sc.nextInt();
			System.out.println("Enter c value ");
			//c = sc.nextInt();
			c = sc.nextLong();
		}
		if (a > b) {
			System.out.println("Greatest value is " + a);
		} else if (a > c) {
			System.out.println("Greatest value is " + a);
		} else if (b > c) {
			System.out.println("Greatest value is " + b);
		} else {
			System.out.println("Greatest value is " + c);
		}

	}

}
