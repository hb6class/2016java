package com.hb.pm;

public class Ex02 {

	public static void main(String[] args) {
		// static�޼ҵ�� static�޼ҵ� ������ ���ٸ� ���
		// static�޼ҵ忡�� non-static�޼ҵ�� �����Ͻ÷���
		// Ŭ������ ������ = new Ŭ������();
		// ���� ������ ������ ���ؼ��� ���డ��
		// �ݸ�, non-static�޼ҵ忡���� non-static�޼ҵ� ��������ϸ�
		// ���� static������ ȣ�⵵ ���
		
//		func1();
//		Ex02 ex2 = new Ex02();
//		ex2.func1();
//		ex2.func2(100);
//		ex2.func2(55);
		Ex02 ex1 = new Ex02();
		ex1.func2(50);
//		Ex02.prn();
//		Ex01.star(3);
//		System.out.println("---------------");
//		double a= -3.14;
//		System.out.println(Math.abs(a));

	}
	static void prn(){
		System.out.println("�� ����ƽ");
		Ex02 me = new Ex02();
		me.func1();
	}
	
	void func1(){
		System.out.println("func1");
	}
	void func2(int a){
		prn();
		func1();
		System.out.println(a+"�� ���ڷ� ���޹��� �޼ҵ�");
	}

}
