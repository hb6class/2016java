package com.hb.pm;

import java.util.HashSet;
import java.util.Iterator;

public class Ex04 {

	public static void main(String[] args) {
		// Set - 같은지 비교 
		// 1. 해쉬값검사 x -중복아님
		// 해쉬값이 같음 , 2. equals검사 수행 x -중복아님
		// 해쉬값이 같음 , 2. equals검사 수행 o 중복처리
		HashSet set = new HashSet();
		set.add("하나");
		set.add("둘");
		set.add("셋");
		set.add(new String("하나"));
		set.add(new String("둘"));
		set.add(new String("셋"));
//		set.remove("하나");
		
		HashSet set2 = new HashSet(set);
		HashSet set3 = (HashSet)set2.clone();
		
		Iterator ite = set3.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
		System.out.println("size:"+set3.size());
		System.out.println(set3.contains("하나"));
		System.out.println("하나".equals(new String("하나")));
		System.out.println(new String("하나").hashCode());
		System.out.println("하나".hashCode());
	}

}










