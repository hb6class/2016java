package com.hb.am;

abstract class Am01{
	int a=1;
	
	Am01(){
		System.out.println("�߻�Ŭ������ ��ü ����");
	}
	Am01(int a){
		this.a = a;
		System.out.println("�߻�Ŭ����2�� ��ü ����");
	}
	void func01(int a){
//		this.a = a;
	}
	abstract void func02();
	
}

//class Amm01 extends Am01{
// int a=2;
//	Amm01(){
////		super();
//		System.out.println("�ڽ�Ŭ������ ��ü ����");
//	}
//	
//	void func02(){
//		System.out.println("func02()�� �������̵�");
//	}
//	
//}


public class Ex01 extends Object {
	static Am01 am2;	// 

	public static void main(String[] args) {
		// 
//		Amm01 am = new Amm01();
		Ex01 me = new Ex01();
		System.out.println("�޼ҵ�ȣ���� ���� �ʵ� ����");
		me.func11();
		System.out.println("�ʵ带 ���� �ٷ� ����");
		Ex01.am2.func02();
		
	}
	public void func11(){
		am2 = new Am01(1000){
//			int a=2;
			void func01(int a){
				super.a = a;
			}
			void func02(){
				System.out.println(super.a+"func02()�� �������̵�");
			}
		};
//		am2.func01(100);
		am2.func02();
//		System.out.println(am2.a);
	}

}
