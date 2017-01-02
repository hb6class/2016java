package com.hb.pm;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Ex03 {

	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<String,String>();
//		map.put(new Integer(1), "a");
//		map.put(new Integer(2), "dslfa");
		map.put("둘", "하나둘셋");
		map.put("삼", "123454");
		map.put("사", "asdfg");
//		Set<String> key =map.keySet();
//		Iterator<String> ite = key.iterator();
//		while(ite.hasNext()){
//			String obj = ite.next();
//			System.out.println(obj);
//		}
//		Set<String> set = map.keySet();
//		for(String key:set){
//			System.out.println(key+":"+map.get(key));
//		}
		///////////////////////////////////////////
		Set<Map.Entry<String,String>> entrySet = map.entrySet();
//		Iterator<Map.Entry<String,String>> ite = entrySet.iterator();
//		while(ite.hasNext()){
//			Map.Entry<String,String> obj = ite.next();
//			System.out.print(obj.getKey());
//			System.out.print(":");
//			System.out.println(obj.getValue());
//		}
		for(Map.Entry<String, String> ent:entrySet){
			System.out.println(ent.getKey()+":"+ent.getValue());
		}
		///////////////////////////////////////////
		
	}

}














