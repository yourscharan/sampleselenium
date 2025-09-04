package javaprogramms;

public class Fibonacci_recursion {

	static int n1 = 0;
	static int n2 = 1;
	static int n3;
	static int count = 10;

	public static void main(String[] args) {

		System.out.print(n1 + " " + n2);
		printfib(count - 2);
	}

	private static void printfib(int i) {
		if (i > 0) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
			printfib(i - 1);
		}

	}

}
