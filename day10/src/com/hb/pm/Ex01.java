package com.hb.pm;

public class Ex01 {
	public static int num1;
	public int num2;
	
	public Ex01(){
		//持失切 - 梓端 持失 淫食
		System.out.println("梓端 持失");
	}
	
	public void func1(){
		System.out.println("num1:"+num1+", num2:"+num2);
	}
	public void func2(){
		num1++;
	}
	public void func3(){
		num2=num1;
	}
	
	public static void main(String[] args) {
		Ex01 me = new Ex01();
		me.func1();
		me.func2();
		me.func1();
		me.func3();
		me.func1();
		System.out.println("---------------");
		Ex01 me2 = new Ex01();
		me2.func1();
		me2.func2();
		me2.func1();
		me2.func3();
		me2.func1();
	}
}



