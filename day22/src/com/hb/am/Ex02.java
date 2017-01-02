package com.hb.am;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Ex02 {

	public static void main(String[] args) {
		Vector vec = new Vector(5 , 3);	// 초기용량(10), 증가량
		System.out.println("1capacity:"+vec.capacity());
		System.out.println("1size:"+vec.size());
		vec.add("일");
		vec.add("이");
		vec.add("삼");
		vec.addElement("사");
		vec.add(1);
		System.out.println("2capacity:"+vec.capacity());
		System.out.println("2size:"+vec.size());
		vec.add(2);
		System.out.println("3capacity:"+vec.capacity());
		System.out.println("3size:"+vec.size());
		
		System.out.println(vec.get(1));
		System.out.println(vec.elementAt(2));
		System.out.println(vec.contains(new Integer(1)));
		System.out.println(vec.indexOf("이"));
//		vec.clear();
//		vec.trimToSize();
		System.out.println("4capacity:"+vec.capacity());
		System.out.println("4size:"+vec.size());
		Enumeration enu = vec.elements();
		System.out.println("--------------------------------");
		while(enu.hasMoreElements()){
			System.out.println(enu.nextElement());
		}
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");
		Iterator ite = vec.iterator();
		
		while(ite.hasNext()){
			System.out.println(ite.next());
//			ite.remove();
		}
		System.out.println("--------------------------------");
		ite = vec.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
		System.out.println("--------------------------------");
		for(int i=0; i<vec.size(); i++){
			System.out.println(vec.get(i));
		}
		System.out.println("--------------------------------");
		Object[] arr=new Object[vec.size()+1];
		vec.copyInto(arr); // 벡터 -> 배열로
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		
		
		
		
	}

}





















