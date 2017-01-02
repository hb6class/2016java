package com.hb.pm;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// 숫자입력을 입력 받아
		//00000000 ->00,000,000 - 7,2,3-1,6-1
		// 0000000 -> 0,000,000 - 6,2,3-2,6-2
		//  000000 ->   000,000 - 5,1,3-0
		//   00000 ->    00,000 - 4,1,3-1
		//    0000 ->     0,000 - 3,1,3-2
		//     000 ->       000 - 2,0
		//      00 ->        00 - 1,0
		//       0 ->         0 - 0,0
		Scanner sc = new Scanner(System.in);
		System.out.print(">>");
		String input = sc.nextLine();
		char[] ch = input.toCharArray();
		int cnt = ch.length/3-1;
		char[] ch2 = new char[ch.length+cnt];
		int a=ch.length-1;
		int temp=0;
		for(int i=ch2.length-1; i>=0; i--){
			temp++;
			if(temp!=1&&temp%3==1){
				ch2[i]=',';
			}else{
			ch2[i]=ch[a--];}
//			System.out.println(ch2[i]);
		}
		
		input= new String(ch2);
		System.out.println(input);
	}

}













