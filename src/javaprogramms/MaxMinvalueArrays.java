package javaprogramms;

import java.util.Scanner;

public class MaxMinvalueArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of an array ");
		int size = s.nextInt();
		int[] num = new int[size];
		System.out.println("Enter values into array ");
		for (int i = 0; i < num.length; i++) {
			num[i] = s.nextInt();
		}
		s.close();
		int max = num[0];
		for (int i = 0; i < num.length; i++) {
			if (max < num[i]) {
				max = num[i];
			}
		}
		System.out.println("Maximum value in array is " + max);
		int min = num[0];
		for (int i = 0; i < num.length; i++) {
			if (min > num[i]) {
				min = num[i];
			}
		}
		System.out.println("Minimum value in array is " + min);
	}

}
