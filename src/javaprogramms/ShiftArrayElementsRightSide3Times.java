package javaprogramms;

public class ShiftArrayElementsRightSide3Times {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println("Array elements before shifting ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		int noOftimes = 3, last;
		for (int i = 0; i < noOftimes; i++) {
			last = arr[arr.length - 1];
			for (int j = arr.length - 1; j > 0; j--) {
				arr[j] = arr[j - 1];
			}
			arr[0]=last;
		}
		System.out.println();
		System.out.println("Array Elements after shifting 3 times right side ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
