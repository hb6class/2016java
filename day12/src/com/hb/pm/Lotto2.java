package com.hb.pm;

public class Lotto2 {

	public static void main(String[] args) {
		// �� ���� �ߺ� �Ұ� ���� ���� 5�� ����
		
		int[] ball = new int[5];
		
		for(int i=0; i<ball.length; i++){
			ball[i] = (int)(Math.random()*45)+1;
			for(int j=0; j<i; j++){
				//ball[i]: 0~i-1
				if(ball[i]==ball[j]){
					i--;
					break;
				}
			}
		}
		
		
		
		
		/////////////////////////
		for(int i=0; i<ball.length; i++){
			System.out.print(ball[i]+" ");
		}
		
	}

}
