package com.hb.am;

public class Ex01 {

	public static void sayFunc1(){
		System.out.println("f1 start");
		// 메소드
		// 자료형 메소드명(인자...){}
		// 첫글짜 소문자 두번째 단어의 첫글짜 대문자
		// 메소드의미 - 기능요소
		// 자료형의 결정은 return xx; 중 xx에 의해 결정
		// 단, return 없거나 return; 경우 void
		System.out.println("자바월드");
		System.out.println("f1 end");
	}
	
	public static void sayFunc2(String name){
		System.out.println("f2 start");
		System.out.println(name+"님 환영합니다.");
		sayFunc3(name);
		System.out.println(name+"님 환영했었습니다.");
		System.out.println("f2 end");
	}
	//public static void sayFunc2(String name){}
	// 메소드 오버로드
	public static void sayFunc2(int age){
		System.out.println("당신은 "+age+"세 입니다");
	}
	public static void sayFunc2(String name, int age){
		System.out.println(name+"님 당신은 "+age+"세 입니다");
	}
	public static void sayFunc2(int age, String name){
		System.out.println(age+"세의 "+name+"님 환영합니다");
	}
//	public static int sayFunc2(int age){
//		System.out.println("당신은 "+age+"세 입니다");
//		return 19;
//	}
	public static void main(String[] args) {
		System.out.println("main start");
		sayFunc1();
		sayFunc2("홍길동");
		sayFunc2(19);
		sayFunc2(15,"로미오");
		System.out.println("main end");
		
	}
	
	public static void sayFunc3(String name){
		name="홍길자";
		System.out.println(name+"님 나도 실행해줘");
	}

}
