package com.hb.am;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex03 {

	public static void main(String[] args) {
		// crud
		ArrayList list;
		list = new ArrayList();
		
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
		ArrayList list2 = (ArrayList) list.clone();
		
		list2.set(1, "ÀÌ");
		list2.addAll(list);
		
		System.out.println(">>>>"+list2.contains("»ן"));
		System.out.println(">>>>"+list2.indexOf("ÀÌ"));
		System.out.println(list2.indexOf(3));
		System.out.println(list2.lastIndexOf(3));
//		list2.clear();
		System.out.println(list2.isEmpty());
//		list2.remove(1);
//		list2.remove(new Integer(3));
//		list2.removeAll(list);
		Object[] obj = list2.toArray();
		for(int i=0; i<list2.size(); i++){
			System.out.println("list2["+i+"]="+list2.get(i));
//			System.out.println("list["+i+"]="+list.get(i));
		}
		System.out.println("--------------------------");
		for(int i=0; i<obj.length; i++){
			System.out.println(obj[i]);
		}
		System.out.println("--------------------------");
		ArrayList list3 = new ArrayList(list2);
		for(int i=0; i<list3.size(); i++){
			System.out.println("list3["+i+"]="+list3.get(i));
		}
		list3.clear();
		for(int i=0; i<list2.size(); i++){
			System.out.println("list2["+i+"]="+list2.get(i));
		}
	}

}
















