package com.hb.am;

import java.util.Scanner;

public class Ex03 {
	
	static int money=0;

	public static void main(String[] args) {
		// ���� CD
		// 1. �Ա�	2.���	3.����Ȯ�� 
		// ���� �ڷᰡ ����
		System.out.println("����ʽÿ�");
		bankCD();
		System.out.println("�̿����ּż� �����մϴ�");
	}// main end
	
	public static void bankCD(){
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("-------------------------------");
			System.out.println("1. �Ա�\t2.���\t3.����Ȯ��\t0.����");
			System.out.println("-------------------------------");
			
			System.out.print("�޴�����:");
			String st = sc.nextLine();
			int input = Integer.parseInt(st);
			int input2=0;
			if(input==0){
				break;
			}
			switch (input) {
			case 1:// �Ա�
				System.out.print("�Ա� �ݾ�:");
				input2=Integer.parseInt(sc.nextLine());
				func1(input2);
				break;
			case 2:// ���
				System.out.print("ã���� �ݾ�:");
				input2=Integer.parseInt(sc.nextLine());
				func2(input2);
				break;
			case 3:// Ȯ��
				func3();
				break;
	
			default:// �Է¿��� "�Է¹����� 0~3�����Դϴ�";
				System.out.println("�Է¹����� 0~3�����Դϴ�");
				break;
			}
		}
	}
	public static void func3(){
		System.out.println("���� �����ܰ�� "+money+"���Դϴ�");
	}
	public static void func2(int a){
		money-=a;
	}
	public static void func1(int a){
		money+=a;
	}
	
}










