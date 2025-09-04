package javaprogramms;

import java.util.Scanner;

public class PrimeNuumber {

	public static void main(String[] args) {
		int num, count = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Any number ");
		num = s.nextInt();
		s.close();
		if (num > 1) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println("Given number is prime number ");
			} else {
				System.out.println("Given number is not prime number ");
			}
		}

	}

}
