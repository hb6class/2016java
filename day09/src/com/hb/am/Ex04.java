package com.hb.am;

import java.util.Scanner;

public class Ex04 {
	int money=0;

	public static void main(String[] args) {
		// 
		System.out.println("어서오세요");
		Ex04 me = new Ex04();
		while(true){
			if(me.bankCD()==0){break;}
		}
		System.out.println("감사합니다");
	}
	public void add(){ // 예금 기능
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
			System.out.print("예금액:");
			add();
		}else if(input==2){
			System.out.print("출금액:");
			temp = sc.nextLine();
			int delMoney = Integer.parseInt(temp);
			del(delMoney);
		}else if(input==3){
			view();
		}
		return input;
	}
	public void view(){
		System.out.println("계좌의 남은 금액은 "+money+"원입니다");
	}
	public void startPrn(){
		System.out.println("------------------------");
		System.out.println("1.입금\t2.출금\t3.확인\t0.종료");
		System.out.println("------------------------");
		System.out.print(">>>");
	}
	

}
