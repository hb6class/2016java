package com.hb.am;

class Pl01{
	double pi =3.14;
	
	Pl01(){
		super();
//		System.out.println("Pl01 ��ü ����");
	}
	Pl01(double pi){
		this.pi = pi;
		System.out.println("Pl01 ��ü ����2");
	}
	
	public void prn(){
		System.out.println("ù��° ���");
	}
	public void prn(String st){
		System.out.println(st+"��(��) "+pi);
	}
}

public class Ex01 extends Pl01{
	double pi =3.1312;
	
	
	Ex01(){
//		super(3.3);
		super();
		pi=5.5;
		System.out.println("Ex01 ��ü ����");
	}
	Ex01(double pi){
//		super();
		this();
		this.pi=pi;
		System.out.println("Ex01 ��ü ����2");
	}
	
	public static void main(String[] args) {
		Ex01 me = new Ex01(4.4);
		me.prn();
		me.prn("����");
//		Pl01 me2 = new Pl01();
//		me2.prn();
//		me2.prn("�̰�");
	}
	public void prn(){
		System.out.println(pi+"������ ���");
	}
}














