package javaprogramms;

import java.util.Scanner;

public class Factorial {

//	public static void main(String[] args) {
//		int num, fact = 1;
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter any number ");
//		num = s.nextInt();
//		for (int i = 1; i <= num; i++) {
//			fact *= i;
//		}
//		System.out.println("Factorial of " + num + " is " + fact);
//		
//	}

	public static void main(String[] args) {
		int num, fact = 1, i = 1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number ");
		num = s.nextInt();
		s.close();
		while (i <= num) {
			fact *= i;
			i++;
		}
		System.out.println("Factorial of " + num + " is " + fact);
	}

}
