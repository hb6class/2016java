package com.hb.am;

import java.util.Arrays;

public class Ex03 {

	public static void main(String[] args) {
		long start  = System.nanoTime();
		System.out.println("main start");
//		System.exit(0);
		
		long end = System.nanoTime();
		System.out.println(end-start);
		System.out.println("--------------------");
		
		int[] arr1 = {1,2,3,4,5};
		
		int[] arr2 = new int[arr1.length];
		System.arraycopy(arr1, 1, arr2, 0, 4);
		System.out.println(Arrays.toString(arr2));
		System.out.println("--------------------");
		long start2 = System.currentTimeMillis();
		int sum=0;
		for(int i=0; i<100000000; i++){
			new Ex03();
		}
		
		long exit2 = System.currentTimeMillis();
		System.out.println(exit2-start2);
	}

}










