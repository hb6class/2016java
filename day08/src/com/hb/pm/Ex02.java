package com.hb.pm;

public class Ex02 {

	public static void main(String[] args) {
		// static메소드는 static메소드 끼리의 접근만 허용
		// static메소드에서 non-static메소드로 접근하시려면
		// 클래스명 변수명 = new 클래스명();
		// 으로 생성된 변수를 통해서만 실행가능
		// 반면, non-static메소드에서는 non-static메소드 접근허용하며
		// 또한 static으로의 호출도 허용
		
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
		System.out.println("난 스태틱");
		Ex02 me = new Ex02();
		me.func1();
	}
	
	void func1(){
		System.out.println("func1");
	}
	void func2(int a){
		prn();
		func1();
		System.out.println(a+"을 인자로 전달받은 메소드");
	}

}
