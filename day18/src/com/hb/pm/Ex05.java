package com.hb.pm;

import java.util.Scanner;

public class Ex05 {
	// 6장.패키지와 예외
	public static void main(String[] args) {
		// 계산기
		Scanner sc = new Scanner(System.in);
		while(true){
			try{
			proStart(sc);
			}catch(Exception e){
				System.out.println("입력값 확인");
				sc = new Scanner(System.in);
				continue;
			}
			System.out.print("계속하시겠습니까?(yes/no)");
			if(sc.next().equals("no")){break;}
		}
	}
	public static void proStart(Scanner sc){
		System.out.print("1번째숫자:");
		int input1 = sc.nextInt();

		System.out.print("연산기호:");
		String bul = sc.next();
		
		System.out.print("2번째숫자:");
		int input2 = sc.nextInt();
		
		switch (bul) {
		case "+":
			hap(input1,input2);
			break;
		case "-":
			cha(input1,input2);
			break;
		case "*":
			gop(input1,input2);
			break;
		case "/":
			nanum(input1,input2);
			break;
		default:
			System.out.println("입력오류");
			break;
		}
	}
	public static void hap(int input1,int input2){
		System.out.println(input1+"+"+input2+"="+(input1+input2));
	}
	public static void cha(int input1,int input2){
		System.out.println(input1+"-"+input2+"="+(input1-input2));
	}
	public static void gop(int input1,int input2){
		System.out.println(input1+"*"+input2+"="+(input1*input2));
	}
	public static void nanum(int input1,int input2){
		System.out.println(input1+"/"+input2+"="+(input1/input2));
	}
}
