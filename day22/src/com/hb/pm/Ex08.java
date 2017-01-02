package com.hb.pm;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex08 {

	public static void main(String[] args) {
		//컬렉션 프레임워크 p.339 ~ p.364
		// Map
		HashMap map = new HashMap();
		//arr(idx)=value;
		//map(key,value) key->value
		map.put("aa", 1234);
		map.put("bb", 5678);
		map.put("cc", 1111);
		map.put("bb", 2222);
		map.put("dd", 1111);
		map.remove("cc");
//		System.out.println(map.get("dd"));
		Set key = map.keySet();
		Iterator ite = key.iterator();
		while(ite.hasNext()){
			System.out.println(map.get(((String)ite.next())));
		}
		
	}

}












