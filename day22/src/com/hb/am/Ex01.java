package com.hb.am;

import java.util.Enumeration;
import java.util.Vector;

public class Ex01 {

	public static void main(String[] args) {
		// data 관리 - 정보 관리
		// 변수
		// 배열(정적) -> 동적할당
		// jdk.1.0 ~ Vector (List, Set) - 입력, 삭제
		// ~ jdk.1.2
		// List - 순서, idx, 값의 중복, 수정, 추가
		// Set - 집합
		Vector vec = new Vector();
		System.out.println("1capacity:"+vec.capacity());
		vec.add("일");
		vec.add("이");
		vec.add("삼");
		vec.addElement("사");
		
		vec.trimToSize();
		System.out.println("2capacity:"+vec.capacity());
		vec.add("일");
		System.out.println("3capacity:"+vec.capacity());
		vec.add("이");
		vec.add("삼");
		System.out.println("4capacity:"+vec.capacity());
		vec.add(1);
		vec.add(2);
		vec.add(3);
		vec.addElement("사");
		System.out.println("5capacity:"+vec.capacity());
		System.out.println("5size:"+vec.size());
		
		vec.remove(1);
		vec.removeElement("삼");
		
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













