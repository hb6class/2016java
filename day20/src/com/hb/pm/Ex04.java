package com.hb.pm;

import java.util.Random;

public class Ex04 {

	public static void main(String[] args) {
		// 
		double ran = Math.random(); // 0<=ran<1
		System.out.println(ran);
		
		Random ran2 = new Random();
		System.out.println(ran2.nextInt()); // int �ڷ����� ǥ�� ���� ������ �����߻�
		System.out.println(ran2.nextLong()); // long �ڷ����� ǥ�� ���� ������ �����߻�
		System.out.println(ran2.nextDouble()); // ==Math.random()
//		0~9 ����
		System.out.println(ran2.nextInt(10)); // 0<=ran2<����
//		1~45
		System.out.println(ran2.nextInt(45)+1);
	}

}
















