package com.hb.am;

class Am05 extends Exception{
	public Am05() {
		super("���� ���� ����");
	}
	@Override
	public String toString() {
		return "���� �޽���";
	}
	public void func01(){
		System.out.println("�̷��Ե� ����");
	}
}

public class Ex05 {
	public static void main(String[] args) {
		Ex05 me = new Ex05();
		try{
			me.func01(0);
			System.out.println("������� ����");
		}catch (Am05 e) {
			e.func01();
		}catch(Exception e){
			System.out.println(e.toString());
		}
	}
	void func01(int a) throws Exception {
//		System.out.println(3/0);
		Am05 ex = new Am05();
		throw ex;
	}
}
