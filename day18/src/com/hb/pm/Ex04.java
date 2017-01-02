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
		System.out.print("���̸� �Է��ϼ���:");
		int age = Integer.parseInt(sc.nextLine());
		if(age<1){
			throw new NumOutException("���̸� "+age+"��� �Է�����");
		}
		System.out.println("����� ���̴� "+age+"�� �Դϴ�");
	}
}












