package com.hb.am;

import java.util.Scanner;

public class Ex04 {
	Student[] stus=null;

	class Student{
		int num, kor, eng, math;
	}

	public static void main(String[] args) {
		// �л� �������� ���α׷� (ver 3.0.0);
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
				default:	System.out.println("�޴��� Ȯ���Ͻð� �����ϼ���");
							break;
				}	// switch end
		}	//while end
		System.out.println("�̿��� �ּż� �����մϴ�");
	}	// programRun() end
	public void add(Scanner sc){
		if(stus==null){
			stus=new Student[1];
			stus[0]= new Student();
			stus[0].num=1;
			System.out.print("��������:");
			stus[0].kor=Integer.parseInt(sc.nextLine());
			System.out.print("��������:");
			stus[0].eng=Integer.parseInt(sc.nextLine());
			System.out.print("��������:");
			stus[0].math=Integer.parseInt(sc.nextLine());
		}else{
			Student[] temp = stus;
			stus=new Student[temp.length+1];
			for(int i=0; i<temp.length;i++){
				stus[i]=temp[i];
			}
			stus[temp.length] = new Student();
			stus[temp.length].num=stus.length;
			System.out.print("��������:");
			stus[temp.length].kor=Integer.parseInt(sc.nextLine());
			System.out.print("��������:");
			stus[temp.length].eng=Integer.parseInt(sc.nextLine());
			System.out.print("��������:");
			stus[temp.length].math=Integer.parseInt(sc.nextLine());
		}
	}
	public void list(){
		if(stus==null){
			System.out.println("�����Ͱ� �����ϴ�");
			return;
		}
		System.out.println("\n\n----------------------------------");
		System.out.println("�й�\t����\t����\t����");
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
		System.out.println("1.�Է�\t\t2.����\t\t3.�󼼺���\t0.����");
		System.out.println("=======================================================");
	}	// menu end
}	// class end




















