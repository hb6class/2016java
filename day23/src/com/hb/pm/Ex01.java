package com.hb.pm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Ex01{

	public static void main(String[] args) {
		// ���׸�
		// 1.5 ,~
		// �÷��������ӿ�ũ (���׸� �Բ�)
		
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
		
		for(Integer i : list){		// foreach�� , ������ for��
			System.out.println(i);
		}
		
		System.out.println("--------------------------------------");
		TreeSet<String> set = new TreeSet<String>();
//		TreeSet set = new TreeSet();
		set.add("�ϳ�");
		set.add("��");
//		set.add(new Integer(3));
		set.add("��");
		
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

















