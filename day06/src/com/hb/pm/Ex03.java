package com.hb.pm;

public class Ex03 {

	public static void main(String[] args) throws Exception {
		/////////////////////////////////////
		//Q3. 가위, 바위, 보 게임
		// > 가위(0), 바위(1), 보(2) ?
		// > 1
		// > com:바위, me:가위
		// > 졌습니다.
		/////////////////////////////////////
		int com = (int)(Math.random()*3);// 0 <= ran < 1.0
		System.out.print("가위(0), 바위(1), 보(2) ?");
		int me = System.in.read()-48;
//		System.out.println(">>>"+me);
		// ran 0~2 정수
		// 0- <0.3 , 1 -0.3~0.6, 2-0.6<
//		if(ran<=0.3){
//			com=0;
//		}else if(ran<=0.6){
//			com=1;
//		}else{
//			com=2;
//		}
		if(com==0){
			System.out.print("com:가위, ");
		}else if(com==1){
			System.out.print("com:바위, ");
		}else{
			System.out.print("com:보, ");
		}
		if(me==0){
			System.out.print("me:가위");
		}else if(me==1){
			System.out.print("me:바위");
		}else if(me==2){
			System.out.print("me:보");
		}else{
			System.out.print("입력범위는 0~2까지 입니다");
		}
		
	}

}











