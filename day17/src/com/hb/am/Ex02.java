package com.hb.am;

class Cl02{
	int a=4;
	
	public Cl02() {
//		super();
		System.out.println("����Ŭ����()~");
	}
	public Cl02(int a) {
//		this();
		System.out.println("����Ŭ����()~"+a);
	}
}

public class Ex02 extends Cl02{
	int a=5;
	
	public Ex02(int a) {
		super(a);
		System.out.println("��Ŭ����()~");
	}
	
	public static void main(String[] args) {
		Ex02 me = new Ex02(2);
//		Ex02 me2 = new Ex02(3);
		System.out.println(me.getA());
	}
	int getA(){
		return super.a;
	}
}








