package com.hb.am;

// �������̽��� pm���� ����
// �ε��� �ȳ�
interface inter01{
	void func01();
}
interface inter11{
	void func02();
}
interface inter02 extends inter01, inter11{
	int temp=100;
	void func03();
	// �ʵ� - ���� ����� (��� ��������) public final �������
	// �޼ҵ� - public abstract �������
}
interface inter22{}
class Am02{
	public void func02(){}
//	public abstract void func03();
}
public class Ex02 extends Am02 implements inter02, inter22 {

	public static void main(String[] args) {

	}
	public void func01(){
		System.out.println(temp);
	}
	public void func03(){
	}
}
