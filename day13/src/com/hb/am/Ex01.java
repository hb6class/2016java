package com.hb.am;

import java.util.Scanner;

public class Ex01 {

	final String ver;
	
	public Ex01() {
		ver = "2.0.0";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex01().title();
	}
	
	public void title(){
		System.out.println("-------------------------------");
		System.out.println("학생성적관리(v"+ver+")");
		System.out.println("-------------------------------");
		proStrt();
	}
	
	public void proStrt(){
		int no=0;	int sum=0;
		Scanner sc = new Scanner(System.in);
		String[] sub = {"학번","국어","영어","수학","총점","평균"};
		System.out.print("총학생의 수:");
		int tot = Integer.parseInt(sc.nextLine());
		int[][] stu = new int[tot][4];
		for(int a=0; a<stu.length; a++){
			stu[a][0]=++no;
			System.out.println(stu[a][0]+"학번 학생 정보입력");
			for(int i=1; i<stu[a].length; i++){
				System.out.print(sub[i]+">>");
				stu[a][i]= Integer.parseInt(sc.nextLine());
			}
		}
		for(int i=0; i<sub.length; i++){
			System.out.print(sub[i]);System.out.print("\t");
		}
		System.out.println();
		for(int m=0; m<stu.length; m++){
			sum=0;
			for(int n=0; n<stu[m].length; n++){
				if(n!=0){sum+=stu[m][n];}
				System.out.print(stu[m][n]);
				System.out.print("\t");
			}
			System.out.println(sum+"\t"+sum*100/3/100.0);
		}
	}
}












