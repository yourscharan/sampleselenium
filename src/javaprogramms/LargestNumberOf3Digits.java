package javaprogramms;

import java.util.Scanner;

public class LargestNumberOf3Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number ");
		int a = s.nextInt();
		System.out.println("Enter second number ");
		int b = s.nextInt();
		System.out.println("Enter third number ");
		int c = s.nextInt();
		s.close();
//		if ((a > b) && (a > c)) {
//			System.out.println(a + " is larger ");
//		} else if ((b > a) && (b > c)) {
//			System.out.println(b + " is larger ");
//		} else {
//			System.out.println(c + " is larger ");
//		}
		int largest1 = a > b ? a : b;
		int largest2 = c > largest1 ? c : largest1;
		System.out.println("Larger number is " + largest2);
	}

}
