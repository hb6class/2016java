package com.hb.am;

import java.io.UnsupportedEncodingException;

public class Ex02 {
	int a;

	public static void main(String[] args) throws Exception {
		// ¹®ÀÚ¿­
		
		String st1 = "java";//temp =new String("java");
//		String st2 = "world";
//		String st3 = new String("java");
//		String st4 = "world"; //new String("world");
//		String st5 = new String("java");
		
		String st6 = new String();
		char[] ch ={'j','a','v','a'};
//		String st6_2= new String(new char[]{'j','a','v','a'});
		String st7 = new String(ch,3-1,1);
		byte[] by = {65,66,67};
		String st8 = new String(by, 0, 3);
		
		System.out.println(st7);
		////////////////
		//String sub1 = "";
		////////////////
//		System.out.println(st1+st2=="javaworld");
		
		String a ="a";
		String b ="b";
		String c ="c";
		System.out.println(a+b+c);
		System.out.println(a.concat(b).concat(c));
		System.out.println("--------------------------");
		String d = "java wordd";
//		char chr1 =d.charAt(9);
		char[] ch3 = d.toCharArray();
//		System.out.println(chr1);
//		char[] chr2 = {d.charAt(0),d.charAt(1),d.charAt(2),d.charAt(3)};
//		String st9 = new String(chr2);
//		System.out.println(st9);
//		System.out.println(d.codePointAt(0));
//		System.out.println((char)106);
//		System.out.println(d.compareTo("javb wordd"));
		char[] cha2={'a','b','c'};
		String st10 = String.copyValueOf(cha2);
		System.out.println(st10.startsWith("bc"));
		
		byte[] by2 = st10.getBytes();
		char[] ch11 = new char[10];
		for(int i=0; i<ch11.length; i++){
			ch11[i]='-';
		}
		String st11 = "javaWorld";
		st11.getChars(0	, st11.length(), ch11, 0);
//		System.out.println("java".length());
		for(int i=0; i<ch11.length; i++){
			System.out.println(ch11[i]);
		}
		
		
		System.out.println("--------------------------");
//		me.func1().func1().func1().func1().func1();
		
//		System.out.println(st1.concat(st2));
//		System.out.println(st3+st4);
//		System.out.println(st3.concat(st4));
//		System.out.println(st1==st3);
//		System.out.println(st1);
//		System.out.println(st3);
//		System.out.println(st1.equals(st3));
		Ex02 me = new Ex02();
//		System.out.println(me.a);
		me.func2().func2().func2().func2().func2().func2();
//		"ja"+"va"+"wor"+"ld";
//		"javaworld"
	}

	public Ex02 func2(){
		int a=100;
		System.out.println(a);
		System.out.println(this.a);
//		Ex02 you=this;
		return this;
	}
	
	
	
	
	
	
	
	
	public Ex02 func1(){
		return this;
	}
}
