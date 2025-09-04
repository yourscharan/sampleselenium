package javaprogramms;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, sum = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number ");
		num = s.nextInt();
		s.close();
		while (num > 0) {
			sum = sum + num % 10;
			num = num / 10;
		}
		System.out.println("Sum of digits in number " + sum);
	}

}
