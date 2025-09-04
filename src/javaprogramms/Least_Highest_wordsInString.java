package javaprogramms;

public class Least_Highest_wordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "They are very happy Family";
		String[] arr = s.split(" ");
		String highest = arr[0];
		String least = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() > highest.length()) {
				highest = arr[i];
			} else if (arr[i].length() < least.length()) {
				least = arr[i];
			}
		}
		System.out.println("Smallest word is : " + least);
		System.out.println("Highest word is : " + highest);
	}

}
