package com.hb.day05;

public class Ex02 {

	/**
	 * @param args
	 */
	public static void func1(String st){ // �޼ҵ�
		// �޼ҵ�: �޼ҵ��(����){}
		System.out.println(st);
	} // func1 end
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st1="�ȳ�";
		String st2 ="�ڹ�";
		String st3 ="�޼ҵ�� ����մϴ�";
		func1("java");
		//func1(st2);
		func1(st3);
		func2(10,1);
		func2("a",1);
		func2(1,2,3);
	} //main end
	// �޼ҵ� �����ε�
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
