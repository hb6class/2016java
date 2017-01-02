package com.hb.day02;

class Ex02{
    
    public static void main(String[] args){

	// 변수 x=7 y=1 x*y=7
	// 변수의 선언은
	// 자료형 변수명;
	// 자료형
	// String - 문자열
	// int - 10진수 정수형(byte,short,long)
	// double - 10진수 실수형(float)
	//int a=7;
	int a; // 변수의 선언
	a=7; // 변수의 초기화
	//int b=1;
	int b;// 변수의 선언
	b=1;// 변수의 초기화
	String c=" x ";

        System.out.println("------------");
        System.out.println("구구단 7단");
        System.out.println("------------");
        System.out.println(a+c+b+" = "+a*b);
	b=b+1;
        System.out.println(a+c+b+" = "+a*b);
	b=b+1;
        System.out.println(a+c+b+" = "+a*b);
	b=b+1;
        System.out.println(a+c+b+" = "+a*b);
    }
}