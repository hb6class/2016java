package com.hb.pm;


interface Inter01{
	public final int a=7;	// �ʵ� �����δ� ����������� ���,public final��������
	int b=7;	// public final��������
	
	public abstract void func1();	//public abstract ���� ����
	public abstract void func1(int a);
	void func2();
	
}

interface Inter02{
	void func1();
	void func3();
}

class Pm22 implements Inter02{
	public void func1(){}
	public void func3(){}
}

class Pm02 implements Inter01, Inter02{
	
	public void func1(){}
	public void func1(int a){}
	public void func2(){}
	public void func3(){}
	
}

public class Ex02 {

	public static void main(String[] args) {
		Inter02 in = new Pm22();
		in.func1();
		in.func3();
	}

}
