package com.hb.day05;

public class Ex05 {

	/*
	 * 1 ~ 100���� ������ ����?(book)
	 * 1~100���� ��, ¦������ ���� ���Ͻÿ�(book)
	 * 1~100���� ��, Ȧ������ ���� ���Ͻÿ�(book)
	 */
	public static void main(String[] args) {
		int sum =0;
//		for(int i=1; i<=100; i++){
//			//System.out.print(i+" ");
//			sum = sum+i;
//		}

//		System.out.println("1~100�� �հ�:"+sum);
		
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
		System.out.println("1~100�� �հ�:"+sum);
		
		
		
		
	}

}
