package javaprogramms;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	/*
	 * public static void main(String[] args) {
	 * 
	 *//**
		 * two strings are considered anagrams if they contain the exact same characters
		 * in the same frequencies, but in a different order. For example, "listen" and
		 * "silent" are anagrams because both strings contain the characters 'l', 'i',
		 * 's', 't', 'e', and 'n' with equal frequency.
		 *//*
			 * 
			 * // create an object of Scanner class Scanner input = new Scanner(System.in);
			 * 
			 * // take input from users System.out.print("Enter first String: "); String
			 * str1 = input.nextLine(); System.out.print("Enter second String: "); String
			 * str2 = input.nextLine();
			 * 
			 * // check if length is same if (str1.length() == str2.length()) { // convert
			 * strings to char array char[] charArray1 = str1.toCharArray(); char[]
			 * charArray2 = str2.toCharArray();
			 * 
			 * // sort the char array Arrays.sort(charArray1); Arrays.sort(charArray2);
			 * 
			 * // if sorted char arrays are same // then the string is anagram boolean
			 * result = Arrays.equals(charArray1, charArray2);
			 * 
			 * if (result) { System.out.println(str1 + " and " + str2 + " are anagram."); }
			 * else { System.out.println(str1 + " and " + str2 + " are not anagram."); } }
			 * else { System.out.println(str1 + " and " + str2 + " are not anagram."); }
			 * 
			 * input.close(); }
			 * 
			 */

	public static void main(String[] args) {
		String s1, s2;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First string ");
		s1 = s.nextLine();
		System.out.println("Enter second string ");
		s2 = s.nextLine();
		if (s1.length() == s2.length()) {
			char[] c1 = s1.toCharArray();
			char[] c2 = s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			if (Arrays.equals(c1, c2)) {
				System.out.println(s1 + " and " + s2 + " are Anagrams");
			} else {
				System.out.println(s1 + " and " + s2 + " are Not Anagrams");
			}
		} else {
			System.out.println(s1 + " and " + s2 + "are Not Anagrams");
		}
	}
}
