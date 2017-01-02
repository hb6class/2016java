package com.hb.am;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex03 {
	Scanner sc;
	ArrayList list;
	int num;

	public Ex03() {
		sc = new Scanner(System.in);
		list = new ArrayList();
		num=201600;
	}
	
	public static void main(String[] args) {
		new Ex03().programStart();

	}
	public void showMenu(){
		System.out.println("----------------------------------------------------");
		System.out.println("1.�Է�  2.����Ʈ  3.�󼼺���  4.����  5.����	0.����");
		System.out.println("----------------------------------------------------");
		System.out.print("����>>");
	}
	public void insert(){
		// list.add(map)
		int num = this.num++;
		System.out.println(num+"�й��л� �����Է�");
		System.out.print("�����:");
		int kor = Integer.parseInt(sc.nextLine());
		System.out.print("�����:");
		int eng = Integer.parseInt(sc.nextLine());
		System.out.print("���м���:");
		int math = Integer.parseInt(sc.nextLine());
		HashMap stu  = new HashMap();
		stu.put("num", num);
		stu.put("kor", kor);
		stu.put("eng", eng);
		stu.put("math", math);
		list.add(stu);
	}
	
	public void listAll(){
		System.out.println("\n\n-----<����Ʈ���>-----");
		System.out.println("�й�\t����\t����\t����");
		System.out.println("---------------------------------");
		for(int i=0; i<list.size(); i++){
			HashMap stu = (HashMap)list.get(i);
			System.out.println(stu.get("num")+"\t"+stu.get("kor")
					+"\t"+stu.get("eng")+"\t"+stu.get("math"));
		}
		System.out.println("-----< ������� >-----\n\n");
	}
	
	public void programStart(){
		int input=0;
		while(true){
			showMenu();
			input = Integer.parseInt(sc.nextLine());
			if(input==0)break;
			if(input==1)insert();
			if(input==2)listAll();
			
		}
		
		
	}
}















