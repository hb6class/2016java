package com.hb.am;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input=0;
		int cnt =0;
		try{
			System.out.print("���ڸ� �Է����ּ���");
			input = Integer.parseInt(sc.nextLine());
			System.out.println("input:"+3/input);
		}catch(NumberFormatException ex){
//			System.out.println("���ڸ� �Է��϶󱸿�");
			ex.printStackTrace();
//			System.out.println(ex.getMessage());
//			System.out.println(ex.toString());
		}catch(ArithmeticException ex){// /0
//			System.out.println("0���� ������ �����ϴ�");
			ex.printStackTrace();
		}catch(Exception ex){// /0
			ex.printStackTrace();
		}
	}

}
