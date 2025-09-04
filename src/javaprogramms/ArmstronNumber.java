package javaprogramms;

import java.util.Scanner;

public class ArmstronNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Armstrong numbers between 1 to 1000 : (1 to 9) and 153 , 370 , 371 , 407
		// for eg : 153 => 1^3+5^3+3^3 = 153 so it is an armstrong number

		int num, rem, temp, res = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number ");
		num = s.nextInt();
		temp = num;
		while (num > 0) {
			rem = num % 10;
			res = (rem * rem * rem) + res;
			num /= 10;
		}
		if (res == temp) {
			System.out.println("Armstrong number ");
		} else {
			System.out.println("Not an Armstrong number ");
		}
	}

}
