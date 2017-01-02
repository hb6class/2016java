package com.hb.pm;

public class Ex01 {

	public static void main(String[] args) {
		// String class
		String st1 = "java";
		
//		System.out.println(st1.hashCode());
//		System.out.println(st1.indexOf("z"));
//		System.out.println(st1.isEmpty());
//		System.out.println(st1.matches("java1"));
//		System.out.println(st1.replaceFirst("a", "b"));
//		System.out.println(st1.substring(2,3));
//		char[] ch =st1.toCharArray();
//		for(int i=0; i<ch.length; i++){
//			System.out.println(ch[i]);
//		}
		String st = "  ab c D   EFG   ";
		System.out.println(st.toLowerCase().trim());
		System.out.println(st.toUpperCase());
		
		int in =100;
		char[] ch ={'a','b','c'};
		String a = String.valueOf(ch)+1;
		System.out.println(a);
		
	}

}




















