package com.hb.day05;

public class Ex03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		a=5;
		b=3;
		func1(a,b);
		func2(a,b);
		int x = func3(a,b);
		System.out.println("func3의 수행 결과는 "+x);
		return;
	}
	public static void func1(int a, int b) {
		System.out.println(a+"+"+b+"="+(a+b));
		return;
	}
	
	public static void func2(int a, int b) {
		System.out.println(a+"-"+b+"="+(a-b));
	}
	public static int func3(int a, int b){
		int c = a*b;
		return c;
	}
}
