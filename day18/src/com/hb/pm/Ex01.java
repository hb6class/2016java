package com.hb.pm;

public class Ex01 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		try{
			func01();
//		}catch(NumberFormatException e){
//			System.out.println("����-���ڰ��� �ƴմϴ�");
//		}catch(ArithmeticException e){
//			System.out.println("����-0���� �����ϴ�");
//		}catch(Exception e){
//			
//		}
	}
	
	
	public static void func01() throws Exception{
		System.out.println(Integer.parseInt("1"));
		System.out.println(3/0);
	}
}
