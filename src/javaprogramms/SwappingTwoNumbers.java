package javaprogramms;

public class SwappingTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Logic 1
		int a = 50, b = 100, temp;
//		temp = a;
//		a = b;
//		b = temp;
//		System.out.println("Value of a after swapping " + a);
//		System.out.println("Value of b after swapping " + b);

		// Logic2
//		a = a + b;
//		b = a - b;
//		a = a - b;
//		System.out.println("Value of a after swapping " + a);
//		System.out.println("Value of b after swapping " + b);

		// Logic3
		a = a * b;
		b = a / b;
		a = a / b;
		System.out.println("Value of a after swapping " + a);
		System.out.println("Value of b after swapping " + b);
	}

}
