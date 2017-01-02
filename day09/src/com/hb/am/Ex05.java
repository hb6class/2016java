package com.hb.am;

import java.util.Scanner;

public class Ex05 {
	int water=0;
	int sugar=0;
	String title="자제관리시스템";
	String ver="(v1.1.5)";
	String menu="------------------------------------------\n1.입고 	2.출고	3.생산 가능량(capa) 4.생산출고 0.종료\n------------------------------------------";

	public static void main(String[] args) {
		// 자제관리시스템(아이스크림 공장)
		// 관리 대상 - 물,설탕
		// 아이스크림 1box 당 - 물 3리터, 설탕 2그램
		// 1.입고 	2.출고	3.생산 가능량(capa) 4. 종료

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
				System.out.print("물 입고량(L):");
				tmp = sc.nextLine();
				in1 = Integer.parseInt(tmp);
				water+=in1;
				System.out.print("설탕 입고량(g):");
				tmp = sc.nextLine();
				in2 = Integer.parseInt(tmp);
				sugar+=in2;
			}else if(input==2){
				System.out.print("물 출고량(max:"+water+"):");
				tmp = sc.nextLine();
				in1 = Integer.parseInt(tmp);
				if(in1<=water){
					water-=in1;
				}else{
					System.out.println("출고량을 다시 확인하세요");
					continue;
				}
				System.out.print("설탕 출고량(max:"+sugar+"):");
				tmp = sc.nextLine();
				in2 = Integer.parseInt(tmp);
				if(in2<=sugar){
					sugar-=in2;
				}else{
					System.out.println("출고량을 다시 확인하세요");
					continue;
				}
			}else if(input==3){// 아이스크림 1box 당 - 물 3리터, 설탕 2그램
				System.out.println();
				if(water/3<sugar/2){
					System.out.println("생산가능 갯수:"+water/3);
				}else{
					System.out.println("생산가능 갯수:"+sugar/2);
				}
			}else if(input==4){
				System.out.println();
				System.out.print("생산량(ea):");
				tmp = sc.nextLine();
				in1 = Integer.parseInt(tmp);
				water-=in1*3;
				sugar-=in1*2;
			}else{
				System.out.println("메뉴를 다시 확인하시고 선택하세요");
			}
			System.out.println("\n\n");
		}	// while end
	} // start end
	
	public void end(){
		System.out.print("이용해주셔서 감사합니다");
	}
	public void title(){
		System.out.print(title);
		System.out.println(ver);
	}
	
}
