package javaprogramms;

public class StringLengthWithoutUsingLengthMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Nagendra";
		int length = 0;
		char[] arr = s.toCharArray();// converting string to char array
		// taking loop
		for (char c : arr) {
			length++;
		}
		System.out.println("Length of given string is " + length + " characters" );

	}

}
