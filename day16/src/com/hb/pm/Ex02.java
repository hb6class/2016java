package com.hb.pm;

public class Ex02 {

	public static void main(String[] args) {
		// �����ε� & �������̵�
		Child2 ch = new Child2();
		ch.prn();
		ch.prn("�ڽ�");
		Child1 ch2 = new Child1();
		ch2.prn();
		ch2.prn("�ڽ�2");
	}

}

class Child2 extends Parent2{
	void prn(){	// �������̵�
		System.out.println("Child2 prn�޼ҵ� ȣ��");
	}
	void prn(String st){
		System.out.println(st+"child2 prn�޼ҵ� ȣ��");
	}
	
}
class Child1 extends Parent2{
	void prn(String st){
		System.out.println(st+"child1 prn�޼ҵ� ȣ��");
	}
	
}

class Parent2{
	void prn(){
		System.out.println("Parent class prn�޼ҵ� ȣ��");
	}
	
}