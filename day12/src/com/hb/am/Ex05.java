package com.hb.am;

public class Ex05 {

	public static void main(String[] args) {
		// �л�1 - ����:70 ����:75 ����:70
		// �л�2 - ����:80 ����:85 ����:84
		// �л�3 - ����:90 ����:55 ����:60
		
		System.out.println("-------------------------------");
		System.out.println("�л���������(v1.2.0)");
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
		System.out.println("����\t����\t����\t����\t���\t����");
		for(int m=0; m<sungjuck.length; m++){
			int[] stu = sungjuck[m];// - �Ѹ��� �л� ����
			int sum =0;
			for(int n=0; n<stu.length; n++){
				sum+=stu[n];
				System.out.print(stu[n]+"\t");
				
			}
			System.out.println(sum+"\t"+sum*100/stu.length/100.0);
		}

	}

}
