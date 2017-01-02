package com.hb.day05;

public class Ex05 {

	/*
	 * 1 ~ 100까지 정수의 합은?(book)
	 * 1~100까지 중, 짝수들의 합을 구하시오(book)
	 * 1~100까지 중, 홀수들의 합을 구하시오(book)
	 */
	public static void main(String[] args) {
		int sum =0;
//		for(int i=1; i<=100; i++){
//			//System.out.print(i+" ");
//			sum = sum+i;
//		}

//		System.out.println("1~100의 합계:"+sum);
		
		int i=1;
		do{
//			if(i%2==0){
//				continue;
//			}
			System.out.println(i+" ");
			sum=sum+i;
			i=i+2;
//			if(i==100){
//				break;
//			}
		}while(i<101);
		System.out.println("1~100의 합계:"+sum);
		
		
		
		
	}

}
