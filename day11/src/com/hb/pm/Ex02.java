package com.hb.pm;

public class Ex02 {

	public static void main(String[] args) {
		// Q1.
		// arr1={8,4,2};
		// sort
		// {2,4,8};로 출력

		// Q2. 로또번호
		// arr2={24, 33, 17, 44, 2};
		// 로또 번호는 2, 17, 24, 33, 44 입니다.

		int[] arr2 = new int[]{ 24, 33, 17, 44, 2 };
		// int[] arr2={2,17,24,44,33};
		int temp = 0;
		// for(int i=1; i<arr2.length; i++){
		// if(arr2[0]>arr2[i]){
		// temp=arr2[0];
		// arr2[0]=arr2[i];
		// arr2[i]=temp;
		// }
		// }
		// for(int i=2; i<arr2.length; i++){
		// if(arr2[1]>arr2[i]){
		// temp = arr2[1];
		// arr2[1] = arr2[i];
		// arr2[i] = temp;
		// }
		// }
		// for(int i=3; i<arr2.length; i++){
		// if(arr2[2]>arr2[i]){
		// temp = arr2[2];
		// arr2[2] = arr2[i];
		// arr2[i] = temp;
		// }
		// }
		// for(int i=4; i<arr2.length; i++){
		// if(arr2[3]>arr2[i]){
		// temp = arr2[3];
		// arr2[3] = arr2[i];
		// arr2[i] = temp;
		// }
		// }
		for (int m = 0; m < arr2.length - 1; m++) {
			for (int n = m + 1; n < arr2.length; n++) {
				if (arr2[m] > arr2[n]) {
					temp = arr2[m];
					arr2[m] = arr2[n];
					arr2[n] = temp;
				}
			}
		}
		for (int i = 0; i < arr2.length; i++) {
			if (i == arr2.length - 1) {
				System.out.print(arr2[i] + "입니다");
			} else if (i == 0) {
				System.out.print("로또 번호는 " + arr2[i] + ",");
			} else {
				System.out.print(arr2[i] + ",");
			}
		}
	}

}
