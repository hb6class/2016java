package com.hb.am;

abstract class Am01{
	int a=1;
	
	Am01(){
		System.out.println("추상클래스의 객체 생성");
	}
	Am01(int a){
		this.a = a;
		System.out.println("추상클래스2의 객체 생성");
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
//		System.out.println("자식클래스의 객체 생성");
//	}
//	
//	void func02(){
//		System.out.println("func02()의 오버라이드");
//	}
//	
//}


public class Ex01 extends Object {
	static Am01 am2;	// 

	public static void main(String[] args) {
		// 
//		Amm01 am = new Amm01();
		Ex01 me = new Ex01();
		System.out.println("메소드호출을 통한 필드 주입");
		me.func11();
		System.out.println("필드를 통한 바로 접근");
		Ex01.am2.func02();
		
	}
	public void func11(){
		am2 = new Am01(1000){
//			int a=2;
			void func01(int a){
				super.a = a;
			}
			void func02(){
				System.out.println(super.a+"func02()의 오버라이드");
			}
		};
//		am2.func01(100);
		am2.func02();
//		System.out.println(am2.a);
	}

}
