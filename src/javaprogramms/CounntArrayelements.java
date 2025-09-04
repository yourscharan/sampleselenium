package javaprogramms;

import java.util.Scanner;

public class CounntArrayelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of an array ");
		int size = s.nextInt();
		int[] marks = new int[size];
		System.out.println("Enter marks  into array");
		for (int i = 0; i < marks.length; i++) {
			marks[i] = s.nextInt();
		}
		s.close();
		int total = 0;
		for (int i = 0; i < marks.length; i++) {
			total = total + marks[i];
		}
		System.out.println("Total marks in array is " + total);
	}

}
