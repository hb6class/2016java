package com.hb.am;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		//예외 - 회피 
		// if(){
		//   if(){}
		//}
		// if(){
		//	}else if(){
		//	}....
		
//		Scanner sc= new Scanner(System.in);
//		try{
//			for(int i=0; i<5; i++){
//					System.out.println("금액을 입력해주세요");
//					Integer.parseInt(sc.nextLine());
//					
//			}
//		}catch(NumberFormatException e){
//			e.printStackTrace();
//			return ;
//		}catch(Exception e){
//			e.printStackTrace();
//		}finally{
//			System.out.println("프로그램을 종료합니다");
//		}
		System.out.println(">>>"+func1());
	}
	static String func1(){
		Scanner sc= new Scanner(System.in);
		System.out.println("금액을 입력해주세요");
		int won = 0;
		String input=null;
		String output=null;
		try{
			input = sc.nextLine();
			won=Integer.parseInt(input);
			output=won+"원";
		}catch(NumberFormatException e){
//			e.printStackTrace();
			output = input;
		}catch(Exception e){
			e.printStackTrace();
//			return input;
		}finally{
			System.out.println("입력하신 금액을 출력하겠습니다");
		}
		return output;
		
	}

}
