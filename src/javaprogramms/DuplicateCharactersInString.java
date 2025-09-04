package javaprogramms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharactersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		duplicates("JavaJavainJava");

	}

	private static void duplicates(String inputstring) {
		char[] ch = inputstring.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (char c : ch) {
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c, 1);
			}
		}
		Set<Character> s = hm.keySet();
		for (Character c : s) {
			if (hm.get(c) > 1) {
				System.out.println(c + " -> " + hm.get(c) + " times ");
			}
		}
		
		//or below logic also works

//		for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
//			if(entry.getValue()>1) {
//				System.out.println(entry.getKey() + " -> " + entry.getValue() + " times ");
//			}
//		}

	}

}
