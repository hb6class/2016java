package com.hb.am;

import java.util.ArrayList;
import java.util.HashMap;

public class Ex02 {

	public static void main(String[] args) {
		// Map use
		ArrayList list = new ArrayList();
		HashMap map  = new HashMap();
		map.put("kor", 90);
		map.put("eng", 80);
		map.put("math", 70);
		list.add(map);
		
		for(int i=0; i<list.size(); i++){
			HashMap map2 = (HashMap)list.get(i);
			System.out.println(map2.get("kor")+" "+map2.get("math"));
		}
	}

}
