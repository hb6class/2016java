package com.hb.am;

abstract class Am03 extends Object{
	String msg="super";
	public Am03() {
		super();
		System.out.println("�θ� �ν��Ͻ� create");
	}
	void func01(){
		System.out.println("�߻�class func01()");
	}
	abstract void func02();
}
public class Ex03 {
	public static void main(String[] args) {
		Am03 me=new Am03(){
			String msg = "this";
			
			@Override
			void func02(){
				System.out.println("�ڽ�class ������func02()");
			}
		};
//		System.out.println("msg:"+me.msg);
//		me.func02();
//		me.func01();
	}

}
