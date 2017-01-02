package com.hb.pm;

public class Ex01 {

	public static void main(String[] args) {
		// Wrapper class
		int a=(int)2147483650L;	// 원시자료형
		Integer one =null;
		one = new Integer(3);
		System.out.println(one.toString());
		Integer one2=new Integer("7");	// 정수실수형 문자열
		Integer one3=new Integer("2");	// 정수실수형 문자열
		Integer one4 = one2+one3;
		int one5 = one2.intValue()+one3.intValue();
		one4 = new Integer(one5);
		int one6 = Integer.valueOf("234");
		System.out.println(one4.doubleValue());
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.SIZE);
		// 같으면 0, 크면 1, 작으면 -1
		System.out.println(one2.compareTo(one3));
		
		System.out.println(Integer.parseInt("123"));
		System.out.println(Double.parseDouble("3.14"));
		System.out.println(Integer.valueOf("123").intValue());
		System.out.println(Integer.toBinaryString(2));//2진수로 반환
		System.out.println(Integer.toOctalString(8));//8진수
		System.out.println(Integer.toHexString(16));//16진수
	}
	
}

class Integ{
	int a;
	public Integ(int a){
		this.a=a;
	}
	public Integ(String st){
		this.a=Integer.parseInt(st);
	}
	
	public int intValue(){
		return a;
	}
	
}


