package com.hb.am;

public class Ex02 {

	public static void main(String[] args) {
		String st1 = "java";
		String st2 = "자바";
		System.out.println(st1);
		System.out.println("aabb");
		int temp = (int)'!'+(int)'!';
		System.out.println(temp);
		System.out.println((char)(65+((int)'a'-65)));
		System.out.println((char)66);
		System.out.println((char)67);
		System.out.println((char)68);
		System.out.println((char)69);
		System.out.println((char)70);
		System.out.println("------------------------");
		for(int i=0;i<=25; i++){
			System.out.println(i+"="+(char)(i+65));
		}
		System.out.println("------------------------");
		System.out.println("\n자바는 정말\t정말 쉽습니다");
		System.out.println((int)'\t');
		System.out.println((int)'\n');
		
	}

}
