package com.hb.pm;

public class Lotto {

	public static void main(String[] args) {
		// 로또번호 생성기
		// 2개, 3개
		// main, 기능, 객체
		// 토요일 오후 8:30 sbs 상암 공개홀 추첨
		// 숫자적힌 공 1~45까지
		// 랜덤 숫자 5개 
		// 31, 22, 41, 8, 10
		// 재xx회 로또당첨번호는 8, 10, 22, 31, 41 입니다 축하드립니다.
		
		// 1. 이 숫자 중복 불가
		// 2. 랜덤
		// 3. sort 정렬
		// + 보너스 번호
		//
		
		int[] ball = new int[45];
		int[] result = new int[6];
		for(int i=0; i<ball.length; i++){
			ball[i]= i+1;
		}
		
		//////////////////////
		int temp = 0;
		int ren = 0;
		for(int i=0; i<100000; i++){ // 공을 섞는 횟수 
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
		System.out.print("제 2016회 로또당첨번호는 ");
		for(i=0; i<result.length-1; i++){
			System.out.print(result[i]+" ");
		}
		System.out.print("입니다\n축하드립니다.");
		System.out.print("보너스 번호는 "+result[i]+"입니다");
		
	}

}
