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
		System.out.println("1.입력  2.리스트  3.상세보기  4.수정  5.삭제	0.종료");
		System.out.println("----------------------------------------------------");
		System.out.print("선택>>");
	}
	public void insert(){
		// list.add(map)
		int num = this.num++;
		System.out.println(num+"학번학생 성적입력");
		System.out.print("국어성적:");
		int kor = Integer.parseInt(sc.nextLine());
		System.out.print("영어성적:");
		int eng = Integer.parseInt(sc.nextLine());
		System.out.print("수학성적:");
		int math = Integer.parseInt(sc.nextLine());
		HashMap stu  = new HashMap();
		stu.put("num", num);
		stu.put("kor", kor);
		stu.put("eng", eng);
		stu.put("math", math);
		list.add(stu);
	}
	
	public void listAll(){
		System.out.println("\n\n-----<리스트출력>-----");
		System.out.println("학번\t국어\t영어\t수학");
		System.out.println("---------------------------------");
		for(int i=0; i<list.size(); i++){
			HashMap stu = (HashMap)list.get(i);
			System.out.println(stu.get("num")+"\t"+stu.get("kor")
					+"\t"+stu.get("eng")+"\t"+stu.get("math"));
		}
		System.out.println("-----< 출력종료 >-----\n\n");
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















