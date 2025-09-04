package collections;

import java.util.Vector;

public class vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector v = new Vector();
		System.out.println(v.capacity());
		for (int i = 0; i <= 10; i++) {
			v.addElement(i);
		}
		System.out.println(v);
	}

}
