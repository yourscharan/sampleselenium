package javaprogramms;

import java.util.HashMap;
import java.util.Set;

public class DuplicateWordsAndOccurencesInString {

	public static void main(String[] args) {

		duplicatewords("Bread butter and bread");
		duplicatewords("super man spider man bat man ant man");

	}

	private static void duplicatewords(String inputstring) {
		String[] words = inputstring.split(" ");
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for (String word : words) {
			if (hm.containsKey(word.toLowerCase())) {
				hm.put(word.toLowerCase(), hm.get(word.toLowerCase()) + 1);
			} else {
				hm.put(word.toLowerCase(), 1);
			}
		}
		Set<String> wordsInString = hm.keySet();
		for (String word : wordsInString) {
			if (hm.get(word) > 1) {
				System.out.println(word + " occured : " + hm.get(word) + " times");
			}
		}

	}

}
