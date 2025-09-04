package collections;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet h = new HashSet();
		h.add("a");
		h.add("b");
		h.add("m");
		h.add("k");
		h.add(10);
		h.add(null);// null insertion is possible but only once , next time add method returns false
		System.out.println(h);
	}

}
