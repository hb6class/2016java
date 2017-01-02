package com.hb.am;

abstract class Am02 extends Object{
	String msg="super";
	public Am02() {
		super();
		System.out.println("Am02 class create");
	}
	void func01(){
		System.out.println("추상class func01()");
	}
	abstract void func02();
}
class Am22 extends Am02{
	String msg = "this";
	public Am22() {
		super();
		System.out.println("Am22 class create");
	}
	@Override
	void func02(){
		System.out.println("자식class 재정의func02()");
	}
}
public class Ex02 {
	public static void main(String[] args) {
		Am02 me = new Am22();
		System.out.println("msg:"+me.msg);
		me.func02();
		me.func01();
	}

}
