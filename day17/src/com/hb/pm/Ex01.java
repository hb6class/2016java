package com.hb.pm;


abstract class Pm01{	// �߻�Ŭ����
	int i;
	public Pm01(){
//		super();
		System.out.println("�߻�Ŭ���� ��ü����");
	}
	void func3(){
		System.out.println("�����ǲ���");
	}
	abstract void func4();
//	abstract void func2();	// �޼ҵ� ����	//{} �޼ҵ� ����
							// �߻� �޼ҵ� ���� �� ����
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
		System.out.println("me class ��ü����");
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
