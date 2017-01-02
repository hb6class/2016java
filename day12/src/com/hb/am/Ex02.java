package com.hb.am;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = new String[]{"java", "web", "spring"};
		
		String[] arr2 = new String[3];
		arr2[0]=new String("java");
		arr2[1]=new String("web");
		arr2[2]=new String("spring");
		
		String[] arr3 = {"java", "web", "spring"};
		String[] arr4 = {"ab","cd","ef"};
		arr3 = arr4;
		
//		Ex02 me = new Ex02();
//		Ex02 me2 = new Ex02();
//		Ex02[] mes = new Ex02[2];
//		mes[0] = me;
//		mes[1] = me2;
		System.out.println("\n1번째 결과:");
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
				
		func1(arr);
		
		System.out.println("\n3번째 결과:");
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
	public static void func1(String[] st){
		st[1]="html";
		System.out.println("\n2번째 결과 출력");
		for(int i=0; i<st.length; i++){
			System.out.println(st[i]);
		}
	}
	
}
