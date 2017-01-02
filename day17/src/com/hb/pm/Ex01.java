package com.hb.pm;


abstract class Pm01{	// 추상클래스
	int i;
	public Pm01(){
//		super();
		System.out.println("추상클래스 객체생성");
	}
	void func3(){
		System.out.println("망가실꺼야");
	}
	abstract void func4();
//	abstract void func2();	// 메소드 선언	//{} 메소드 구현
							// 추상 메소드 갖을 수 있음
	void func1(){
		System.out.println("Pm class -func1()");
	}
	void func1(int a){
		System.out.println("Pm class -func1()");
	}
}

abstract class Pm11 extends Pm01{
//	public Pm11() {
////		super();
//	}
}


public class Ex01 extends Pm11{
	
	public Ex01() {
//		super();
		System.out.println("me class 객체생성");
	}
	void func4(){
		System.out.println("func4 call");
	}
	
	public static void main(String[] args) {
		Pm01 me = new Ex01();
		me.func1();
		me.func1(2);
		me.func3();
		me.func4();
		
//		Pm01 pm01 = new Pm01();
//		pm01.func4();
		
	}

}
