package com.hb.pm;

public class Ex01 {
	public static void main(String[] args) {
		//p180~p191
		StringBuilder sb = new StringBuilder("java");
		StringBuilder sb2 = sb.append("World");
		sb.append("�ڹ�");
		sb.append(new char[]{'a','b','c'});
		sb.append(123214);
		sb.insert(4, "����");
		sb.replace(4, 6, "world");
		sb.reverse();
		sb.delete(9, 11);//sb.replace(9, 11, "");
		System.out.println(sb2);
		System.out.println("-------------------");
		String st = new String("java");
		String st2 = st.concat("World");
		st.concat("�ڹ�");
		System.out.println(st2);
		System.out.println("-------------------");
//		
//		String java="java";
//		StringBuffer sb3 = new StringBuffer("java");
//		for(int i=0; i<1000000000; i++){
//			System.out.println(sb3.append(i));
//		}
		
		
		
		
		
		
		
	}
}
