package com.hb.am;

import java.util.Scanner;

public class Ex04 {
	int money=0;

	public static void main(String[] args) {
		// 
		System.out.println("�������");
		Ex04 me = new Ex04();
		while(true){
			if(me.bankCD()==0){break;}
		}
		System.out.println("�����մϴ�");
	}
	public void add(){ // ���� ���
		Scanner sc = new Scanner(System.in);
		money += Integer.parseInt(sc.nextLine());
	}
	public void del(int del){
		money = money-del;
	}
	public int bankCD(){
		startPrn();
		Scanner sc = new Scanner(System.in);
		String temp = sc.nextLine();
		int input = Integer.parseInt(temp);
		if(input==1){
			System.out.print("���ݾ�:");
			add();
		}else if(input==2){
			System.out.print("��ݾ�:");
			temp = sc.nextLine();
			int delMoney = Integer.parseInt(temp);
			del(delMoney);
		}else if(input==3){
			view();
		}
		return input;
	}
	public void view(){
		System.out.println("������ ���� �ݾ��� "+money+"���Դϴ�");
	}
	public void startPrn(){
		System.out.println("------------------------");
		System.out.println("1.�Ա�\t2.���\t3.Ȯ��\t0.����");
		System.out.println("------------------------");
		System.out.print(">>>");
	}
	

}
