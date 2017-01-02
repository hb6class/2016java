package com.hb.pm;

interface Am01{
	// 필드 - 상수형 변수만 가능 public
	public final int a = 100;
	int b = 10;
	
	abstract public void func01();
	void func02();
	
}
abstract  class Am11{
	// 필드 - 상수형 변수만 가능 public
	public final int a = 100;
	int b = 10;
	
	public void func01(){
		System.out.println("부모클래스에서 수행된 func01()");
	}
	void func02(){
		System.out.println("부모클래스에서 수행된 func02()");
	}
	abstract public void func03();
}

//class Pm01 implements Am01{
//	int a = 3;
//	int b = 6;
//	@Override
//	public void func01(){
//		System.out.println("override func01()");
//	}
//	@Override
//	public void func02(){
//		System.out.println("a:"+a+", b:"+b);
//	}
//	
//}

public class Ex01 {
	
	

	public static void main(String[] args) {
//		Am11 me = new Am11(){
//			int a = 3;
//			int b = 6;
//			@Override
//			public void func01(){
//				super.func01();
//				System.out.println("override func01()");
//				func03();
//			}
//			@Override
//			public void func02(){
//				super.func02();
//				System.out.println("a:"+a+", b:"+b);
//			}
//			public void func03(){
//				System.out.println("~~~~~~~~");
//			}
//			
//		};
		class Pm01 implements Am01{
			int a = 3;
			int b = 6;
			@Override
			public void func01(){
				System.out.println("override func01()");
			}
			@Override
			public void func02(){
				System.out.println("a:"+a+", b:"+b);
			}
		};
		Pm01 me = new Pm01();
		me.func02();
		System.out.println(me.a);
		System.out.println(me.b);
		me.func01();
	}

}














