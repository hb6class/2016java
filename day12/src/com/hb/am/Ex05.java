package com.hb.am;

public class Ex05 {

	public static void main(String[] args) {
		// 학생1 - 국어:70 영어:75 수학:70
		// 학생2 - 국어:80 영어:85 수학:84
		// 학생3 - 국어:90 영어:55 수학:60
		
		System.out.println("-------------------------------");
		System.out.println("학생성적관리(v1.2.0)");
		System.out.println("-------------------------------");
//		int[][] sungjuck = new int[3][3];
////		sungjuck[0][0]=70;
////		sungjuck[0][1]=75;
////		sungjuck[0][2]=70;
////		int[] stu2= sungjuck[1];
////		stu2[0]=80;
////		stu2[1]=85;
////		stu2[2]=84;
////		int[] stu3 = {90, 55, 60};
////		sungjuck[2] = stu3;
//		sungjuck[0] = new int[]{70,75,70};
//		sungjuck[1] = new int[]{80,85,84};
//		sungjuck[2] = new int[]{90, 55, 60};
		int[][] sungjuck = {
							{70,75,70},
							{80,85,84},
							{90,55,60}
							};
		
//		stu3[1]=65;
		System.out.println("국어\t영어\t수학\t총점\t평균\t학점");
		for(int m=0; m<sungjuck.length; m++){
			int[] stu = sungjuck[m];// - 한명의 학생 성적
			int sum =0;
			for(int n=0; n<stu.length; n++){
				sum+=stu[n];
				System.out.print(stu[n]+"\t");
				
			}
			System.out.println(sum+"\t"+sum*100/stu.length/100.0);
		}

	}

}
