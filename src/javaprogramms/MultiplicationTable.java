package javaprogramms;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number ");
		num = s.nextInt();
		s.close();
		for (int i = 1; i <= 10; i++) {
			// System.out.println(num + " * " + i + " = " + num * i);
			System.out.printf("%d * %d = %d\n", num, i, num * i);
		}

	}

}
