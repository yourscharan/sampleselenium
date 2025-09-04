package javaprogramms;

public class Print_1to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		printnum(num);

	}

	private static void printnum(int num) {
		// TODO Auto-generated method stub
		if (num <= 100) {
			System.out.println(num + " ");
			printnum(num + 1);                                                                                                                        
		}

	}

}
