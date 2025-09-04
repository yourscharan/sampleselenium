package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet lh = new LinkedHashSet();
		lh.add("a");
		lh.add("b");
		lh.add("m");
		lh.add("k");
		lh.add(10);
		lh.add(null);// null insertion is possible but only once , next time add method returns false
		System.out.println(lh);
		System.out.println(lh.add(10));//if we insert dup objs then add method will return false
	}

}
