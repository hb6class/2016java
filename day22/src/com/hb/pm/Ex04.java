package com.hb.pm;

import java.util.HashSet;
import java.util.Iterator;

public class Ex04 {

	public static void main(String[] args) {
		// Set - ������ �� 
		// 1. �ؽ����˻� x -�ߺ��ƴ�
		// �ؽ����� ���� , 2. equals�˻� ���� x -�ߺ��ƴ�
		// �ؽ����� ���� , 2. equals�˻� ���� o �ߺ�ó��
		HashSet set = new HashSet();
		set.add("�ϳ�");
		set.add("��");
		set.add("��");
		set.add(new String("�ϳ�"));
		set.add(new String("��"));
		set.add(new String("��"));
//		set.remove("�ϳ�");
		
		HashSet set2 = new HashSet(set);
		HashSet set3 = (HashSet)set2.clone();
		
		Iterator ite = set3.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
		System.out.println("size:"+set3.size());
		System.out.println(set3.contains("�ϳ�"));
		System.out.println("�ϳ�".equals(new String("�ϳ�")));
		System.out.println(new String("�ϳ�").hashCode());
		System.out.println("�ϳ�".hashCode());
	}

}










