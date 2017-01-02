package com.hb.day05;

public class Ex04 {

	/*
	 * @param args
	 * 
	 */
	public static int func1(int i, int j){ //더하기 기능
		return i+j;
	}
	public static int func2(int i, int j){ // 빼기 기능
		return i-j;
	}
	public static int func3(int i, int j){ // 곱셈 기능
		return i*j;
	}
	public static int func4(int i, int j){ // 나누기 기능
		return i/j;
	}
	
	
	public static void main(String[] args) {
		 
		int a = Integer.parseInt(args[0]);
		String st2 = args[1];
		int b = Integer.parseInt(args[2]);
		int result = 0;
		
		//////
		result = func6(a,st2,b);
		
		///////
		String re = a+st2+b+"="+result;
		func5(re);
		
	} // main end
	
	public static int func6(int a, String st2, int b){
		int result=0;
		switch (st2) {
		case "+":
			result = func1(a,b);
			break;
		case "-":
			result = func2(a,b);
			break;
		case "x":
			result = func3(a,b);
			break;
		case "/":
			result = func4(a,b);
			break;

		default:
			break;
		}
		return result;
	}
	
	public static void func5(String re){
		System.out.println(re);
	}
	
	
} // class end
