package com.hb.am;

public class Ex02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//////////////////////////////////////
		// �л� �������� ���α׷�
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
		int kor, eng, math;
		
		int sum;
		double avg;
		char result='F';
		
		kor = Integer.parseInt(args[0]);
		eng = Integer.parseInt(args[1]);
		math = Integer.parseInt(args[2]);
		
		System.out.println("����:"+kor);
		System.out.println("����:"+eng);
		System.out.println("����:"+math);
		
		sum = kor + eng + math;
		System.out.print("�հ�:"+sum);
		avg = sum*100/3/100.0;	// �Ҽ� ��°�ڸ�����
		System.out.println(", ���:"+avg);
		
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
		//switch��
		//
		//	switch(��){
		//		case ��:
		//			break;
		//		case ��:
		//			break;
		//		case ��:
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

		System.out.println("������ "+result+"�Դϴ�");
		if(avg<60){
			System.out.println("����迡 �����ϼž��մϴ�");
		}
		
		
	}

}












