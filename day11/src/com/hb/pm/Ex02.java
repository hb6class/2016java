package com.hb.pm;

public class Ex02 {

	public static void main(String[] args) {
		// Q1.
		// arr1={8,4,2};
		// sort
		// {2,4,8};�� ���

		// Q2. �ζǹ�ȣ
		// arr2={24, 33, 17, 44, 2};
		// �ζ� ��ȣ�� 2, 17, 24, 33, 44 �Դϴ�.

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
				System.out.print(arr2[i] + "�Դϴ�");
			} else if (i == 0) {
				System.out.print("�ζ� ��ȣ�� " + arr2[i] + ",");
			} else {
				System.out.print(arr2[i] + ",");
			}
		}
	}

}
