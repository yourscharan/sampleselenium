package javaprogramms;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputstring = "Iam not a good boy";
		String revstring = "";
		String[] words = inputstring.split(" ");
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String revword="";
			for (int j = word.length() - 1; j >= 0; j--) {
				revword = revword + word.charAt(j);
			}
			revstring = revstring + revword + " ";
		}
		System.out.println("Original String is " + inputstring);
		System.out.println("Reverse String is " + revstring);
	}

}
