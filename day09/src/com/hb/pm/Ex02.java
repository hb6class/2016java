package com.hb.pm;

import java.util.Scanner;

public class Ex02 {
	int a=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ex02 me = new Ex02();
		Ex02 me;	// ����(���������� ����)
		me = new Ex02();	// �ʱ�ȭ
		Ex02 me2 = me;
		System.out.println(me.a);
		me.a++;
		System.out.println(me.a);
		me = new Ex02();
		System.out.println(me.a);
		
		String st = null;
		Scanner sc=null;
		sc= new Scanner(System.in);
		
		sc.nextLine();
		
	}

}
