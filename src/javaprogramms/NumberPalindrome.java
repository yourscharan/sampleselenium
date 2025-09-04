package javaprogramms;

import java.util.Scanner;

public class NumberPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, rev = 0, rem, temp;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number ");
		num = s.nextInt();
		s.close();
		temp = num;
		while (num > 0) {
			rem = num % 10;
			rev = (rev * 10) + rem;
			num = num / 10;
		}
		if (temp == rev) {
			System.out.println("Given number is palindrome ");
		} else {
			System.out.println("Given number is not palindrome");
		}

	}

}
