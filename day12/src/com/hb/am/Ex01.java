package com.hb.am;

public class Ex01 {

	public static void main(String[] args) {
		// 배열
		// 변수의 연속
		System.out.println("--------------------------");
//		String input1 = args[0];
//		String input2 = args[1];
//		String input3 = args[2];
//		System.out.println("input count:"+args.length
//				+"("+input1+", "+input2+", "+input3+")");
		System.out.println("--------------------------");
		for(int i=0; i<args.length; i++){
			System.out.println(args[i]);
		}
		
		System.out.println("--------------------------");
		int[] arr = null; // 배열의 선언
		arr = new int[3]; // 배열의 선언
		for(int i=0; i<arr.length; i++){ // 배열의 초기화
			arr[i]=0;
		}
		
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		
		arr= new int[5];
		
		arr =new int[]{1, 2, 3, 4};
		int arr2[] ={1, 2, 3, 4}; // new int[]생략 가능한 경우는 선언시 최초
		
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+"\t");
		}
		

	}

}










