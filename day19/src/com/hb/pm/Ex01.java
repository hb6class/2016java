package com.hb.pm;


public class Ex01 {

	interface Inner{
		int a=11;
		void inFunc01();
		void inFunc02();
	}

	public static void main(String[] args) {
		// 익명클래스
		Ex01 me = new Ex01();
		Inner inn=me.func01();
		inn.inFunc01();
		inn.inFunc02();
		System.out.println(inn.a);
	}
	public Inner func01(){
		System.out.println("func01 start");
		System.out.println("func01 end");
		return new Inner(){
			int a=88;		// (자료,정보)은닉성
			public void inFunc01(){
				System.out.println((a++)+"내부클래스의 메소드 호출");
			}
			public void inFunc02(){
				System.out.println(a+"내부클래스의 메소드 호출");
			}
		};
		
	}
}










