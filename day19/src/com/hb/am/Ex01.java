package com.hb.am;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		//���� - ȸ�� 
		// if(){
		//   if(){}
		//}
		// if(){
		//	}else if(){
		//	}....
		
//		Scanner sc= new Scanner(System.in);
//		try{
//			for(int i=0; i<5; i++){
//					System.out.println("�ݾ��� �Է����ּ���");
//					Integer.parseInt(sc.nextLine());
//					
//			}
//		}catch(NumberFormatException e){
//			e.printStackTrace();
//			return ;
//		}catch(Exception e){
//			e.printStackTrace();
//		}finally{
//			System.out.println("���α׷��� �����մϴ�");
//		}
		System.out.println(">>>"+func1());
	}
	static String func1(){
		Scanner sc= new Scanner(System.in);
		System.out.println("�ݾ��� �Է����ּ���");
		int won = 0;
		String input=null;
		String output=null;
		try{
			input = sc.nextLine();
			won=Integer.parseInt(input);
			output=won+"��";
		}catch(NumberFormatException e){
//			e.printStackTrace();
			output = input;
		}catch(Exception e){
			e.printStackTrace();
//			return input;
		}finally{
			System.out.println("�Է��Ͻ� �ݾ��� ����ϰڽ��ϴ�");
		}
		return output;
		
	}

}
