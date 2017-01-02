package com.hb.pm;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Ex01 me = new Ex01();
		while(true){
			System.out.println("----------------------------");
			System.out.println("1.보기 2.입력 3.수정 4.삭제");
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
		System.out.println("리스트목록");
		System.out.println("게시글1");
		System.out.println("게시글2");
		System.out.println("게시글3");
	}
	public void listAdd(){
		System.out.println("게시글4");
	}
	public void listEdit(){
		System.out.println("게시글4수정");
	}
	public void listDel(){
		System.out.println("4글 삭제");
	}
}
