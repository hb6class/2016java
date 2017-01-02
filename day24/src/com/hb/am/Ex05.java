package com.hb.am;

import java.util.ArrayList;
import java.util.Scanner;

class Student{
	int num, kor, eng, math;
	public Student() {
	}
	public Student(int num, int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.num = num;
	}
	public int sum(){
		return kor+eng+math;
	}
}

public class Ex05 {
	ArrayList<Student> list;
	Scanner sc;
	int num;
	
	public Ex05() {
		list = new ArrayList<Student>();
		sc = new Scanner(System.in);
		num=1;
	}

	public static void main(String[] args) {
		new Ex05().startProgram();
	}
	
	void startProgram(){
		int input=0;
		while(true){
			showMenu();
			input = Integer.parseInt(sc.nextLine());
			if(input==0)break;
			else if(input==1)insert();
			else if(input==2)listAll();
			else if(input==4)editOne();
		}
	}
	void editOne(){
		System.out.print("수정할 학번:");
		int temp = Integer.parseInt(sc.nextLine());
		int i=0;
		for(i=list.size()-1; i>=0; i--){
			Student stu = list.get(i);
			if(stu.num==temp)break;
		}
		if(i>=0){
			System.out.print("국어:");
			int kor = Integer.parseInt(sc.nextLine());
			System.out.print("영어:");
			int eng = Integer.parseInt(sc.nextLine());
			System.out.print("수학:");
			int math = Integer.parseInt(sc.nextLine());
			
			list.set(i, new Student(temp,kor,eng,math));
		}else{
			System.out.println("해당 학번은 존재하지 않습니다");
		}
	}
	void listAll(){
		System.out.println("\n목록출력시작\n----------------------------");
		System.out.println("학번\t국어\t영어\t수학");
		System.out.println("----------------------------");
		for(Student stu : this.list){
			System.out.println(stu.num+"\t"+stu.kor
					+"\t"+stu.eng+"\t"+stu.math);
		}
		System.out.println("----------------------------\n\n");
	}
	void insert(){
		Student stu = new Student();
		System.out.println("학번:"+num);
		stu.num = this.num++;
		System.out.print("국어:");
		stu.kor = Integer.parseInt(sc.nextLine());
		System.out.print("영어:");
		stu.eng = Integer.parseInt(sc.nextLine());
		System.out.print("수학:");
		stu.math = Integer.parseInt(sc.nextLine());
		list.add(stu);
	}
	
	public void showMenu(){
		System.out.println("----------------------------------------------------");
		System.out.println("1.입력  2.리스트  3.상세보기  4.수정  5.삭제	0.종료");
		System.out.println("----------------------------------------------------");
		System.out.print("선택>>");
	}
}















