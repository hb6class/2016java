package com.hb.am;

public class Ex01 {
	public static void main(String[] args) {
		//p169 - String
		//p181 - StringBuffer 
		StringBuffer sb = new StringBuffer();
		// 입력, 추가,수정, 삭제
		// +
		sb.append("abcd");
		sb.append("efgh");
		sb.insert(sb.length(), "ijhlmn");
		sb.insert(3, "에이비씨");
		sb.replace(1, 1, "교체");
		sb.replace(3, 5, "");
		sb.delete(1, 3);
		System.out.println(sb);
		System.out.println("----------------------------");
		StringBuffer sb2 = new StringBuffer();
		sb2.append("abcde");
		sb2.append("abcde");
		sb2.append("abcde");
		sb2.append("f");
		sb2.append("gh");
		sb2.append("abcde");
		sb2.append("abcde");
		sb2.append("abcde");
		sb2.append("abcde");
		sb2.append("abcde");
		sb2.append("abcde");
		
		System.out.println("sb2 size:"+sb2.capacity());
		System.out.println("----------------------------");
		StringBuffer sb3 = new StringBuffer("abc");
		System.out.println("sb2 size:"+sb3.capacity());
		sb3.append("abcde");
		sb3.trimToSize();
		sb3.append("abcde");
		sb3.trimToSize();
		System.out.println("sb2 size:"+sb3.capacity());
		System.out.println("----------------------------");
		StringBuffer sb4 = new StringBuffer();
		sb4.ensureCapacity(20);
		System.out.println(sb4.capacity());
	}
}


















