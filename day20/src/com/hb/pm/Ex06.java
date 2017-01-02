package com.hb.pm;

import java.util.Arrays;

public class Ex06 {
	// 8Àå.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto ={30, 45, 20, 3, 1, 35};
//		Arrays.sort(lotto);
		int idx = Arrays.binarySearch(lotto, 30);
		System.out.println("30Àº"+idx);
		int[] arr2 =Arrays.copyOfRange(lotto, 1,3);
		System.out.println(Arrays.toString(arr2));
		
		
		
		String[] names ={"È«±æµ¿", "±è¸¸¼ö","±èÃ¶¼ö", "±èÃ¶"};
		Arrays.sort(names);
		int idx2 = Arrays.binarySearch(names, "È«±æµ¿");
		System.out.println("±è¸¸¼ö´Â"+idx2);
		System.out.println(Arrays.toString(names));
//		for(int i=0; i<names.length; i++){
//			System.out.println(names[i]);
//		}
		
		String[] arr = Arrays.copyOfRange(names, 1,3);
		names[1]="¹Ù²Þ";
		System.out.println(Arrays.toString(arr));
	}

}
