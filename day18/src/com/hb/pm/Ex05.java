package com.hb.pm;

import java.util.Scanner;

public class Ex05 {
	// 6��.��Ű���� ����
	public static void main(String[] args) {
		// ����
		Scanner sc = new Scanner(System.in);
		while(true){
			try{
			proStart(sc);
			}catch(Exception e){
				System.out.println("�Է°� Ȯ��");
				sc = new Scanner(System.in);
				continue;
			}
			System.out.print("����Ͻðڽ��ϱ�?(yes/no)");
			if(sc.next().equals("no")){break;}
		}
	}
	public static void proStart(Scanner sc){
		System.out.print("1��°����:");
		int input1 = sc.nextInt();

		System.out.print("�����ȣ:");
		String bul = sc.next();
		
		System.out.print("2��°����:");
		int input2 = sc.nextInt();
		
		switch (bul) {
		case "+":
			hap(input1,input2);
			break;
		case "-":
			cha(input1,input2);
			break;
		case "*":
			gop(input1,input2);
			break;
		case "/":
			nanum(input1,input2);
			break;
		default:
			System.out.println("�Է¿���");
			break;
		}
	}
	public static void hap(int input1,int input2){
		System.out.println(input1+"+"+input2+"="+(input1+input2));
	}
	public static void cha(int input1,int input2){
		System.out.println(input1+"-"+input2+"="+(input1-input2));
	}
	public static void gop(int input1,int input2){
		System.out.println(input1+"*"+input2+"="+(input1*input2));
	}
	public static void nanum(int input1,int input2){
		System.out.println(input1+"/"+input2+"="+(input1/input2));
	}
}
