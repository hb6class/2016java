package com.hb.pm;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Ex04 {

	public static void main(String[] args) {
		Vector vec = new Vector();
		
		vec.add("abc");
		vec.add("def");
		vec.add("ghi");
		
		for(int i=0; i<vec.size(); i++){
			System.out.println("idx:"+i+",value:"+vec.get(i));
		}
		System.out.println("-----------------------");
		Enumeration ve = vec.elements();	// 열거자~~
		while(ve.hasMoreElements()){
			System.out.println(ve.nextElement());
		}
		System.out.println("-----------------------");
		Iterator ite = vec.iterator();		// 반복자~~
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
		
	}

}














