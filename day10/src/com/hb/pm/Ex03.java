package com.hb.pm;

import java.util.Scanner;

public class Ex03 {
	Scanner sc;
	static Ex03 me = new Ex03();
	
//	public Ex03(Scanner sc2) {
//		sc = sc2;
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
//		System.out.println("main start");
//		Scanner sc = new Scanner(System.in);
//		Ex03 me = new Ex03(sc);
//		System.out.println("main>"+sc.nextLine());
//		me.func1();
		Ex03.me.func3();
	}
	public void func3(){
		System.out.println("func3 start");
	}
	
	public void func1(){
		System.out.println("func1");
		String temp = sc.nextLine();
		System.out.println("func1>>>"+temp);
		func2();
	}
	
	public void func2(){
		System.out.println("func2");
		System.out.println("func3>>>"+sc.nextLine());
	}
}
