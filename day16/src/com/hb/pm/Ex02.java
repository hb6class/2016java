package com.hb.pm;

public class Ex02 {

	public static void main(String[] args) {
		// 오버로드 & 오버라이드
		Child2 ch = new Child2();
		ch.prn();
		ch.prn("자식");
		Child1 ch2 = new Child1();
		ch2.prn();
		ch2.prn("자식2");
	}

}

class Child2 extends Parent2{
	void prn(){	// 오버라이드
		System.out.println("Child2 prn메소드 호출");
	}
	void prn(String st){
		System.out.println(st+"child2 prn메소드 호출");
	}
	
}
class Child1 extends Parent2{
	void prn(String st){
		System.out.println(st+"child1 prn메소드 호출");
	}
	
}

class Parent2{
	void prn(){
		System.out.println("Parent class prn메소드 호출");
	}
	
}