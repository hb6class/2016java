package com.hb.pm;

public class Ex01 extends com.hb.am2.Temp {

	public static void main(String[] args) {
		// ���
		// public ������
		// protected - default ����, ��ӹ��� ���� ����
		// default ������Ű��
		// private Ŭ���� ����
		
//		com.hb.am2.Temp tmp = new com.hb.am2.Temp();
//		tmp.prn();
		Ex01 me = new Ex01();
		me.prn();
		Son son = new Son();
		Son son2 = son;
		System.out.println(son.showMoney2());
		System.out.println(son.equals(son2));
		Parent papa = new Parent();
		System.out.println(papa.showMoney1());
	}

}

class Son extends Parent1{
	int money=0;
//	///////////////////
//	int money1 = 3000;
//	int money2 = 5000;
//	
//	int showMoney1(){
//		return money1;
//	}
//	
//	int showMoney2(){
//		return money2;
//	}
//	//////////////////
}

final class Parent extends Object{
	int money1 = 3000;
	
	int showMoney1(){
		return money1;
	}
}

class Parent1{
	int money2 = 5000;
	
	int showMoney2(){
		return money2;
	}
}


