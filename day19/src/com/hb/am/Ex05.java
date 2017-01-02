package com.hb.am;

interface Fu{
	void func03();
	void func04();
	void func05();
}

public class Ex05  {
	int a=5;
	
	public Ex05() {
	}

	public static void main(String[] args) {
		Ex05 me = new Ex05();
		me.func01();
		Fu local = me.func02(4);
		local.func03();
		local.func04();
		local.func05();
	}
	
	void func01(){
		System.out.println("Ex05-func01()");
	}
	Fu func02(final int m){
		System.out.println("Ex05-func02()");
//		final int z=9;
		final Ex05 me=this;
		class LocalC implements Fu{
			int i=10;
			int a=10;
			LocalC() {
			}
			public void func03(){
				System.out.println("로컬C-func03()-"+m);
			}
			public void func04(){
				System.out.println("로컬C-func04()-"+me.a);
			}
			public void func05(){
				System.out.println("로컬C-func04()-"+i);
			}
		}
		LocalC inn= new LocalC();
		return inn;
	}

}



















