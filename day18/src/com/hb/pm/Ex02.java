package com.hb.pm;

public class Ex02 {

	public static void main(String[] args) {
		try{
		System.out.println(3/1);
		}catch(Exception e){
			System.out.println("오류");
			return;
		}finally{
			System.out.println("1프로그램을 종료합니다");
		}
		System.out.println("2프로그램을 종료합니다");
	}

}
