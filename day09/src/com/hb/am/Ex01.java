package com.hb.am;

public class Ex01 {
	// 클래스의 구성요소
	// 1. 메소드
	// 2. 변수 - 멤버필드 // 맴버변수 // 전역변수 // static만 클래스변수...
	public int a=100;	//멤버필드 - 인스턴스변수
	int c;
	public static int b=50; //멤버필드 - 클래스변수
	

	public static void func1(){	// 스테틱메소드, 클래스메소드
		System.out.println("난 스태틱");
		System.out.println("클래스변수 b="+b);
		Ex01 me = new Ex01();
		int temp=me.a;
		System.out.println("맴버필드 a="+temp);
	}
	public void func2(){ // non-static메소드, 인스턴스메소드
		System.out.println("non-static");
		System.out.println("맴버 필드 a="+a);
		System.out.println("클래스변수 b="+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		func1();
		Ex01 me = new Ex01();
		me.func2();
	}
}
