package com.hb.pm;

import java.util.HashSet;
import java.util.Iterator;


class Pm05{
	int idx;
	
	Pm05(int idx){
		this.idx=idx;
	}
	
	@Override
	public boolean equals(Object obj) {
		return idx==((Pm05)obj).idx;
	}
	
	@Override
	public int hashCode() {
		return 1000;
	}
}

public class Ex05 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(new Pm05(1));
		set.add(new Pm05(2));
		set.add(new Pm05(1));
		
		Iterator ite = set.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
		System.out.println("size:"+set.size());
	}

}
















