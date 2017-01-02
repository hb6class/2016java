package com.hb.pm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Ex01{

	public static void main(String[] args) {
		// 제네릭
		// 1.5 ,~
		// 컬렉션프레임워크 (제네릭 함께)
		
		ArrayList<Integer> list = new ArrayList<Integer>();
//		ArrayList list = new ArrayList();
		list.add(new Integer(1));
		list.add(new Integer(2));
		list.add(new Integer(3));
//		list.add(4.0);
		
//		for(int i=0; i<list.size(); i++){
//			Integer temp = list.get(i);
//			System.out.println(temp);
//		}
		
		for(Integer i : list){		// foreach문 , 개선된 for문
			System.out.println(i);
		}
		
		System.out.println("--------------------------------------");
		TreeSet<String> set = new TreeSet<String>();
//		TreeSet set = new TreeSet();
		set.add("하나");
		set.add("둘");
//		set.add(new Integer(3));
		set.add("넷");
		
//		Iterator ite = set.iterator();
//		while(ite.hasNext()){
//			System.out.println(ite.next());
//		}
		for(String temp : set){
			System.out.println(temp);
		}
		System.out.println("--------------------------------------");
		int[][] arrs = {{1,2},{3,4,5,6,7,8},{1,3,4}};
		
		for(int[] i : arrs){
			for(int j : i){
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}

}

















