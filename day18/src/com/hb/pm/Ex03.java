package com.hb.pm;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			func01();
		}catch(ArithmeticException e){
			System.out.println("0���� ������ �� �����ϴ�");
		}catch(NumberFormatException e){
			System.out.println("���ڸ� �Է��ϼ���");
		}catch(Exception e){
		System.out.println("��������");
		System.out.println(e.getMessage());
	}
	}
	
	public static void func01() throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.print("3�� ��������");
		int input = Integer.parseInt(sc.nextLine());
		if(input!=0){
			System.out.println("3/"+input+"="+3/input);
		}else{
			Exception ex = new ArithmeticException("��������");
			throw ex;
		}
	}

}













