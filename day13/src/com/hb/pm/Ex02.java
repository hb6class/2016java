package com.hb.pm;

import java.util.Scanner;

public class Ex02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// book p166 ~ 180 
		// String no="901230-1837264" ; �ֹι�ȣ�� ����ó�� �Է¹޾�
		//
		// Q1. ��Ȯ�� �Է��ߴ��� Ȯ��(�ڸ���Ȯ��, - �Է�Ȯ��)
		// Q2. ������� ���
		// Q3. ������ Ȯ���ϰ� ����Ͻÿ�(��:1,��:2 2000�� ���� ��:3 ��:4) �ܱ���:5
		// Q4. �̼����� Ȯ��
		// Q5. ���� ���
		// Q6. ��Ȯ�� �Է��ߴ��� Ȯ��(����ó��, ��Ȯ�� �����Է�Ȯ��)
		Scanner sc = new Scanner(System.in);
		String input=null;
		int cnt =0;
		boolean ck = false;
		while(cnt++<5){
			System.out.println("�ֹι�ȣ�� �Է����ּ���");
			System.out.println("\tex)901230-1837264");
			System.out.print(">>");
			input = sc.nextLine().trim();
			for(int i=0; i<input.length(); i++){
				if(i==6){continue;}
				switch (input.charAt(i)) {
					case '0': case '1': case '2': case '3': case '4': 
					case '5': case '6': case '7': case '8': case '9':
						if(i==0){ck=true;}else{ck = ck&&true;} break;
					default : ck=false;
				} 
			}
			if(ck&&input.length()==14&&input.charAt(6)=='-'){break;}
			System.out.println(cnt+"ȸ �Է��� �߸��Ǽ̽��ϴ�");
			if(cnt==5){return;}
			System.out.println("Ȯ���� ���Է� �ٶ��ϴ�\t");
		}
		System.out.println("����� �������:");
		String[] st = {"��","��","��"};
		String[] st2 = {"","",""};
		for(int i=0; i<6; i++){
			st2[i/2]+=input.charAt(i);
		}
		for(int i=0; i<st2.length; i++){
			st2[i]+=st[i];
		}
		for(int i=0; i<st2.length; i++){
			System.out.print(st2[i]);
		}
		System.out.println();
		System.out.print("����� ������ ");
		if(input.charAt(7)=='1'){
			System.out.print("����");
		}else if(input.charAt(7)=='2'){
			System.out.print("����");
		}else{
			System.out.print("�ܰ���");
		}
		System.out.println("�Դϴ�");
		int age=0;
		// 2016-1900+90+1
		// 2016-2000+2+1 if(charAt(0)==0)
		// 2016-2000+12+1 if(charAt(0)==1)
		if(input.charAt(0)=='0'){
			age = 2016-(2000+(input.charAt(1)-'0'))+1;
		}else if(input.charAt(0)==1){
			age = 2016-(2000+10+(input.charAt(1)-'0'))+1;
		}else{
			age = 2016-(1900+(input.charAt(0)-'0')*10+(input.charAt(1)-'0'))+1;
		}
		System.out.println("����� ���̴� "+age+"�� �Դϴ�");
		if(age<19){
			System.out.println("�̼������̽ó׿� ���,�� ���� �Դϴ�");
		}
	}

}














