package com.hb.pm;

public class Lotto {

	public static void main(String[] args) {
		// 객체 지향적 구현 
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
//			Ball[] box2 = new Ball[5];
			Ball[] box = new Ball[45];
			String[] colorName ={"검정색","파랑색","노랑색","빨강색","초록색"};
			for(int i=0; i<45; i++){	// 공 객체 만들기와 박스에 담기
//				Ball ball = new Ball();
//				ball.num=i+1;
//				ball.color=colorName[(i+1)/10];
				box[i]= new Ball(i+1, colorName[(i+1)/10]);
			}
			int cnt=0;
			while(cnt<5){	// 공을 뽑아서 보여주는데 한번뽑았던 것은 다시 뽑는다
				int idx =(int)(Math.random()*45); // 0~ 44;
				if(box[idx].mark){
					box[idx].show();
					box[idx].setMark();
					cnt++;
				}
			}
//			Ball temp=null;
//			for(int i=0; i<10000; i++){	// 박스 흔들기
//				int idx =(int)(Math.random()*44)+1;
//				temp=box[0]; 
//				box[0] = box[idx];
//				box[idx] = temp;
//			}
//			for(int i=0; i<5; i++){	// 5개 선택하기
//				box2[i]=box[i];
//			}
//			for(int i=0; i<box2.length; i++){	// 방송하기
//				box2[i].show();
//			}
	}
}

