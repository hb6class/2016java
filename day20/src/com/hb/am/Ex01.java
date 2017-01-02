package com.hb.am;


class Am01{
	String msg ="super";
	void func01(){
		System.out.println("super class");
	}
}

class Am11 extends Am01{
	String msg ="this";
	@Override
	void func01() {
		System.out.println("this class");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		System.out.println(new Am11().msg);
		System.out.println(new Am11().msg);
	}

}
