package com.hb.am;

import java.util.StringTokenizer;

public class Ex02 {

	public static void main(String[] args) {
		// 
		String names ="¿øÀ±Èñ,ÀÌ¿ì¿±,ÀÌÇÊÀç,,,,,±è¿µ¿ì";
		
//		char[] ch1=new char[3];
//		char[] ch2=new char[3];
//		char[] ch3=new char[3];
//		char[] ch4=new char[3];
//		names.getChars(0, 3, ch1, 0);
//		names.getChars(4, 7, ch2, 0);
//		names.getChars(8, 11, ch3, 0);
//		names.getChars(12, 15, ch4, 0);
//		for(int i=0; i<ch1.length; i++){
//			System.out.println(ch1[i]);
//		}
//		System.out.println(String.valueOf(ch1));
//		System.out.println(String.valueOf(ch2));
//		System.out.println(String.valueOf(ch3));
//		System.out.println(String.valueOf(ch4));
		/////////////////////////////////////////
//		char[][] ch = new char[4][3];
//		String[] name = new String[ch.length];
//
//		for(int i=0; i<ch.length; i++){
//			ch[i] = new char[3];
//			names.getChars(i*4, 3+i*4, ch[i], 0);
//		}
//		
//		for(int i=0; i<name.length; i++){
//			name[i]= String.valueOf(ch[i]);
//		}
//		
//		for(int i=0; i<name.length; i++){
//			System.out.println(name[i]);
//		}
		/////////////////////////////////////////
//		String[] name = names.split(",");
//		for(int i=0; i<name.length; i++){
//			System.out.println(name[i]);
//		}
//		System.out.println(name.length+"°³");
		/////////////////////////////////////////
		StringTokenizer token = new StringTokenizer(names,",");
//		System.out.println(token.countTokens());
//		System.out.println(token.nextToken());
//		System.out.println(token.nextToken());
//		System.out.println(token.nextToken());
//		System.out.println(token.nextToken());
		
		int cnt =token.countTokens();
		String[] name = new String[cnt];
		for(int i=0; i<cnt; i++){
			name[i]=token.nextToken();
		}
//		for(int i=0; i<cnt; i++){
//			System.out.println(token.nextToken());
//		}
		for(int i=0; i<cnt; i++){
			System.out.println(name[i]);
		}

		System.out.println(cnt+"°³");
		Temp tmp = new Temp();
	}

}

















