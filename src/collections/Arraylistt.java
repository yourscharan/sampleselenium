package collections;

import java.util.ArrayList;

public class Arraylistt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();
		a.add("A");
		a.add(10);
		a.add(null);
		System.out.println(a);
		a.remove(1);
		System.out.println(a);
		a.add(2, 'm');
		System.out.println(a);
	}

}
