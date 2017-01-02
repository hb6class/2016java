package com.hb.am;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex01 ex01 = new Ex01(1);
		System.out.println(ex01.a+":"+ex01.st);
		// public - 누구나 접근가능, 동일프로젝트내, 라이브러리 포함
		// default - 동일패키지만 접근허용
		// private - 동일패키지에서조차 허용하지 않음
//		Temp tmp = new Temp();
		int a = com.hb.am2.Temp.a;
	}

}
