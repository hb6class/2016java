package com.hb.am;

import java.util.Scanner;

public class Ex05 {
	int water=0;
	int sugar=0;
	String title="���������ý���";
	String ver="(v1.1.5)";
	String menu="------------------------------------------\n1.�԰� 	2.���	3.���� ���ɷ�(capa) 4.������� 0.����\n------------------------------------------";

	public static void main(String[] args) {
		// ���������ý���(���̽�ũ�� ����)
		// ���� ��� - ��,����
		// ���̽�ũ�� 1box �� - �� 3����, ���� 2�׷�
		// 1.�԰� 	2.���	3.���� ���ɷ�(capa) 4. ����

		Ex05 me = new Ex05();
		me.title();
		me.start();
		me.end();
	}
	
	public void start(){
		Scanner sc = new Scanner(System.in);
		String tmp;
		int input, in1, in2;
		while(true){
			System.out.println(menu);
			System.out.print(">>>");
			tmp = sc.nextLine();
			input = Integer.parseInt(tmp);
			if(input==0){
				break;
			}else if(input==1){
				System.out.print("�� �԰�(L):");
				tmp = sc.nextLine();
				in1 = Integer.parseInt(tmp);
				water+=in1;
				System.out.print("���� �԰�(g):");
				tmp = sc.nextLine();
				in2 = Integer.parseInt(tmp);
				sugar+=in2;
			}else if(input==2){
				System.out.print("�� ���(max:"+water+"):");
				tmp = sc.nextLine();
				in1 = Integer.parseInt(tmp);
				if(in1<=water){
					water-=in1;
				}else{
					System.out.println("����� �ٽ� Ȯ���ϼ���");
					continue;
				}
				System.out.print("���� ���(max:"+sugar+"):");
				tmp = sc.nextLine();
				in2 = Integer.parseInt(tmp);
				if(in2<=sugar){
					sugar-=in2;
				}else{
					System.out.println("����� �ٽ� Ȯ���ϼ���");
					continue;
				}
			}else if(input==3){// ���̽�ũ�� 1box �� - �� 3����, ���� 2�׷�
				System.out.println();
				if(water/3<sugar/2){
					System.out.println("���갡�� ����:"+water/3);
				}else{
					System.out.println("���갡�� ����:"+sugar/2);
				}
			}else if(input==4){
				System.out.println();
				System.out.print("���귮(ea):");
				tmp = sc.nextLine();
				in1 = Integer.parseInt(tmp);
				water-=in1*3;
				sugar-=in1*2;
			}else{
				System.out.println("�޴��� �ٽ� Ȯ���Ͻð� �����ϼ���");
			}
			System.out.println("\n\n");
		}	// while end
	} // start end
	
	public void end(){
		System.out.print("�̿����ּż� �����մϴ�");
	}
	public void title(){
		System.out.print(title);
		System.out.println(ver);
	}
	
}
