package com.hb.pm;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			func01();
		}catch(ArithmeticException e){
			System.out.println("0으로 나누실 수 없습니다");
		}catch(NumberFormatException e){
			System.out.println("숫자만 입력하세요");
		}catch(Exception e){
		System.out.println("에러잡음");
		System.out.println(e.getMessage());
	}
	}
	
	public static void func01() throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.print("3을 나눌값은");
		int input = Integer.parseInt(sc.nextLine());
		if(input!=0){
			System.out.println("3/"+input+"="+3/input);
		}else{
			Exception ex = new ArithmeticException("에러생성");
			throw ex;
		}
	}

}













