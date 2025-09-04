package javaprogramms;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> elements = new ArrayList<Integer>();
		elements.add(5);
		elements.add(2);
		elements.add(6);
		elements.add(2);
		elements.add(5);
		elements.add(7);
		elements.add(9);
		System.out.println("Array List Elements with duplicates are " + elements);
		// copy all the elements into Linked hash set bcoz LHS removes duplicates and
		// maintains insertion order
		Set<Integer> s = new LinkedHashSet<Integer>(elements);
		//clear all the elements from array list
		elements.clear();
		//now copy all the elements from LHS to Array list
		elements.addAll(s);
		System.out.println("Array List elements after removing duplicates are " + elements );

	}

}
