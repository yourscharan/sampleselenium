package javaprogramms;

import java.util.Arrays;

public class EqualityOfTwoArrays {

	/*
	 * public static void main(String[] args) { int[] a1 = { 2, 3, 4, 5, 6 }; int[]
	 * a2 = { 2, 3, 4, 5, 6 }; boolean result = Arrays.equals(a1, a2);
	 * System.out.println("Using Arrays.equals(): " + (result ? "Arrays are equal" :
	 * "Arrays are not equal")); }
	 */

	// Or one more way
	public static void main(String[] args) {
		int[] a1 = { 5, 8, 7, 9, 4 };
		int[] a2 = { 5, 8, 7, 9, 4 };
		boolean result = true;
		if (a1.length == a2.length) {
			for (int i = 0; i < a1.length; i++) {
				if (a1[i] != a2[i]) {
					result = false;
				}
			}
		} else {
			result = false;
		}
		if (result) {
			System.out.println("Two arrays are equal");
		} else {
			System.out.println("Two arrays are not equal");
		}
	}

}
