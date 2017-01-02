package com.hb.pm;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex06 {

	public static void main(String[] args) {
		// Map type
		// list - idx : value
		// map - key : value
		HashMap map = new HashMap();
		map.put("0", 2);
		map.put("1", 4);
		map.put("ÀÌ", "1235");
		map.put("abcedf", "asdfds");
		map.put("1", "sdafsadfdsafsd");
		
		Set keys = map.keySet();
		Iterator ite = keys.iterator();
		while(ite.hasNext()){
			String key = String.valueOf(ite.next());
			System.out.print(key+":");
			System.out.println(map.get(key));
		}
	}

}
















