package com.hb.pm;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class Ex02 {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		LinkedList link = new LinkedList();
		String temp2=null;
		int temp =100000;
		Date time1 = new Date();
		long start1 = time1.getTime();
		for(int i=0; i<temp; i++){
			arr.add(String.valueOf(i));
		}
		time1 = new Date();
		long end1 = time1.getTime();
		System.out.println("ArrayList - addtime:"+(end1-start1)+"ns");
		
		Date time2 = new Date();
		long start2 = time2.getTime();
		for(int i=0; i<temp; i++){
			link.add(String.valueOf(i));
		}
		time2 = new Date();
		long end2 = time2.getTime();
		System.out.println("LinkedList - addtime:"+(end2-start2)+"ns");
		/////////////////////////////
		time1 = new Date();
		start1 = time1.getTime();
		for(int i=0; i<temp; i++){
			arr.get(i);
		}
		time1 = new Date();
		end1 = time1.getTime();
		System.out.println("ArrayList - gettime:"+(end1-start1)+"ns");
		
		time2 = new Date();
		start2 = time2.getTime();
		for(int i=0; i<temp; i++){
			link.get(i);
		}
		time2 = new Date();
		end2 = time2.getTime();
		System.out.println("LinkedList - gettime:"+(end2-start2)+"ns");
	}

}
