package com.hb.am;

public class Ex04 {

	public static void main(String[] args) {
		//
//		try{
//			System.out.println(3/0);
//		}catch(ArithmeticException e){
////			System.out.println(e);
////			System.out.println(e.toString());
////			System.out.println(e.getMessage());
////			e.printStackTrace();
//		}
		int a=3;
			for(a=3; a>-3; a--){
				try{
					System.out.println("a="+a);
					System.out.println(3/a);
				}catch(ArithmeticException e){
//					System.out.println("에러처리");
				}
			}
		System.out.println("--------------------");
		int b=0;
		int c=0;
		int[] arr = new int[3];
			for(b=5; b>-2; b--){
				try{
					arr[b]=3/b;
					System.out.println(arr[b]);
//				}catch(ArrayIndexOutOfBoundsException e){
//					System.out.println(e.toString());
//				}catch(ArithmeticException e){
//					System.out.println("0으로 나눔");
				}catch(Exception e){
						System.out.println("에러");
				}finally{
					System.out.println(++c+"번 수행");
				}
			}
		
		
//		try{
//		arr[0]=1;
//		System.out.println(arr[0]);
//		arr[1]=2;
//		System.out.println(arr[1]);
//		arr[2]=3;
//		System.out.println(arr[2]);
//		arr[3]=4;
//		System.out.println(arr[3]);
//		}catch(ArrayIndexOutOfBoundsException e){
//			e.printStackTrace();
//		}
	}

}
