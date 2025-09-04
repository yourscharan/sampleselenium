package javaprogramms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Practice {
	public static void main(String[] args) {

		int rows = 2, columns = 3;
		int[][] A = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] B = { { 7, 8, 9 }, { 10, 11, 12 } };
		int[][] Result = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				Result[i][j] = A[i][j] + B[i][j];
			}
		}
		System.out.println("Sum of A and B is :");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(Result[i][j] + " ");
			}
			System.out.println();
		}
	}

}
