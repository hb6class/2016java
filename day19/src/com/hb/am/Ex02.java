package com.hb.am;

import java.util.Scanner;

public class Ex02 extends Exception{
	public Ex02() {
		super("내클래스로 에러 처리");
	}
	public Ex02(String msg) {
		super(msg);
	}

	public static void main(String[] args){
		System.out.println("숫자를 입력해주세요");
		try{
		func01();
		}catch(NumberFormatException e){
			System.out.println("NumberFormatException에러 처리완료");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	public static void func01() throws Exception{
		Scanner sc;
		sc= new Scanner(System.in);
		String input = sc.nextLine();
		int su = Integer.parseInt(input);
		Ex02 exc = new Ex02("Ex02클래스는 에러처리가능");
		throw exc;
//		System.out.println("입력한 수는"+su);
	}
}
