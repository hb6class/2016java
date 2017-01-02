package com.hb.am;

public class Ex02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//////////////////////////////////////
		// 학생 성적관리 프로그램
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
		int kor, eng, math;
		
		int sum;
		double avg;
		char result='F';
		
		kor = Integer.parseInt(args[0]);
		eng = Integer.parseInt(args[1]);
		math = Integer.parseInt(args[2]);
		
		System.out.println("국어:"+kor);
		System.out.println("영어:"+eng);
		System.out.println("수학:"+math);
		
		sum = kor + eng + math;
		System.out.print("합계:"+sum);
		avg = sum*100/3/100.0;	// 소수 둘째자리까지
		System.out.println(", 평균:"+avg);
		
//		if(avg>=90){
//			result='A';
//		}
//		if(avg<90 && avg>=80){
//			result='B';
//		}
//		if(avg<80 && avg>=70){
//			result='C';
//		}
//		if(avg<70 && avg>=60){
//			result='D';
//		}
//		if(avg>=90){
//			result='A';
//		}else if(avg>=80){
//			result='B';
//		}else if(avg>=70){
//			result='C';
//		}else if(avg>=60){
//			result='D';
//		}
		////////////////////////////////
		//switch문
		//
		//	switch(값){
		//		case 값:
		//			break;
		//		case 값:
		//			break;
		//		case 값:
		//			break;
		//      default:
		//	}
		////////////////////////////////
		
		switch((int)(avg/10)){
			case 10:
			case 9:
				result='A';
				break;
			case 8:
				result='B';
				break;
			case 7:
				result='C';
				break;
			case 6:
				result='D';
				break;
		}

		System.out.println("학점은 "+result+"입니다");
		if(avg<60){
			System.out.println("재시험에 응시하셔야합니다");
		}
		
		
	}

}












