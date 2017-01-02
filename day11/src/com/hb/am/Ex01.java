package com.hb.am;

public class Ex01 {
	final int a;
	static final double PI=3.14;	// 변수의 상수화
	
	public Ex01() {
		a=4;
	}
	public Ex01(int a) {
//		PI= 4.14;
		this.a=a;
	}

	public static void main(String[] args) {
		// 객체지향 언어
		// 기능 - 메소드 - 동사, 속성 - 필드 - 명사
		
		// 메소드
		// 형태 : [static] 자료형 메소드명(인자){
		//			...
		//			return 자료형에 해당하는 값;
		//			}
		// 1. static 메소드,클래스메소드,...함수
		// 		[패키지경로].[class명].메소드명() (나자신이 갖는 메소드의 경우 class명 생략)
		// 		객체의 생성없이 바로 사용가능
		//		프로그램 시작과 동시에 메모리 static영역에 로딩되어 실행
		//		가비지 컬렉션의 메모리 관리대상(x)
		//		라이프 사이클은 프로그램 시작 ~ 종료시까지 항시
		//		절차지향 프로그래밍 - 함수 ...
		// 2. non-static 메소드, 인스턴스 메소드
		//		[패키지경로.]클래스명 me = new [패키지경로.]생성자호출;
		//		me.메소드호출
		//		this = 참조변수역할
		//		객체생성이 우선 -> 생성된 객체의 주소 기억하기위한 참조변수(자료형 클래스타입)
		//		참조변수(객체 메모리주소값).메소드명()
		// 
		// 생성자 
		//	객체 생성에 관여 - 객체 생성시 추가적인 작업
		//	기본 : [접근제한자] 클래스명(){}
		//	객체 생성시에 단한번 수행 - 재호출 불가
		//	일반적으로 필드값의 초기화
		//
		// 멤버필드
		// 변수
		// [static] 자료형 변수명;
		// 호출시 지역변수와 멤버필드 그 명칭이 동일할 시, 우선 순위는 지역변수>멤버필드
		// 클래스변수 (static) - 메모리 static 영역에 프로그램시작과동시에 ~ 프로그램end
		// 클래스명.변수명
		// 인스턴스변수(non-static)
		// 참조변수명.변수명
//		int a = func1();
		Ex01 me = new Ex01();
		me.func2();
	}

	static int func1(){
		System.out.println("static 메소드");
		return 0;
	}
	
	void func2(){
		final int a=0;
		
		System.out.println(a+"non-static 메소드");
	}
	
}












