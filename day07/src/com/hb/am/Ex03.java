package com.hb.am;

public class Ex03 {

	public static void main(String[] args) {
		// �ݺ���
		// for��, while��, do~while��
		// for(�ʱ�ȭ;���ǽ�;����){
		//	}
		// while(���ǽ�){
		//	}
		// do{
		//	}while(���ǽ�);
//		int sum = 0;
//		for(int i=1; i<=10; i++){
//			sum=sum+i;
//			System.out.print(i);
//			if(i<10){
//				System.out.print("+");
//			}
//		}
//		System.out.println("="+sum);
		/////////////////////
		int m=0;
		int sum=0;
//		while(m<=10){
//			sum += m;
//			System.out.print(m);
//			if(m<10){System.out.print("+");}
//			m++;
//		}
//		while(++m<=10){
//			sum += m;
//			System.out.print(m);
//			if(m<10){System.out.print("+");}
//		}
		while(true){
			System.out.print(++m);
			sum+=m;
			if(m<10){
				System.out.print("+");
			}else{
				break;
			}
		}
		
		
//		do{
//			sum += m;
//			System.out.print(m);
//			if(m<10){System.out.print("+");}
//			m++;
//		}while(m<=10);
		System.out.println("="+sum);
	}

}
















