package collections;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap hm=new HashMap();
		hm.put("100", "vijay");
		hm.put("101", "rana");
		hm.put("102", "dev");
		System.out.println(hm);
		hm.put("100", "ashok");
		System.out.println(hm);
		System.out.println(hm.get("100"));
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		System.out.println(hm);
	}

}
