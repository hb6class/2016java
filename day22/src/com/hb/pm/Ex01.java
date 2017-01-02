package com.hb.pm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list;
		list = new LinkedList();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println(list.get(1));
		System.out.println("----------------------------");
		for(int i=0; i<list.size(); i++){
			System.out.println("list["+i+"]="+list.get(i));
		}
		System.out.println("----------------------------");
		Iterator ite = list.iterator();
		int idx =0;
		while(ite.hasNext()){
			System.out.println("list["+(idx++)+"]="+ite.next());
		}
		System.out.println("----------------------------");
		LinkedList list2 = new LinkedList(list);
		for(int i=0; i<list2.size(); i++){
			System.out.println("list2["+i+"]="+list2.get(i));
		}
		System.out.println("----------------------------");
		List list3 = (List)list2.clone();
		for(int i=0; i<list3.size(); i++){
			System.out.println("list3["+i+"]="+list3.get(i));
		}
	}

}













