package com.hb.pm;

public class Lotto {

	public static void main(String[] args) {
		// �ζǹ�ȣ ������
		// 2��, 3��
		// main, ���, ��ü
		// ����� ���� 8:30 sbs ��� ����Ȧ ��÷
		// �������� �� 1~45����
		// ���� ���� 5�� 
		// 31, 22, 41, 8, 10
		// ��xxȸ �ζǴ�÷��ȣ�� 8, 10, 22, 31, 41 �Դϴ� ���ϵ帳�ϴ�.
		
		// 1. �� ���� �ߺ� �Ұ�
		// 2. ����
		// 3. sort ����
		// + ���ʽ� ��ȣ
		//
		
		int[] ball = new int[45];
		int[] result = new int[6];
		for(int i=0; i<ball.length; i++){
			ball[i]= i+1;
		}
		
		//////////////////////
		int temp = 0;
		int ren = 0;
		for(int i=0; i<100000; i++){ // ���� ���� Ƚ�� 
			//ball[0] ball[ren]
			// ren : 1 ~ 44; 0 ~ 43 (+1)
			ren = (int)(Math.random()*44)+1;
			temp = ball[0];
			ball[0] = ball[ren];
			ball[ren] = temp;
		}
		//////////////////////
		for(int i=0; i<result.length; i++){
			result[i]=ball[i];
		}
		//////////////////////
		for(int m=0; m<result.length-1; m++){
			for(int n=m+1; n<result.length; n++){
				if(result[m]>result[n]){
					temp = result[m];
					result[m]=result[n];
					result[n]=temp;
				}
			}
		}
		
		//////////////////////
		int i=0;
		System.out.print("�� 2016ȸ �ζǴ�÷��ȣ�� ");
		for(i=0; i<result.length-1; i++){
			System.out.print(result[i]+" ");
		}
		System.out.print("�Դϴ�\n���ϵ帳�ϴ�.");
		System.out.print("���ʽ� ��ȣ�� "+result[i]+"�Դϴ�");
		
	}

}
