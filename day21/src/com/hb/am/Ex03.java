package com.hb.am;

class Am03{
	Am03 me;
	int idx=1;
	public Am03(int a) {
		super();
		me = this;
		System.out.println("Am03 create");
	}
	@Override
	public String toString() {
		return ""+idx;
	}
}

class Amm03 extends Am03{
	int idx=2;
	public Amm03() {
		super(4);
		System.out.println("Amm03 create");
	}
	public Amm03(int a) {
		this();
		System.out.println("Amm03 create2");
	}
	public Am03 func01(){
		System.out.println("func01()");
		return super.me;
	};
	@Override
	public String toString() {
		return ""+idx;
	}
	@Override
	public boolean equals(Object obj) {
		return idx==((Am03)obj).idx;
	}
}

public class Ex03 {

	public Ex03() {
		System.out.println("me create");
	}
	public static void main(String[] args) {
		Amm03 mm= new Amm03(7);
		Am03 mm2 = mm.func01();
		System.out.println(mm);
		System.out.println(mm2);
		System.out.println(mm2.equals(mm));
	}

}
