package com.hb.pm;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Ex01 me = new Ex01();
		while(true){
			System.out.println("----------------------------");
			System.out.println("1.���� 2.�Է� 3.���� 4.����");
			System.out.println("----------------------------");
			System.out.print(">>>");
			switch (Integer.parseInt(sc.nextLine())) {
			case 1:
				me.listView();
				break;
			case 2:
				me.listAdd();
				break;
			case 3:
				me.listEdit();
				break;
			case 4:
				me.listDel();
				break;

			default:
				break;
			}
		}
	}
	
	public void listView(){
		System.out.println("����Ʈ���");
		System.out.println("�Խñ�1");
		System.out.println("�Խñ�2");
		System.out.println("�Խñ�3");
	}
	public void listAdd(){
		System.out.println("�Խñ�4");
	}
	public void listEdit(){
		System.out.println("�Խñ�4����");
	}
	public void listDel(){
		System.out.println("4�� ����");
	}
}
