package com.hb.am;

import java.util.Scanner;

public class Ex03 {
	
	static int money=0;

	public static void main(String[] args) {
		// 은행 CD
		// 1. 입금	2.출금	3.계좌확인 
		// 돈의 자료가 유지
		System.out.println("어서오십시오");
		bankCD();
		System.out.println("이용해주셔서 감사합니다");
	}// main end
	
	public static void bankCD(){
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("-------------------------------");
			System.out.println("1. 입금\t2.출금\t3.계좌확인\t0.종료");
			System.out.println("-------------------------------");
			
			System.out.print("메뉴선택:");
			String st = sc.nextLine();
			int input = Integer.parseInt(st);
			int input2=0;
			if(input==0){
				break;
			}
			switch (input) {
			case 1:// 입금
				System.out.print("입금 금액:");
				input2=Integer.parseInt(sc.nextLine());
				func1(input2);
				break;
			case 2:// 출금
				System.out.print("찾으실 금액:");
				input2=Integer.parseInt(sc.nextLine());
				func2(input2);
				break;
			case 3:// 확인
				func3();
				break;
	
			default:// 입력오류 "입력범위는 0~3사이입니다";
				System.out.println("입력범위는 0~3사이입니다");
				break;
			}
		}
	}
	public static void func3(){
		System.out.println("현재 은행잔고는 "+money+"원입니다");
	}
	public static void func2(int a){
		money-=a;
	}
	public static void func1(int a){
		money+=a;
	}
	
}










