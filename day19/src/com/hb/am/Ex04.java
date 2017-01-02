package com.hb.am;
class Temp{
	Ex04.Inner04 temp;
	
}



public class Ex04 {
	int a=4;
	int b=5;
	
	public Ex04() {
	}
	
	class Inner04{
		int a=100;
		
		public Inner04() {
		}
		
		void func01(){
			System.out.println("Inner04 class func01()");
			System.out.println("Ex04-b:"+b);
			func02();
		}
	}

	public static void main(String[] args) {
		// 
		Ex04 me = new Ex04();
		Ex04.Inner04 inMe;
		inMe = me.new Inner04();
		System.out.println(inMe.a);
		inMe.func01();
	}
	
	public void func02(){
		System.out.println("Ex04 class func02");
	}

}











