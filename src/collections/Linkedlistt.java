package collections;

import java.util.LinkedList;

public class Linkedlistt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l=new LinkedList();
		l.add(10);
		l.add("m");
		l.add("p");
		l.add(15);
		System.out.println(l);
		l.addFirst(50);
		l.addLast(36);
		System.out.println(l);
		l.removeLast();
		System.out.println(l);
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
	}

}
