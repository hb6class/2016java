package com.hb.am;

public class Ex01 {
	int a;
	String st;
	
//	private Ex01(){
//		a=100;
//	}
	Ex01(){
		System.out.println("����Ʈ������ ȣ��");
	}
	Ex01(int a){
		this("�߰�");
		this.a = a;
		System.out.println(a+"int ���� �ϳ����� ������ ȣ��");
	}
	Ex01(String a){
		this();
		st =a;
		System.out.println(st+"String ���� �ϳ����� ������ȣ��");
	}
	Ex01(int a, String b){
		System.out.println("���� �ΰ� ���� ������ȣ��");
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
