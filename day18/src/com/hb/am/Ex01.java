package com.hb.am;

abstract class Am01{
	int a=5;
	
	static void func01(){
		System.out.println("func01() call");
	}
	static void func01(int a){	// �����ε�
		System.out.println("func01() call");
	}
	void func02(){
		System.out.println("���� func02()");
	}
	abstract void func03(); // �����Ǹ� �ؼ� ������
}

public class Ex01 extends Am01{

	public static void main(String[] args) {
		// 
		Am01 me = new Ex01();
//		me.func01();
		me.func02();
		me.func03();
//		Ex01.func01();
	}
	void func02(){	// �������̵�
		super.func02();
		System.out.println("func02() call");
	}
	void func03(){
		System.out.println("func03() CALL");
	}
}
