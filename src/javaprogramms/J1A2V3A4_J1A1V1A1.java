package javaprogramms;

public class J1A2V3A4_J1A1V1A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		String s = "JAVA", res = "", res1 = "";
		int j = 1, k = 1;
		for (int i = 0; i < s.length(); i++) {
			res = res + s.charAt(i) + j;
			j++;
		}
		System.out.println(res);
		for (int i = 0; i < s.length(); i++) {
			res1 = res1 + s.charAt(i) + k;
		}
		System.out.println(res1);
	}

}
