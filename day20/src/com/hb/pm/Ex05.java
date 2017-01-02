package com.hb.pm;

import java.util.Arrays;

public class Ex05 {

	public static void main(String[] args) {
		// Arrays class
		int[] arr1 = {30, 45, 20, 3, 1, 35};
		Arrays.sort(arr1);
		for(int i=0; i<arr1.length; i++){
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		
		int[] arr2 = new int[10];
//		for(int i=0; i<arr2.length; i++){
//			arr2[i]=10;
//		}
		Arrays.fill(arr2, 11);
		Arrays.fill(arr2, 3,5,2);
		for(int i=0; i<arr2.length; i++){
			System.out.print(arr2[i]+" ");
		}
	}

}
