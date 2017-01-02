package com.hb.pm;

public class Ex04 {
	// 상속 p236 ~ p251
	public static void main(String[] args) {
		Child41 ch1 = new Child41();
		System.out.println(ch1.func1());
		Child42 ch2 = new Child42();
		System.out.println(ch2.func1());
	}
}
class Child41 extends Parent4{
	int func1(){
		return money;
	}
}
class Child42 extends Parent4{
	int money = 3000; // 오버라이드
	int func1(){
		return money;
	}
}
class Parent4{
	int money =-5000;
}