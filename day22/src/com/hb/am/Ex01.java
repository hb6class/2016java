package com.hb.am;

import java.util.Enumeration;
import java.util.Vector;

public class Ex01 {

	public static void main(String[] args) {
		// data ���� - ���� ����
		// ����
		// �迭(����) -> �����Ҵ�
		// jdk.1.0 ~ Vector (List, Set) - �Է�, ����
		// ~ jdk.1.2
		// List - ����, idx, ���� �ߺ�, ����, �߰�
		// Set - ����
		Vector vec = new Vector();
		System.out.println("1capacity:"+vec.capacity());
		vec.add("��");
		vec.add("��");
		vec.add("��");
		vec.addElement("��");
		
		vec.trimToSize();
		System.out.println("2capacity:"+vec.capacity());
		vec.add("��");
		System.out.println("3capacity:"+vec.capacity());
		vec.add("��");
		vec.add("��");
		System.out.println("4capacity:"+vec.capacity());
		vec.add(1);
		vec.add(2);
		vec.add(3);
		vec.addElement("��");
		System.out.println("5capacity:"+vec.capacity());
		System.out.println("5size:"+vec.size());
		
		vec.remove(1);
		vec.removeElement("��");
		
		for(int i=0; i<vec.size(); i++){
			System.out.println(vec.get(i));
		}
		System.out.println("--------------------------------");
		Enumeration enu = vec.elements();
		while(enu.hasMoreElements()){
			System.out.println(enu.nextElement());
		}
	}

}













