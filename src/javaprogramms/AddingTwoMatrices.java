package javaprogramms;

public class AddingTwoMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Define matrix dimensions
		int rows = 2;
		int cols = 3;

		// First matrix
		int[][] matrixA = { { 1, 2, 3 }, { 4, 5, 6 } };

		// Second matrix
		int[][] matrixB = { { 7, 8, 9 }, { 10, 11, 12 } };

		// Resultant matrix
		int[][] Add = new int[rows][cols];
		int[][] Sub = new int[rows][cols];

		// Matrix addition logic
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				Add[i][j] = matrixA[i][j] + matrixB[i][j];
			}
		}

		// Matrix Subtraction logic
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				Sub[i][j] = matrixA[i][j] - matrixB[i][j];
			}
		}

		// Display the result
		System.out.println("Sum of the two matrices:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(Add[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Subtraction of the two matrices:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(Sub[i][j] + " ");
			}
			System.out.println();
		}
	}

}
