package com.hb.pm;

public class Ex01 {

	public static void main(String[] args) {
		//비교연산자
		// >, <, <=, >=, !=, ==
		// true false
		
		boolean a = 3>1;
		int b = 3;
		//b++;
		int c = 1;
		++c;
		++c;
		boolean d=b==c;
		
		//논리연산자
		// and, or 
		// &&, ||
		// ex) 5<5 && 1<=33;
		// && - 양쪽 모두가 true일 경우만 true, 아니면 false
		// || - 둘중에 하나라도 true 이면 true, 모두가 false일경우만 false
		boolean e = 3>5&&2-1>0&&4<1||54-1>0;
		
		// 제어문 - 조건문, 반복문
		// 조건문 - if문 switch문(case문)
		// if문 - 만약 ~~(조건 참) 이라면 ~~~~수행
		// if(조건1){
		//		if(조건2){
		//		}else{
		//		}
		//	}else{
		//		if(조건2){
		//		}else{
		//		}
		//	}
		////////////////////////////////
		// if(조건1-t && 조건2-t){
		//	}else if(조건1-t && 조건2-f){
		//	}else if(조건1-f && 조건2-t){
		//	}else{//f,f
		//	}
		
		// Q1. x=5, y=9 , z=3
		// 이들을 오름차순 출력하시오
		// 
		// Q2. x=5, y=9 , z=3
		// 이들을 오름차순 출력하시오
		// 항상출력은 x < y < z순으로 출력
		// System.out.println("x < y < z :"+x+"<"+y+"<"+z);
		
		
		if(e){
			System.out.println("d는 참입니다");
		}
		
		
	}

}
