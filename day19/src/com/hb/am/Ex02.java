package com.hb.am;

import java.util.Scanner;

public class Ex02 extends Exception{
	public Ex02() {
		super("��Ŭ������ ���� ó��");
	}
	public Ex02(String msg) {
		super(msg);
	}

	public static void main(String[] args){
		System.out.println("���ڸ� �Է����ּ���");
		try{
		func01();
		}catch(NumberFormatException e){
			System.out.println("NumberFormatException���� ó���Ϸ�");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	public static void func01() throws Exception{
		Scanner sc;
		sc= new Scanner(System.in);
		String input = sc.nextLine();
		int su = Integer.parseInt(input);
		Ex02 exc = new Ex02("Ex02Ŭ������ ����ó������");
		throw exc;
//		System.out.println("�Է��� ����"+su);
	}
}
