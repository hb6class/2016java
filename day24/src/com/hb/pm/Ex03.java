package com.hb.pm;

import java.util.Date;

public class Ex03 {

	public static void main(String[] args) {
		for(int i=0; i<6; i++){
			for(int j=0; j<=i; j++){
			try {
				Thread.sleep(500); // �������� ��� �޽�1/1000 ->1��
				// �ش��� �����带 1/1000 ��� �޽�
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
//			System.out.println(new Date(System.currentTimeMillis()));
				System.out.print('*');
			}
			System.out.println();
//			Date date = new Date();
//			System.out.println(date.getHours()
//								+":"+date.getMinutes()
//								+":"+date.getSeconds());
		}
	}

}
