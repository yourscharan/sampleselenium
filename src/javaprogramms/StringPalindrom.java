package javaprogramms;

import java.util.Scanner;

public class StringPalindrom {

	public static void main(String[] args) {

		String original, reverse = "";
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Any String ");
		original = s.nextLine();
		for (int i = original.length() - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}
		if(original.equals(reverse)) {
			System.out.println("Given String is Palindrome ");
		}
		else {
			System.out.println("Given String is not a Palindrome ");
		}
		s.close();

	}

}
