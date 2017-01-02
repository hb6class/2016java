package com.hb.am;

public class Ex03 {

	public static void main(String[] args) {
		// https://c9.io 클라우드 나인
		// https://goorm.io 구름(한국)
		// arr 복사 arr2 역순
		int[] arr = new int[]{1,2,3,4,5};
//		int[] arr2 = arr;
		
		int[] arr2 = new int[arr.length];
		
		for(int i=0; i<arr.length; i++){
			arr2[i]=arr[i];
		}
		
		//////////////////////////////
		int temp =0;
		for(int i=0; i<arr2.length-1; i++){
			for(int j=i+1; j<arr2.length; j++){
				if(arr2[i]<arr2[j]){
					temp = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = temp;
				}
			
			}
		}
		//////////////////////////////
		System.out.println("---------------");
		System.out.println("arr1 :");
		
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		//////////////////////////////
		System.out.println("\n---------------");
		System.out.println("arr2 :");
		
		for(int i=0; i<arr2.length; i++){
			System.out.print(arr2[i]+" ");
		}
	}

}
