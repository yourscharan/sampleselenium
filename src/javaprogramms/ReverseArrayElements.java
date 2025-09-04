package javaprogramms;

public class ReverseArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println("Original Array is ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		int start = 0, end = arr.length - 1, temp;
		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		System.out.println();
		System.out.println("Reversed Array is ");
		for (int num : arr) {
			System.out.print(num + " ");
		}

	}

}
