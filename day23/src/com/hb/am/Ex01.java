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
		// 성적관리프로그램 ver 4.0.0
		// ArrayList use
		// 1. 입력 2. 보기 3. 상세보기 4. 수정 5. 삭제	0.종료
		System.out.println("성적관리프로그램 " +VER);
		new Ex01().programRun();
	}
	public void showMenu(){
		System.out.println("----------------------------------------------------");
		System.out.println("1.입력  2.리스트  3.상세보기  4.수정  5.삭제	0.종료");
		System.out.println("----------------------------------------------------");
		System.out.print("선택>>");
	}
	public void add(Scanner sc){
		int num = 201600+list.size();
		System.out.println(num+"학번 학생 데이터 입력");
		System.out.print("국어점수:");
		int kor = Integer.parseInt(sc.nextLine());
		System.out.print("영어점수:");
		int eng = Integer.parseInt(sc.nextLine());
		System.out.print("수학점수:");
		int math = Integer.parseInt(sc.nextLine());
		list.add(new Student(num,kor,eng,math));
	}
	public void listAll(){
		System.out.println("\n목록출력시작\n----------------------------");
		System.out.println("학번\t국어\t영어\t수학");
		System.out.println("----------------------------");
		for(int i=0; i<list.size(); i++){
			Student stu = (Student)list.get(i);
			System.out.println(stu.num+"\t"+stu.kor+"\t"+stu.eng+"\t"+stu.math);
		}
		System.out.println("----------------------------");
		System.out.println("목록출력끝\n\n\n");
	}
	public void listOne(Scanner sc){
		int input = 0;
		int idx = 0;
		while(true){
			System.out.print("\n학번선택:");
			try{
				input = Integer.parseInt(sc.nextLine());
			}catch(NumberFormatException e){
				System.out.println("학번을 숫자로 입력해주세요");
				continue;
			}
			idx = input-201600;
			if(idx>=0){
				
				break;
			}
			System.out.println("학번을 확인하시고 다시 입력하세요");
		}
		Student stu = (Student)list.get(idx);
		System.out.println("---------------------------");
		System.out.println("학번:"+stu.num);
		System.out.println("---------------------------");
		System.out.println("국어:"+stu.kor);
		System.out.println("영어:"+stu.eng);
		System.out.println("수학:"+stu.math);
		System.out.println("---------------------------");
		System.out.println("합계:"+stu.sum());
		System.out.println("평균:"+stu.sum()*100/3/100.0);
		System.out.println("---------------------------");
	}
	public void edit(){
		System.out.println("한명만수정");
	}
	public void del(){
		System.out.println("한명삭제");
	}
	
	public void programRun(){
		Scanner sc = new Scanner(System.in);
		int input = 0;
		while(true){
			showMenu();
			try{
				input = Integer.parseInt(sc.nextLine());
			}catch(NumberFormatException e){
				System.out.println("입력의 범위는 0~5사이 입니다");
				continue;
			}
			if(input==0)break;
			else if(input==1)add(sc);
			else if(input==2)listAll();
			else if(input==3)listOne(sc);
			else if(input==4)edit();
			else if(input==5)del();
			else {
				System.out.println("아직 준비중인 기능입니다");
			}
			
			
		}
		System.out.println("\n\n\n이용해주셔서 감사합니다");
		System.out.println("...");
	}

}























