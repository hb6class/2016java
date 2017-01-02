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
	//"1.����Ʈ\t2.��\t3.����\t0.������"
	//"1.�Է�\t2.��ü\t3.��\t4.����\t0.������"
	String ver ="�л���������(v2.0.0)";

	public static void main(String[] args) {
		//////////////////////////////////////
		// �л� �������� ���α׷�(20��)
		// ����(kor) 80
		// ����(eng) 75
		// ����(math) 90
		// �̵��� �հ�(sum)�� ���ϰ� ���(avg)�� ���Ͻÿ�
		// ���� ����(result)�� �����ϼ���
		// ���� = ���
		// >=90 A����
		// >=80 B����
		// >=70 C����
		// >=60 D����
		// 60�̸� F����(����) ����� �����ϼ���
		///////////////////////////////////////
		Scanner sc = new Scanner(System.in);
		System.out.print("���л� ���� ���:");
		int su = Integer.parseInt(sc.nextLine());
		Student[] stus = new Student[su];
		int kor, eng, math;
		int num = 1600;
		for(int i=0; i<stus.length; i++){
			System.out.println("---�й� "+(num+i)+"�� �л��� ����----");
			System.out.print("����:");
			kor = Integer.parseInt(sc.nextLine());
			System.out.print("����:");
			eng = Integer.parseInt(sc.nextLine());
			System.out.print("����:");
			math = Integer.parseInt(sc.nextLine());
			stus[i] = new Student(num+i,kor,eng,math);
		}
		
		////////�޴�//////////
		int input = 0;
		while(true){
			System.out.println("\n\n\n=============================================");
			System.out.println("1.����Ʈ\t2.��\t3.����\t0.������");
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
				System.out.println("�Է��� Ȯ���Ͻð� �ٽ� �Է��ϼ���");
			}
		} // while end
		System.out.println("�̿����ּż� �����մϴ�");
		
	} // main end
	static void listAll(Student[] stus){
		System.out.println("�й�\t����\t����\t����\t�հ�");
		for(int i=0; i<stus.length; i++){
			Student stu = stus[i];
			System.out.println(stu.num+"\t"+stu.kor+"\t"
								+stu.eng+"\t"+stu.math+"\t"+stu.sum());
		}
	}
	static void listOne(Scanner sc, Student[] stus){
		System.out.print("�й�:");
		int idx=Integer.parseInt(sc.nextLine())-1600;
		Student stu = stus[idx];
		System.out.print("�й�");
		System.out.println(stu.num+"�� �л� ����");
		System.out.println("����\t����\t����");
		System.out.println(stu.kor+"\t"+stu.eng+"\t"+stu.math+"\n");
		System.out.println("�հ�:"+stu.sum());
		System.out.println("���:"+stu.avg());
	}
	
}












