package com.hb.pm;

import java.util.HashSet;
import java.util.Iterator;

public class Ex05 {

	public static void main(String[] args) {
		// Set type
		// HashSet - ������ �������� ����x
		// TreeSet - ���̾��� Map �°�, ��½� ������ �������
		HashSet set = new HashSet();
		set.add("��");
		set.add("��");
		set.add("��");
		set.add("�׿�");
		set.add("�ټ�");
		set.add("��");
		set.add("��");
		set.add("��");
		set.add("��");
		set.add("�׿�");
		set.add("�ټ�");
		set.add("��");
		set.remove("��");
		Iterator ite = set.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
	}

}












