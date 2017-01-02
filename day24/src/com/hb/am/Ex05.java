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
		System.out.print("������ �й�:");
		int temp = Integer.parseInt(sc.nextLine());
		int i=0;
		for(i=list.size()-1; i>=0; i--){
			Student stu = list.get(i);
			if(stu.num==temp)break;
		}
		if(i>=0){
			System.out.print("����:");
			int kor = Integer.parseInt(sc.nextLine());
			System.out.print("����:");
			int eng = Integer.parseInt(sc.nextLine());
			System.out.print("����:");
			int math = Integer.parseInt(sc.nextLine());
			
			list.set(i, new Student(temp,kor,eng,math));
		}else{
			System.out.println("�ش� �й��� �������� �ʽ��ϴ�");
		}
	}
	void listAll(){
		System.out.println("\n�����½���\n----------------------------");
		System.out.println("�й�\t����\t����\t����");
		System.out.println("----------------------------");
		for(Student stu : this.list){
			System.out.println(stu.num+"\t"+stu.kor
					+"\t"+stu.eng+"\t"+stu.math);
		}
		System.out.println("----------------------------\n\n");
	}
	void insert(){
		Student stu = new Student();
		System.out.println("�й�:"+num);
		stu.num = this.num++;
		System.out.print("����:");
		stu.kor = Integer.parseInt(sc.nextLine());
		System.out.print("����:");
		stu.eng = Integer.parseInt(sc.nextLine());
		System.out.print("����:");
		stu.math = Integer.parseInt(sc.nextLine());
		list.add(stu);
	}
	
	public void showMenu(){
		System.out.println("----------------------------------------------------");
		System.out.println("1.�Է�  2.����Ʈ  3.�󼼺���  4.����  5.����	0.����");
		System.out.println("----------------------------------------------------");
		System.out.print("����>>");
	}
}















