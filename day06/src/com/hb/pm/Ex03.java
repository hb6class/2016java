package com.hb.pm;

public class Ex03 {

	public static void main(String[] args) throws Exception {
		/////////////////////////////////////
		//Q3. ����, ����, �� ����
		// > ����(0), ����(1), ��(2) ?
		// > 1
		// > com:����, me:����
		// > �����ϴ�.
		/////////////////////////////////////
		int com = (int)(Math.random()*3);// 0 <= ran < 1.0
		System.out.print("����(0), ����(1), ��(2) ?");
		int me = System.in.read()-48;
//		System.out.println(">>>"+me);
		// ran 0~2 ����
		// 0- <0.3 , 1 -0.3~0.6, 2-0.6<
//		if(ran<=0.3){
//			com=0;
//		}else if(ran<=0.6){
//			com=1;
//		}else{
//			com=2;
//		}
		if(com==0){
			System.out.print("com:����, ");
		}else if(com==1){
			System.out.print("com:����, ");
		}else{
			System.out.print("com:��, ");
		}
		if(me==0){
			System.out.print("me:����");
		}else if(me==1){
			System.out.print("me:����");
		}else if(me==2){
			System.out.print("me:��");
		}else{
			System.out.print("�Է¹����� 0~2���� �Դϴ�");
		}
		
	}

}











