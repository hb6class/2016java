package com.hb.day05;

public class Ex02 {

	/**
	 * @param args
	 */
	public static void func1(String st){ // 메소드
		// 메소드: 메소드명(인자){}
		System.out.println(st);
	} // func1 end
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st1="안녕";
		String st2 ="자바";
		String st3 ="메소드로 출력합니다";
		func1("java");
		//func1(st2);
		func1(st3);
		func2(10,1);
		func2("a",1);
		func2(1,2,3);
	} //main end
	// 메소드 오버로드
	public static void func2(int a, int b){
		System.out.println(a+"+"+b+"="+(a+b));
	}
	public static void func2(String a, int b){
		System.out.println(a+"+"+b+"="+(a+b));
	}
	public static void func2(int x, int y, int z){
		System.out.println(x+"+"+y+"+"+z+"="+(x+y+z));
	}
} // class end

class Ex022{
	
	
}// class end
