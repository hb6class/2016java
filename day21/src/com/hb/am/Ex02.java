package com.hb.am;

// 싱글톤 - 하나의 객체를 강제적으로 재사용하게끔

class Am02{
	int a=1000;
	private static Am02 me;
	
	private Am02() {} // 반드시 디폴트 생성자를 구현
	public static Am02 func1(){
		if(me ==null){me  = new Am02();}
		return me;
	}
}

class Am22{
	int a=1000;
	private static Am22 me = new Am22();
	
	private Am22() {} // 반드시 디폴트 생성자를 구현
	public static Am22 getAm22(){
		return me;
	}
}

public class Ex02 {

	public static void main(String[] args) {
		Am22 me = Am22.getAm22();
		Am22 me2 = Am22.getAm22();
		me.a=me.a+100;
		System.out.println(me2.a);
	}

}
