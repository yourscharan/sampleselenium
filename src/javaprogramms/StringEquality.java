package javaprogramms;

import java.util.Scanner;

public class StringEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter first string");
		String s1 = s.nextLine();
		System.out.println("Enter second string");
		String s2 = s.nextLine();
		s.close();
		if (s1.length() == s2.length()) {
			for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) == s2.charAt(i)) {
					System.out.println(s1 + " is equal to " + s2);
					break;

				} else {
					System.out.println(s1 + " is  not equal to " + s2);
					break;
				}
			}

		} else {
			System.out.println("Two Strings are not Equal ");
		}
	}

}
