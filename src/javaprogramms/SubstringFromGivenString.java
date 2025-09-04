package javaprogramms;

public class SubstringFromGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Java123Java456", res = "", res1 = "";
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				res = res + s.charAt(i);
			}
		}
		System.out.println("Numbers from the given String " + res);
		for (int i = 0; i < s.length(); i++) {
			if (!(Character.isDigit(s.charAt(i)))) {
				res1 = res1 + s.charAt(i);
			}
		}
		System.out.println("Characters from the given String " + res1);
	}

}
