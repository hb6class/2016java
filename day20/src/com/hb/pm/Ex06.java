package com.hb.pm;

import java.util.Arrays;

public class Ex06 {
	// 8��.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto ={30, 45, 20, 3, 1, 35};
//		Arrays.sort(lotto);
		int idx = Arrays.binarySearch(lotto, 30);
		System.out.println("30��"+idx);
		int[] arr2 =Arrays.copyOfRange(lotto, 1,3);
		System.out.println(Arrays.toString(arr2));
		
		
		
		String[] names ={"ȫ�浿", "�踸��","��ö��", "��ö"};
		Arrays.sort(names);
		int idx2 = Arrays.binarySearch(names, "ȫ�浿");
		System.out.println("�踸����"+idx2);
		System.out.println(Arrays.toString(names));
//		for(int i=0; i<names.length; i++){
//			System.out.println(names[i]);
//		}
		
		String[] arr = Arrays.copyOfRange(names, 1,3);
		names[1]="�ٲ�";
		System.out.println(Arrays.toString(arr));
	}

}
