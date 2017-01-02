package com.hb.pm;

import java.util.Scanner;

class Student{
	int kor, eng, math;
	public Student(int kor, int eng, int math) {
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
}

public class Ex04 {
	static Student[] stu=null;
	static Scanner sc;

	public static void main(String[] args) {
		// 학생성적관리프로그램 - 동적처리.
		sc = new Scanner(System.in);
		while(true){
		System.out.println("---------------------------------");
		System.out.println("1.입력\t2.보기\t0.종료");
		System.out.println("---------------------------------");
		int input = Integer.parseInt(sc.nextLine());
		if(input==1){
			System.out.println("add");
			insert();
		}else if(input==2){
			view();
		}else if(input==0){
			break;
		}
		}
	}
	public static void insert(){
		sc = new Scanner(System.in);
		if(stu==null){
			stu = new Student[1];
			System.out.print("국어:");
			int kor = Integer.parseInt(sc.nextLine());
			System.out.print("영어:");
			int eng = Integer.parseInt(sc.nextLine());
			System.out.print("수학:");
			int math = Integer.parseInt(sc.nextLine());
			stu[0]=new Student(kor,eng,math);
		}else{
			Student[] stu2 = new Student[stu.length+1];
			
			
			System.out.print("국어:");
			int kor = Integer.parseInt(sc.nextLine());
			System.out.print("영어:");
			int eng = Integer.parseInt(sc.nextLine());
			System.out.print("수학:");
			int math = Integer.parseInt(sc.nextLine());
			for(int i=0; i<stu.length; i++){
				stu2[i]=stu[i];
			}
			stu2[stu2.length-1]=new Student(kor,eng,math);
			stu = stu2;
		}
	}
	public static void view(){
		for(int i=0; i<stu.length; i++){
			System.out.println(stu[i].kor+"\t"+stu[i].eng+"\t"+stu[i].math);
		}
	}

}










