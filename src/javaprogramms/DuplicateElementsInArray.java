package javaprogramms;

import java.util.HashMap;
import java.util.Map;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		int[] a = { 2, 3, 4, 2, 5, 5, 2, 6, 1, 3, 6 };
		duplicates(a);
	}

	private static void duplicates(int[] a) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int num : a) {
			if (hm.containsKey(num)) {  
				hm.put(num, hm.get(num) + 1);
			} else {
				hm.put(num, 1);
			}
		}
		for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " → " + entry.getValue() + " times");
			}
		}

	}

}
