package com.hb.pm;

interface Anony01{
	void func01();
}

abstract class Anony02{
	int a=1000;
	void fun02(){
		System.out.println("�߻�Ŭ���� �Դϴ�.");
	}
	abstract void fun02(int a);
	abstract void setA(int a);
}

public class Ex02 {
	// p276~286
	public static void main(String[] args) {
		Anony01 me = new Anony01(){
			@Override
			public void func01(){
				System.out.println("�������̽��� ���� ��ü ����");
			}
		};
		me.func01();
		System.out.println("-----------------------------------------");
		new Anony01(){
			@Override
			public void func01(){
				System.out.println("�������̽��� ���� ��ü ����");
			}
		}.func01();
		System.out.println("-----------------------------------------");
		Anony02 me2 = new Anony02(){
			@Override
			void fun02(int a){
				System.out.println(a+"Anony02-fun02()");
			}
			@Override
			void setA(int a){
				this.a = a;
			}
		};
		me2.fun02(2);
		me2.fun02(2);
		System.out.println(me2.a);
		System.out.println("-----------------------------------------");
		new Anony02(){
			@Override
			void fun02(int a){
				System.out.println(">>>"+this.a+"Anony02-fun02()");
			}
			@Override
			void setA(int a){
				this.a = a;
			}
		}.fun02(2);
		
		
		
		
		
		
		
		
		System.out.println("-----------------------------------------");
//		new Anony02(){
//			@Override
//			void fun02(int a){
//				System.out.println("����"+a+"�� ���� ���� �߻�Ŭ������ �޼ҵ�");
//			}
//		}.fun02(10);
		System.out.println("-----------------------------------------");
		Ex02 me3 = new Ex02(){
			@Override
			void func04() {
				System.out.println("���� �� ���� ���ιٲ�");
			}			
		};
		me3.func04();
	}
	
	void func04(){
		System.out.println("Ex01-func04() call");
	}
	
}








