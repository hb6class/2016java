package com.hb.pm;

public class Ex02 {

	public static void main(String[] args) {
		// 
		// char
//		Character ch = new Character('a');
//		System.out.println(Character.isDigit('+'));// �������� Ȯ��
//		System.out.println(Character.isLetter('��'));// �������� Ȯ��
//		System.out.println(Character.isUpperCase('A'));// �빮������ Ȯ��
//		System.out.println(Character.isLowerCase('a'));// �ҹ������� Ȯ��
//		System.out.println(Character.isSpace(' '));// �������� Ȯ��
//		System.out.println(Character.isDefined(' '));// �����ڵ�����
		
		char[] ch = {'��','a',' ','A','+'};
		
		for(int i=0; i<ch.length; i++){
			System.out.println(ch[i]+"��");
			if(Character.isDefined(ch[i])){
				System.out.print("�����ڵ��� ");
			}
			if(Character.isUpperCase(ch[i])){
				System.out.print("��");
			}
			if(Character.isLowerCase(ch[i])){
				System.out.print("��");
			}
			if(Character.isLetter(ch[i])){
				System.out.println("�����Դϴ�");
			}
			if(Character.isDigit(ch[i])){
				System.out.println("�����Դϴ�");
			}
			if(Character.isWhitespace(ch[i])){
				System.out.println("���鹮���Դϴ�");
			}
		}
	}

}













