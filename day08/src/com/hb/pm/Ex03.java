package com.hb.pm;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// scanner
		// non-static ���⸦ ����
		// >ù��°:3
		// >���࿬��:+
		// >�ι�°:4
		// 3+4=7
		//
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String input2 = sc.nextLine();
//		System.out.println(input+input2);
		int sum = Integer.parseInt(input) + Integer.parseInt(input2);
		System.out.println("�Է°��� \""+sum+"\"�Դϴ�");

	}

}
