package com.hb.day05;

public class Ex08 {

	/*
	 * 1+2+3+4+...+n ��, �̵��� �հ谡 10�� �Ѵ� �ּ��� n���� ���Ͻÿ�
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
		System.out.println("�ּ��� n��:"+n);
	}

}
