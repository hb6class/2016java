package com.hb.pm;

import java.util.Scanner;

public class Ex03 {
	static final String bar="----------------------------------------------";
	static String[] prn={"����Ͻ� ���̵�:","�н�����:","�������:"};
	public static void main(String[] args) {
		// p236 ~ p264
		// Q1.
		//  ȸ������
		//	"ȸ������������"
		//	����Ͻ� ���̵�:(��, Ư������ ���Ұ� - 1~127)
		//	�н����� : (8���̻�, ù���ڴ� ����, �� �� ���� ����)
		//	�������:991231(char 0~9)
		//	ȸ�����ԵǼ̽��ϴ�.
		//	���н� �ٽ� ���Է�
		Scanner sc = new Scanner(System.in);
		boolean[] result =null;
		String[] input = new String[3];
		System.out.println(bar);
		System.out.println("ȸ������������");
		System.out.println(bar);
		while(true){
			result =new boolean[]{false, false, false};
			System.out.print(prn[0]);
			input[0]=sc.nextLine();
			char[] ch1 = input[0].toCharArray();
			for(int i=0; i<ch1.length; i++){
				char temp = ch1[i];
				if(Character.isDigit(temp)
						||Character.isUpperCase(temp)
						||Character.isLowerCase(temp)){
				}else{
					break;
				}
				result[0]=true;
			}
			System.out.print(prn[1]);
			input[1]=sc.nextLine();
			if(input[1].length()>7&&Character.isLetter(input[1].charAt(0))){
				boolean[] two ={false, false, false};
				for(int i=0; i<input[1].length(); i++){
					if(Character.isDigit(input[1].charAt(i))){
						two[2]=true;//���ڰ˻�
					}
					if(Character.isUpperCase(input[1].charAt(i))){
						two[0]=true;// �빮�ڰ˻�
					}
					if(Character.isLowerCase(input[1].charAt(i))){
						two[1]=true;// �ҹ��� �˻�
					}
					System.out.println(two[0]+":"+two[1]+":"+two[2]);
				}
				if(two[0]&&two[1]&&two[2]){
					result[1]=true;
				}
			}
			System.out.print(prn[2]);
			input[2]=sc.nextLine();
			ch1 = input[2].toCharArray();
			if(ch1.length==6){
				result[2]=true;
			}
			for(int i=0; i<ch1.length; i++){
				if(!(Character.isDigit(ch1[i]))){
					result[2]=false;
					break;
				}
			}
			if(result[0]&&result[1]&&result[2]){break;}
			if(!result[0]){
				System.out.println("���̵� �Է��� Ȯ���ϼ���");
			}
			if(!result[1]){
				System.out.println("�н����� �Է��� Ȯ���ϼ���");
			}
			if(!result[2]){
				System.out.println("������� �Է��� Ȯ���ϼ���");
			}
		}
			System.out.println("ȸ�����ԵǼ̽��ϴ�");
	}

}














