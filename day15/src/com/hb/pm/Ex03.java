package com.hb.pm;

public class Ex03 {
//public class Ex03 extends Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean boo = new Boolean(Boolean.TRUE);
		Boolean boo2 = new Boolean("false");
		System.out.println(boo);
		if(boo2.booleanValue()){
			System.out.println("���Դϴ�");
		}else{
			System.out.println("�����Դϴ�");
			
		}
		Ex03 me = new Ex03();
		System.out.println(me.toString());
	}

}
