package com.hb.am;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// �����Է��� �Է� �޾�
		//00000000.000 ->00,000,000.000 - 7,2,3-1,6-1
		// 0000000.000 -> 0,000,000.000 - 6,2,3-2,6-2
		//  000000.000 ->   000,000.000 - 5,1,3-0
		//   00000.000 ->    00,000.000 - 4,1,3-1
		//    0000.000 ->     0,000.000 - 3,1,3-2
		//     000.000 ->       000.000 - 2,0
		//      00.000 ->        00.000 - 1,0
		//       0.000 ->         0.000 - 0,0
		Scanner sc = new Scanner(System.in);
		System.out.print("10���� ������ �Է����ּ���\n>>>");
		String input = sc.nextLine();

		int cnt1 = (input.length()-1)/3; //,���� 

		char[] ch = input.toCharArray();
		char[] ch2 = new char[ch.length+cnt1];

//		int cnt2=ch.length-1;// �Է¹��ڿ��� ������ �ε���
//		int cnt3=0; // �ݺ����� ���� Ƚ��
//		
//		for(int i=ch2.length-1; i>=0; i--){
//			cnt3++;
//			if(cnt3!=1&&cnt3%3==1){cnt3=0;ch2[i]=',';}
//			else{ch2[i]=ch[cnt2--];}
//		}
		///////////////////////////////////////
		int cnt3=0;	// ch�� �ε��� ����
		int cnt4=0;	// ,���� ���° ����
		for(int i=0; i<ch2.length; i++){
			if((ch.length>3&&(i==(ch.length-1)%3+1||cnt4==3))){
				ch2[i]=',';
				cnt4=0;
			}else{
				ch2[i]=ch[cnt3++];
				cnt4++;
			}
		}
		///////////////////////////////////////
		
		input = new String(ch2);
		System.out.println(input);
	}

}




















