package com.hb.am;

public class Ex01 {
	// Ŭ������ �������
	// 1. �޼ҵ�
	// 2. ���� - ����ʵ� // �ɹ����� // �������� // static�� Ŭ��������...
	public int a=100;	//����ʵ� - �ν��Ͻ�����
	int c;
	public static int b=50; //����ʵ� - Ŭ��������
	

	public static void func1(){	// ����ƽ�޼ҵ�, Ŭ�����޼ҵ�
		System.out.println("�� ����ƽ");
		System.out.println("Ŭ�������� b="+b);
		Ex01 me = new Ex01();
		int temp=me.a;
		System.out.println("�ɹ��ʵ� a="+temp);
	}
	public void func2(){ // non-static�޼ҵ�, �ν��Ͻ��޼ҵ�
		System.out.println("non-static");
		System.out.println("�ɹ� �ʵ� a="+a);
		System.out.println("Ŭ�������� b="+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		func1();
		Ex01 me = new Ex01();
		me.func2();
	}
}
