package com.hb.pm;

public class Ex04 {

	public static void main(String[] args) {
		//
		Integer in = 123;	// ¿ÀÅä¹Ú½Ì<->¾ð¹Ú½Ì
		
		Byte by1 = new Byte("1");
		System.out.println(by1);
		Byte by2 = new Byte("2");
		byte a= (byte)1;
		byte b= (byte)2;
		byte c = (byte)((int)a + (int)b);
		
		Byte by3 = new Byte((byte)(by1.byteValue()+by2.byteValue()));
		System.out.println(by3+3);
		System.out.println((byte)(Byte.MAX_VALUE+by1.byteValue()));
		
		Short sh1 = Short.MIN_VALUE;
		Short sh2 = Short.MAX_VALUE;
		System.out.println("min:"+sh1+",max:"+sh2);
		
		Long lo1= new Long(9223372036854775806l);
		System.out.println(lo1.intValue());
		System.out.println(Long.toBinaryString(lo1));
		System.out.println(Long.toOctalString(lo1));
		System.out.println(Long.toHexString(lo1));
		Long lo2 = Long.MIN_VALUE;
		Long lo3 = Long.MAX_VALUE;
		System.out.println("min:"+lo2+",max:"+lo3);
		
	}

}











