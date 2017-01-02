package com.hb.pm;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Pm07 implements Comparable{
	int idx;
	Pm07(int idx){
		this.idx=idx;
	}
	@Override	// 트리구조의 정렬 
	public int compareTo(Object o) {
		if(idx==((Pm07)o).idx){
			return 0;
		}
		if(idx<((Pm07)o).idx){
			return -1;
		}
		return 1;
	}
}

public class Ex07 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(new Pm07(1));
		set.add(new Pm07(50));
		set.add(new Pm07(25));
		
		Iterator ite = set.iterator();
		while(ite.hasNext()){
			System.out.println(((Pm07)ite.next()).idx);
		}
		System.out.println("----------------------");
//		System.out.println(set.first());
//		System.out.println(set.last());
//		System.out.println(set.lower(new Integer(10)));
//		System.out.println(set.higher(10));
	}

}













