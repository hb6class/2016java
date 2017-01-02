package com.hb.pm;

import java.util.Scanner;

interface Pm{
	void func01();
}

class Pm01 implements Pm{ //extends Object{
//	public Pm01() {
//		super();
//	}
	public void func01(){
		System.out.println("전원켜기");
	}
}

class Pm11 implements Pm{
	public void func01(){
		System.out.println("전원끄기");
	}
}

public class Ex01 {

	public static void main(String[] args) throws Exception {
		// Object
		Object obj = new Object();
		Pm01 pm01 = new Pm01();
		Pm11 pm11 = new Pm11();
		
		System.out.println(pm01.toString());
		System.out.println(pm01);
		System.out.println(pm01.hashCode());
		System.out.println(pm11.getClass());
		pm01.func01();
		pm11.func01();
		System.out.println("--------------------------");
		// 리플렉션
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\n 1.전원켜기\t2.전원끄기\n>>");
		String className ="com.hb.pm.";
		switch (sc.nextLine()) {
		case "1":
			className+="Pm01";
			break;
		case "2":
			className+="Pm11";
			break;
		default:
			break;
		}
		Class info=Class.forName(className);
		Object obj2 = info.newInstance();
		Pm pm02 = (Pm)obj2;
		System.out.println(pm02.getClass());
		pm02.func01();
	}

}













