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


public class Ex01 {
	final static String VER="4.0.0";
	ArrayList list;
	
	public Ex01() {
		list = new ArrayList();
	}

	public static void main(String[] args) {
		// �����������α׷� ver 4.0.0
		// ArrayList use
		// 1. �Է� 2. ���� 3. �󼼺��� 4. ���� 5. ����	0.����
		System.out.println("�����������α׷� " +VER);
		new Ex01().programRun();
	}
	public void showMenu(){
		System.out.println("----------------------------------------------------");
		System.out.println("1.�Է�  2.����Ʈ  3.�󼼺���  4.����  5.����	0.����");
		System.out.println("----------------------------------------------------");
		System.out.print("����>>");
	}
	public void add(Scanner sc){
		int num = 201600+list.size();
		System.out.println(num+"�й� �л� ������ �Է�");
		System.out.print("��������:");
		int kor = Integer.parseInt(sc.nextLine());
		System.out.print("��������:");
		int eng = Integer.parseInt(sc.nextLine());
		System.out.print("��������:");
		int math = Integer.parseInt(sc.nextLine());
		list.add(new Student(num,kor,eng,math));
	}
	public void listAll(){
		System.out.println("\n�����½���\n----------------------------");
		System.out.println("�й�\t����\t����\t����");
		System.out.println("----------------------------");
		for(int i=0; i<list.size(); i++){
			Student stu = (Student)list.get(i);
			System.out.println(stu.num+"\t"+stu.kor+"\t"+stu.eng+"\t"+stu.math);
		}
		System.out.println("----------------------------");
		System.out.println("�����³�\n\n\n");
	}
	public void listOne(Scanner sc){
		int input = 0;
		int idx = 0;
		while(true){
			System.out.print("\n�й�����:");
			try{
				input = Integer.parseInt(sc.nextLine());
			}catch(NumberFormatException e){
				System.out.println("�й��� ���ڷ� �Է����ּ���");
				continue;
			}
			idx = input-201600;
			if(idx>=0){
				
				break;
			}
			System.out.println("�й��� Ȯ���Ͻð� �ٽ� �Է��ϼ���");
		}
		Student stu = (Student)list.get(idx);
		System.out.println("---------------------------");
		System.out.println("�й�:"+stu.num);
		System.out.println("---------------------------");
		System.out.println("����:"+stu.kor);
		System.out.println("����:"+stu.eng);
		System.out.println("����:"+stu.math);
		System.out.println("---------------------------");
		System.out.println("�հ�:"+stu.sum());
		System.out.println("���:"+stu.sum()*100/3/100.0);
		System.out.println("---------------------------");
	}
	public void edit(){
		System.out.println("�Ѹ�����");
	}
	public void del(){
		System.out.println("�Ѹ����");
	}
	
	public void programRun(){
		Scanner sc = new Scanner(System.in);
		int input = 0;
		while(true){
			showMenu();
			try{
				input = Integer.parseInt(sc.nextLine());
			}catch(NumberFormatException e){
				System.out.println("�Է��� ������ 0~5���� �Դϴ�");
				continue;
			}
			if(input==0)break;
			else if(input==1)add(sc);
			else if(input==2)listAll();
			else if(input==3)listOne(sc);
			else if(input==4)edit();
			else if(input==5)del();
			else {
				System.out.println("���� �غ����� ����Դϴ�");
			}
			
			
		}
		System.out.println("\n\n\n�̿����ּż� �����մϴ�");
		System.out.println("...");
	}

}























