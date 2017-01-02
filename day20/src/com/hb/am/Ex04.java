package com.hb.am;

import java.util.Scanner;

public class Ex04 {
	Student[] stus=null;

	class Student{
		int num, kor, eng, math;
	}

	public static void main(String[] args) {
		// 학생 성적관리 프로그램 (ver 3.0.0);
		new Ex04().programRun();
	}
	
	public void programRun(){
		System.out.println("program start");
		Scanner sc = new Scanner(System.in);
		while(true){
				menu();
				System.out.print(">>");
				String menu = sc.nextLine();
				if(menu.equals("0")){break;}
				switch (menu) {
				case "1":	add(sc);		break;
				case "2":	list();		break;
				case "3":	detail();	break;
				default:	System.out.println("메뉴를 확인하시고 선택하세요");
							break;
				}	// switch end
		}	//while end
		System.out.println("이용해 주셔서 감사합니다");
	}	// programRun() end
	public void add(Scanner sc){
		if(stus==null){
			stus=new Student[1];
			stus[0]= new Student();
			stus[0].num=1;
			System.out.print("국어점수:");
			stus[0].kor=Integer.parseInt(sc.nextLine());
			System.out.print("영어점수:");
			stus[0].eng=Integer.parseInt(sc.nextLine());
			System.out.print("수학점수:");
			stus[0].math=Integer.parseInt(sc.nextLine());
		}else{
			Student[] temp = stus;
			stus=new Student[temp.length+1];
			for(int i=0; i<temp.length;i++){
				stus[i]=temp[i];
			}
			stus[temp.length] = new Student();
			stus[temp.length].num=stus.length;
			System.out.print("국어점수:");
			stus[temp.length].kor=Integer.parseInt(sc.nextLine());
			System.out.print("영어점수:");
			stus[temp.length].eng=Integer.parseInt(sc.nextLine());
			System.out.print("수학점수:");
			stus[temp.length].math=Integer.parseInt(sc.nextLine());
		}
	}
	public void list(){
		if(stus==null){
			System.out.println("데이터가 없습니다");
			return;
		}
		System.out.println("\n\n----------------------------------");
		System.out.println("학번\t국어\t영어\t수학");
		System.out.println("----------------------------------");
		for(int i=0; i<stus.length; i++){
			Student stu = stus[i];
			System.out.println(stu.num+"\t"+stu.kor+"\t"+stu.eng+"\t"+stu.math);
			System.out.println("----------------------------------");
		}
	}
	public void detail(){}
	public void menu(){
		System.out.println("=======================================================");
		System.out.println("1.입력\t\t2.보기\t\t3.상세보기\t0.종료");
		System.out.println("=======================================================");
	}	// menu end
}	// class end




















