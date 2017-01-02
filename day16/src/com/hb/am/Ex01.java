package com.hb.am;

public class Ex01 {
	int a;
	String st;
	
//	private Ex01(){
//		a=100;
//	}
	Ex01(){
		System.out.println("디폴트생성자 호출");
	}
	Ex01(int a){
		this("추가");
		this.a = a;
		System.out.println(a+"int 인자 하나갖는 생성자 호출");
	}
	Ex01(String a){
		this();
		st =a;
		System.out.println(st+"String 인자 하나갖는 생성자호출");
	}
	Ex01(int a, String b){
		System.out.println("인자 두개 갖는 생성자호출");
	}
	
	public static void main(String[] args) {
		int i=0;
		Ex01 me =null;
		
		
		
		me= new Ex01();
		i = me.func1().a;
		
		System.out.println(i);
		
		
		me = new Ex01();
		i = me.func1(3).a;
		
		System.out.println(i);
		
		

	}
	Ex01 func1(){
		this.a=50;
		return this;
	}
	Ex01 func1(int a){
		return this;
	}
}
