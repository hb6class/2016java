package com.hb.am;

public class Ex01 {

	public static void main(String[] args) {
		// �迭
		// ������ ����
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
		int[] arr = null; // �迭�� ����
		arr = new int[3]; // �迭�� ����
		for(int i=0; i<arr.length; i++){ // �迭�� �ʱ�ȭ
			arr[i]=0;
		}
		
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		
		arr= new int[5];
		
		arr =new int[]{1, 2, 3, 4};
		int arr2[] ={1, 2, 3, 4}; // new int[]���� ������ ���� ����� ����
		
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+"\t");
		}
		

	}

}










