package javaprogramms;

public class MissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 10 };// here 5 is missing so we will find this number
		int sumofElements = 0, sumofNumbers, n = 10, missingNumber;
		sumofNumbers = (n * (n + 1)) / 2;
		for (int i = 0; i < a.length; i++) {
			sumofElements = sumofElements + a[i];
		}
		missingNumber = sumofNumbers - sumofElements;
		System.out.println("Missing number in array is " + missingNumber);

	}

}
