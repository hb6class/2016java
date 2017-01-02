package com.hb.pm;

public class Ex05 {

	public static void main(String[] args) {
		// Double
		Float f1= new Float(0.0f);
		Float f2= new Float(1.0f);
		Float f3= null;
		
//		System.out.println(f1);
//		System.out.println(f1.byteValue());
//		System.out.println(f1.intValue());
//		System.out.println(f1.longValue());
//		System.out.println(f1.floatValue());
//		System.out.println(f1.doubleValue());
		System.out.println(Float.isNaN(f1/f2));	// 0을 0으로 나눌시
//		System.out.println(f1.isInfinite());
		System.out.println(Float.isInfinite(f1/f2));// 0으로 나눌시, 무한대
	}

}
