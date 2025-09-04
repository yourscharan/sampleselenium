package javaprogramms;

public class Fibonacci_recursionuptp100 {

	static int n1 = 0;
	static int n2 = 1;
	static int n3;
	static int count = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printfib(count);

	}

	private static void printfib(int i) {
		if (n1 <= count) {
			n3 = n1 + n2;
			System.out.print(n1 + " ");
			n1 = n2;
			n2 = n3;
			printfib(i - 1);
		}

	}

}
