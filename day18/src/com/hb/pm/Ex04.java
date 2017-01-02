package com.hb.pm;

import java.util.Scanner;


class NumOutException extends Exception {
	NumOutException(String msg){
		super(msg);
	}
}

public class Ex04 {
	public static void main(String[] args) {
		try{
			func01();
		}catch(NumOutException e){e.printStackTrace();}
	}
	public static void func01() throws NumOutException{
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요:");
		int age = Integer.parseInt(sc.nextLine());
		if(age<1){
			throw new NumOutException("나이를 "+age+"살로 입력했음");
		}
		System.out.println("당신의 나이는 "+age+"세 입니다");
	}
}












