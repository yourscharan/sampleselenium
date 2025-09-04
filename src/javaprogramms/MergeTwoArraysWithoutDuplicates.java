package javaprogramms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MergeTwoArraysWithoutDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a1 = { 7, -3, 8, -4, 11, -19, 21 };
		int[] a2 = { 6, 13, -7, 0, 11, -4, 3, -5 };
		int[] mergedArray = mergeArrayswithoutDuplicates(a1, a2);
		System.out.println("Merged Array (No Duplicates): " + Arrays.toString(mergedArray));

	}

	private static int[] mergeArrayswithoutDuplicates(int[] a1, int[] a2) {
		// TODO Auto-generated method stub
		Set<Integer> s = new HashSet<Integer>(); //Set allows only unique elements so we are taking this
		// Add elements from both arrays to the set
		for (int num : a1) {
			s.add(num);
		}
		for (int num : a2) {
			s.add(num);
		}
		// Now iterate the set and add its elements into new array
		Iterator<Integer> itr = s.iterator();
		int[] result = new int[s.size()];
		int i = 0;
		// Adding all elements into new array
		while (itr.hasNext()) {
			result[i] = itr.next();
			i++;
		}
		return result;
	}

}
