package com.hb.pm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Ex03 {

	public static void main(String[] args) {
		// �÷��� �����ӿ�ũ
		// List Ÿ��
		// ArrayList
		// LinkedList
		ArrayList list = new ArrayList();
		list.add(new Integer(1));
		System.out.println(list.size()+"��");
		list.add(new Integer(2));
		System.out.println(list.size()+"��");
		list.add(new Integer(3));
		System.out.println(list.size()+"��");
		list.add(new Integer(4));
		list.add(new String("��"));
		list.add("��");
		
		list.remove(4);	// delete
//		list.clear();	// delete All
		list.set(4, new Integer(6));
		list.add(4, 5);
//		for(int i=0; i<list.size(); i++){
//			System.out.println(list.get(i));
//		}
		System.out.println("-----------------------");
		Iterator ite = list.iterator();
		while(ite.hasNext()==true){
			System.out.println(ite.next());
		}

	}

}
















