package com.hb.day05;

public class Ex08 {

	/*
	 * 1+2+3+4+...+n 중, 이들의 합계가 10을 넘는 최소의 n값을 구하시오
	 */
	public static void main(String[] args) {
		
		int sum=0;
		int n=0;
		int tmp=0;
		while(true){
			n++;
			tmp=sum;
			sum = sum+n;
			if(sum>10){
				break;
			}
		}
		System.out.println("최소의 n값:"+n);
	}

}
