package com.hb.pm;

public class Ex02 {

	public static void main(String[] args) {
		// 
		// char
//		Character ch = new Character('a');
//		System.out.println(Character.isDigit('+'));// 숫자인지 확인
//		System.out.println(Character.isLetter('한'));// 문자인지 확인
//		System.out.println(Character.isUpperCase('A'));// 대문자인지 확인
//		System.out.println(Character.isLowerCase('a'));// 소문자인지 확인
//		System.out.println(Character.isSpace(' '));// 공백인지 확인
//		System.out.println(Character.isDefined(' '));// 유니코드인지
		
		char[] ch = {'한','a',' ','A','+'};
		
		for(int i=0; i<ch.length; i++){
			System.out.println(ch[i]+"는");
			if(Character.isDefined(ch[i])){
				System.out.print("유니코드인 ");
			}
			if(Character.isUpperCase(ch[i])){
				System.out.print("대");
			}
			if(Character.isLowerCase(ch[i])){
				System.out.print("소");
			}
			if(Character.isLetter(ch[i])){
				System.out.println("문자입니다");
			}
			if(Character.isDigit(ch[i])){
				System.out.println("숫자입니다");
			}
			if(Character.isWhitespace(ch[i])){
				System.out.println("공백문자입니다");
			}
		}
	}

}













