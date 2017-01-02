package com.hb.am;

public class Ex02 {

	public static void main(String[] args) {
		// 배열 
		// 변수가 많이 필요
		// 자료형[] 변수명(배열명) = new 자료형[갯수]; // 배열의 선언
		// 자료형 변수명(배열명)[] = new 자료형[갯수]; // 배열의 선언
		// 변수명[인덱스]=초기값;
		// 변수명[인덱스]=초기값;
		// 변수명[인덱스]=초기값;
		// 자료형[] 변수명(배열명) = new 자료형[] {배열값들,배열값들,배열값들,.....}; // 배열의 선언
		// 자료형[] 배열명 = {배열값들,배열값들,배열값들,.....}; // 배열명[인덱스]
		// 인덱스 반드시 0부터 시작 ~~~ 하나씩 증가 ~~~ 중간 자름x ~~ 갯수-1까지
		int[] arr = new int[100]; //배열 선언
//		arr[0]=0;
//		arr[1]=1;
		arr[99]=2;
//		arr[3]=3;
//		arr[4]=4;
		
//		for(int i=0; i<100; i++){	// 배열의 초기화
//			arr[i]=i;
//		}
		
		for(int i=0; i<100; i++){
			System.out.println("arr["+i+"]="+arr[i]);
		}
		System.out.println("------------------------------");
		char[] ch = new char[26]; // 배열의 선언
//		for(int i=0; i<25; i++){	// 배열의 초기화
//			ch[i]=(char)(65+i);
//		}
		for(int i=0; i<26; i++){	// 배열의 출력
			System.out.print(ch[i]+" ");
		}
		System.out.println("------------------------------");
		int[] arr2 = new int[]{0,1,2,3,4};
		for(int i=0; i<5; i++){
			System.out.print(arr2[i]+" ");
		}
		System.out.println("\n------------------------------");
		int[] arr3 = {0,1,2,3,4};
		for(int i=0; i<5; i++){
			System.out.print(arr3[i]+" ");
		}
		System.out.println("\n------------------------------");
		// 배열 사용
		// 홀수들이 합(1~100)까지
		int total=0;
//		int[] arr4 = new int[50];
//		for(int i=0; i<50; i++){
//			arr4[i]=2*i+1;
//		}
//		for(int i=0; i<50; i++){
//			total+=arr4[i];
//		}
//		for(int i=0; i<50; i++){
//			if(i<49){
//				System.out.print(arr4[i]+"+");
//			}else{
//				System.out.print(arr4[i]+"=");
//			}
//		}
		//////////////////////////////
		int limit = 20;
		int[] arr5 = new int[limit];
		for(int i=0; i<limit; i+=2){
			arr5[i] = i+1;
		}
		for(int i=0; i<limit; i++){
			total += arr5[i];
		}
		for(int i=0; i<limit; i++){
			if(i==limit-1){
				System.out.print("=");
			}else if(arr5[i]==0){
				System.out.print("+");
			}else{
				System.out.print(arr5[i]);
			}
		}
		System.out.println(total);
		
		
		
		
		System.out.println("\n------------------------------");
		int[] sub = {70, 80, 90, 50};// 국어 영어 수학 과학
		int sum =0;
		
		for(int i=0; i<4; i++){
			sum +=sub[i];
		}
		System.out.println("합계는 "+sum+"점");
		
//		System.out.println(arr[0]+arr[1]+arr[2]+arr[3]+arr[4]);
		
//		int a = 0;
//		int b = 1;
//		int c = 2;
//		int d = 3;
//		int e = 4;
//		System.out.println(a+b+c+d);
//		
//		for(int i=0; i<10; i++){
//			int (char)(a+i) = i;
//		}
		
		int[] a={1,2,3,4,5};
		func1(new int[]{1,2,3,4,5});
	}
	static void func1(int[] a){
		
	}
}
