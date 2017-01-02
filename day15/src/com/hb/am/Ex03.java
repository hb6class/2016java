package com.hb.am;

import com.hb.am2.Ball;

public class Ex03 {
	
	public Ex03(){
		
	}

	public static void main(String[] args) {
		// 접근제한자 - 정보의 은닉성
		// public - 누구나 접근가능, 동일프로젝트내, 라이브러리 포함
		// protected - default 동일하나 상속시는 허용
		// default - 동일패키지만 접근허용
		// private - 동일패키지에서조차 허용하지 않음
		Ex02 ex02 = new Ex02();
		Ball ball = new Ball(4, "빨강");
//		ball.setColor("노랑");
//		String st =ball.getColor();
//		String st2 = ball.color;
//		ball.show();
		Temp tmp = new Temp();
	}
}





