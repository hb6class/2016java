package com.hb.am;

public class Ex03 {

	public static void main(String[] args) {
		// ����Լ�
		// �޼ҵ� == �Լ�
		// ���ڽ��� ��ȣ��
		System.out.println(say(7));
//		say(7,0);
		
	}
	
//	static int say(int a, int sum){
//		sum+=a;
//		if(a==1){
//			System.out.print(a+"=");
//			return sum;
//		}else{
//			System.out.print(a+"+");
//		}
//		return say(--a, sum);
//	}
//	static void say(int a, int sum){
//		sum+=a;
//		if(a==1){
//			System.out.print(a+"="+sum);
//			return;
//		}else{
//			System.out.print(a+"+");
//		}
//		say(--a, sum);
//	}
	static int say(int a){
		if(a==1){
			System.out.print(a+"=");
			return 1;
		}else{
			System.out.print(a+"+");
		}
		return a+say(--a);
	}
	
}
