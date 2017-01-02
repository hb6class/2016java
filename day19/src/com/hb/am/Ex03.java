package com.hb.am;

public class Ex03 {

	static class Inner03{
		static int a=100;
		int b = 50;
		
		static class Inin03{
			static int a=10;
		}
		
		public Inner03() {
		}
		
		static void func01(){
			System.out.println("Inner class func01() call");
		}
		void func02(){
			System.out.println("Inner class func02() call");
		}
	}	// Inner03 end
	
	public static void main(String[] args) {
		// 내부클래스
//		com.hb.am.Ex03 me = new com.hb.am.Ex03();
//		com.hb.am.Ex03.func();
		Ex03.Inner03.func01();
		System.out.println(Ex03.Inner03.a);
		System.out.println(Ex03.Inner03.Inin03.a);
		Ex03.Inner03 in = new Ex03.Inner03();
		in.func02();
		System.out.println(in.b);
	}
	public static void func(){
		System.out.println("Ex03 class func02() call");
	}
}
