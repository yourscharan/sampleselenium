package javaprogramms;

public class CountNoofEvenOdddigitsInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 1456893, rem;
		int even_count = 0, odd_count = 0;
		while (num > 0) {
			rem = num % 10;
			if (rem % 2 == 0) {
				even_count++;
			} else {
				odd_count++;
			}
			num /= 10;
		}
		System.out.println("Even count " + even_count);
		System.out.println("Odd count " + odd_count);
	}

}
