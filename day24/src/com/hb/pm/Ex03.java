package com.hb.pm;

import java.util.Date;

public class Ex03 {

	public static void main(String[] args) {
		for(int i=0; i<6; i++){
			for(int j=0; j<=i; j++){
			try {
				Thread.sleep(500); // 스레드의 잠시 휴식1/1000 ->1초
				// 해당의 스레드를 1/1000 잠시 휴식
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
