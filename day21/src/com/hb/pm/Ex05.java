package com.hb.pm;

import java.util.HashSet;
import java.util.Iterator;

public class Ex05 {

	public static void main(String[] args) {
		// Set type
		// HashSet - 집합의 개념으로 순서x
		// TreeSet - 뒤이어질 Map 승계, 출력시 순서를 보장받음
		HashSet set = new HashSet();
		set.add("일");
		set.add("이");
		set.add("삼");
		set.add("네엣");
		set.add("다섯");
		set.add("이");
		set.add("일");
		set.add("이");
		set.add("삼");
		set.add("네엣");
		set.add("다섯");
		set.add("이");
		set.remove("이");
		Iterator ite = set.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
	}

}












