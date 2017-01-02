package com.hb.am;

public class Ex02 {
	int a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex02 me = new Ex02();
		int temp = me.func2()+me.func2();
		System.out.println("func2-a:"+temp);
		int a; // 지역변수
		a=4;
		System.out.println("a="+a);
//		z=me.func3(z);
//		z=me.func3(z);
//		z=me.func3(z);
//		System.out.println("z="+z);
//		//		me.func2();
//		System.out.println("a="+me.a);
	}
	
	public int func3(int a){
		return ++a;
	}
	
	public void func1(){
		for(int a=0; a<10; a++){
			
		}
		a++;
	}
	
	public int func2(){
//		int a=0;	// 지역변수
		a += 100; // 지역변수 > 맴버필드
		return a;
	}

}
