package com.hb.pm;

import java.util.*;

class Student{
	int num, kor, eng, math;
	String name;
	Student(int num, int kor, int eng, int math){
		this.num = num;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int sum(){
		return kor+eng+math;
	}
	double avg(){
		return sum()*100/3/100.0;
	}
}


public class Ex05 {
	//"1.리스트\t2.상세\t3.수정\t0.끝내기"
	//"1.입력\t2.전체\t3.상세\t4.수정\t0.끝내기"
	String ver ="학생성적관리(v2.0.0)";

	public static void main(String[] args) {
		//////////////////////////////////////
		// 학생 성적관리 프로그램(20명)
		// 국어(kor) 80
		// 영어(eng) 75
		// 수학(math) 90
		// 이들의 합계(sum)를 구하고 평균(avg)을 구하시오
		// 또한 학점(result)을 산출하세요
		// 학점 = 평균
		// >=90 A학점
		// >=80 B학점
		// >=70 C학점
		// >=60 D학점
		// 60미만 F학점(과락) 재시험 응시하세요
		///////////////////////////////////////
		Scanner sc = new Scanner(System.in);
		System.out.print("총학생 수는 몇명:");
		int su = Integer.parseInt(sc.nextLine());
		Student[] stus = new Student[su];
		int kor, eng, math;
		int num = 1600;
		for(int i=0; i<stus.length; i++){
			System.out.println("---학번 "+(num+i)+"번 학생의 점수----");
			System.out.print("국어:");
			kor = Integer.parseInt(sc.nextLine());
			System.out.print("영어:");
			eng = Integer.parseInt(sc.nextLine());
			System.out.print("수학:");
			math = Integer.parseInt(sc.nextLine());
			stus[i] = new Student(num+i,kor,eng,math);
		}
		
		////////메뉴//////////
		int input = 0;
		while(true){
			System.out.println("\n\n\n=============================================");
			System.out.println("1.리스트\t2.상세\t3.수정\t0.끝내기");
			System.out.println("=============================================");
			System.out.print(">>>");
			input = Integer.parseInt(sc.nextLine());
			if(input==0){
				break;
			}else if(input==1){
				listAll(stus);
			}else if(input==2){
				listOne(sc,stus);
			}else{
				System.out.println("입력을 확인하시고 다시 입력하세요");
			}
		} // while end
		System.out.println("이용해주셔서 감사합니다");
		
	} // main end
	static void listAll(Student[] stus){
		System.out.println("학번\t국어\t영어\t수학\t합계");
		for(int i=0; i<stus.length; i++){
			Student stu = stus[i];
			System.out.println(stu.num+"\t"+stu.kor+"\t"
								+stu.eng+"\t"+stu.math+"\t"+stu.sum());
		}
	}
	static void listOne(Scanner sc, Student[] stus){
		System.out.print("학번:");
		int idx=Integer.parseInt(sc.nextLine())-1600;
		Student stu = stus[idx];
		System.out.print("학번");
		System.out.println(stu.num+"번 학생 성적");
		System.out.println("국어\t영어\t수학");
		System.out.println(stu.kor+"\t"+stu.eng+"\t"+stu.math+"\n");
		System.out.println("합계:"+stu.sum());
		System.out.println("평균:"+stu.avg());
	}
	
}












