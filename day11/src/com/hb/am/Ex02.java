package com.hb.am;

public class Ex02 {

	public static void main(String[] args) {
		// �迭 
		// ������ ���� �ʿ�
		// �ڷ���[] ������(�迭��) = new �ڷ���[����]; // �迭�� ����
		// �ڷ��� ������(�迭��)[] = new �ڷ���[����]; // �迭�� ����
		// ������[�ε���]=�ʱⰪ;
		// ������[�ε���]=�ʱⰪ;
		// ������[�ε���]=�ʱⰪ;
		// �ڷ���[] ������(�迭��) = new �ڷ���[] {�迭����,�迭����,�迭����,.....}; // �迭�� ����
		// �ڷ���[] �迭�� = {�迭����,�迭����,�迭����,.....}; // �迭��[�ε���]
		// �ε��� �ݵ�� 0���� ���� ~~~ �ϳ��� ���� ~~~ �߰� �ڸ�x ~~ ����-1����
		int[] arr = new int[100]; //�迭 ����
//		arr[0]=0;
//		arr[1]=1;
		arr[99]=2;
//		arr[3]=3;
//		arr[4]=4;
		
//		for(int i=0; i<100; i++){	// �迭�� �ʱ�ȭ
//			arr[i]=i;
//		}
		
		for(int i=0; i<100; i++){
			System.out.println("arr["+i+"]="+arr[i]);
		}
		System.out.println("------------------------------");
		char[] ch = new char[26]; // �迭�� ����
//		for(int i=0; i<25; i++){	// �迭�� �ʱ�ȭ
//			ch[i]=(char)(65+i);
//		}
		for(int i=0; i<26; i++){	// �迭�� ���
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
		// �迭 ���
		// Ȧ������ ��(1~100)����
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
		int[] sub = {70, 80, 90, 50};// ���� ���� ���� ����
		int sum =0;
		
		for(int i=0; i<4; i++){
			sum +=sub[i];
		}
		System.out.println("�հ�� "+sum+"��");
		
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
