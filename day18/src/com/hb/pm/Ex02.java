package com.hb.pm;

public class Ex02 {

	public static void main(String[] args) {
		try{
		System.out.println(3/1);
		}catch(Exception e){
			System.out.println("����");
			return;
		}finally{
			System.out.println("1���α׷��� �����մϴ�");
		}
		System.out.println("2���α׷��� �����մϴ�");
	}

}
