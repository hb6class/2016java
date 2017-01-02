package com.hb.day05;

public class Ex07 {

	/* 난이도 최상
	 * 1/2 + 2/3 + 3/4 + .... 99/100을 계산하는 프로그램
	 * 
	 * (1-1/2)+(1-1/3)+(1-1/4)...(1-1/100)
	 * 
	 */
	public static void main(String[] args) {
		
		double sum=0.0;
//		for(int i=1; i<100; i++){
//			sum=sum+i/(i+1);
//		}
		for(int i=2; i<101; i++){
			sum=sum+(1-1.0/i);
		}
		
		
		System.out.println("결과:"+sum);
		
	}

}
