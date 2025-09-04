package javaprogramms;

public class ShiftArrayElements3TimesLeftSide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println("Array elements before shifting ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		int n = 3, first, j;
		for (int i = 0; i < n; i++) {
			first = arr[0];
			for (j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[j] = first;
		}
		System.out.println();
		System.out.println("Array elements after shifting ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

}
