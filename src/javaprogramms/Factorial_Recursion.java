package javaprogramms;

public class Factorial_Recursion {

	public static void main(String[] args) {
		int num = 4, fact;
		fact = factorial(num);
		System.out.println("Factorial of " + num + " is " + fact);
	}

	public static int factorial(int num) {
		if (num == 0) {
			return 1;
		} else {
			return num * factorial(num - 1);
		}

	}

}
