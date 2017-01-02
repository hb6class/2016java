package com.hb.pm;

import java.util.Scanner;

public class Ex02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// book p166 ~ 180 
		// String no="901230-1837264" ; 주민번호를 다음처럼 입력받아
		//
		// Q1. 정확히 입력했는지 확인(자리수확인, - 입력확인)
		// Q2. 생년월일 출력
		// Q3. 성별을 확인하고 출력하시오(남:1,여:2 2000년 이후 남:3 여:4) 외국인:5
		// Q4. 미성년자 확인
		// Q5. 나이 출력
		// Q6. 정확히 입력했는지 확인(공백처리, 정확한 숫자입력확인)
		Scanner sc = new Scanner(System.in);
		String input=null;
		int cnt =0;
		boolean ck = false;
		while(cnt++<5){
			System.out.println("주민번호를 입력해주세요");
			System.out.println("\tex)901230-1837264");
			System.out.print(">>");
			input = sc.nextLine().trim();
			for(int i=0; i<input.length(); i++){
				if(i==6){continue;}
				switch (input.charAt(i)) {
					case '0': case '1': case '2': case '3': case '4': 
					case '5': case '6': case '7': case '8': case '9':
						if(i==0){ck=true;}else{ck = ck&&true;} break;
					default : ck=false;
				} 
			}
			if(ck&&input.length()==14&&input.charAt(6)=='-'){break;}
			System.out.println(cnt+"회 입력이 잘못되셨습니다");
			if(cnt==5){return;}
			System.out.println("확인후 재입력 바랍니다\t");
		}
		System.out.println("당신의 생년월일:");
		String[] st = {"년","월","일"};
		String[] st2 = {"","",""};
		for(int i=0; i<6; i++){
			st2[i/2]+=input.charAt(i);
		}
		for(int i=0; i<st2.length; i++){
			st2[i]+=st[i];
		}
		for(int i=0; i<st2.length; i++){
			System.out.print(st2[i]);
		}
		System.out.println();
		System.out.print("당신의 성별은 ");
		if(input.charAt(7)=='1'){
			System.out.print("남자");
		}else if(input.charAt(7)=='2'){
			System.out.print("여자");
		}else{
			System.out.print("외계인");
		}
		System.out.println("입니다");
		int age=0;
		// 2016-1900+90+1
		// 2016-2000+2+1 if(charAt(0)==0)
		// 2016-2000+12+1 if(charAt(0)==1)
		if(input.charAt(0)=='0'){
			age = 2016-(2000+(input.charAt(1)-'0'))+1;
		}else if(input.charAt(0)==1){
			age = 2016-(2000+10+(input.charAt(1)-'0'))+1;
		}else{
			age = 2016-(1900+(input.charAt(0)-'0')*10+(input.charAt(1)-'0'))+1;
		}
		System.out.println("당신의 나이는 "+age+"세 입니다");
		if(age<19){
			System.out.println("미성년자이시네요 담배,술 금지 입니다");
		}
	}

}














