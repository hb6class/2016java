package com.hb.pm;

public class Ex01 {

	public static void main(String[] args) {
//		prn(100);//~~.0
//		prn((int)3.14);
		sort(11, 9, 100);
//		System.out.println(abs(3));
//		System.out.println(abs(-3));
//		star(3);
//		star2(5,4);
	}
	public static void star(int a){ //Q1
		// *
		// **
		// ***
		for(int i=0; i<a; i++){
			for(int j=0; j<a; j++){
				if(j<i){System.out.print(' ');}
				else {System.out.print('*');}
			}
			System.out.println();
		}
		
	}
	public static void star2(int a, int b){ //Q2
		// *****
		// *****
		for(int i=0; i<b; i++){
			for(int j=0; j<a; j++){
				System.out.print('*');
			}
			System.out.println();
		}
	}
	public static int abs(int a){//Q3
		// 절대값 반환
		if(a<0){
			return -a;
		}
		return a;
	}
	
	public static void sort(int a, int b, int c){ //Q4
		// 오름차순으로 출력되도록
//		if(a<b && a<c){
//			System.out.print(a+"<");
//			if(b<c){
//				System.out.print(b+"<"+c);
//			}else if(b>c){
//				System.out.print(c+"<"+b);
//			}
//		}else if(b<a && b<c){
//			System.out.print(b+"<");
//			if(a<c){
//				System.out.print(a+"<"+c);
//			}else if(a>c){
//				System.out.print(c+"<"+a);
//			}
//		}else if(c<a && c<b){
//			System.out.print(c+"<");
//			if(a<b){
//				System.out.print(a+"<"+b);
//			}else if(a>b){
//				System.out.print(b+"<"+a);
//			}
//		}
		if(a<b && a<c && b<c){
			System.out.print(a+"<"+b+"<"+c);
		}else if(a<b && a<c && b>c){
			System.out.print(a+"<"+c+"<"+b);
		}else if(b<a && b<c && a<c){
			System.out.print(b+"<"+a+"<"+c);
		}else if(b<a && b<c && a>c){
			System.out.print(b+"<"+c+"<"+a);
		}else if(c<a && c<b && a<b){
			System.out.print(c+"<"+a+"<"+b);
		}else if(c<a && c<b && a>b){
			System.out.print(c+"<"+b+"<"+a);
		}
	}
	
	
	public static void prn(int num){
		System.out.println("입력하신 숫자는 "+num+"입니다");
	}
	
//	public static void prn(double num){
//		System.out.println("입력숫자는 실수 "+num+"입니다");
//	}
}
