package com.hb.am;

public class Ex04 {

	public static void main(String[] args) {
		// 2+4+6+8+10+...+18+20=???
		// 1+3+5+........+17+19=???
		int sum=0;
		for(int a=1; a<=21; a+=2){
			sum+=a;
			System.out.print(a);
			if(a<21){System.out.print("+");}
		}
//		int b=1;
//		while(b<=19){
//			System.out.print(b);
//			sum+=b;
//			if(b<19){System.out.print("+");}
//			b+=2;
//		}
//		int z= 2;
//		for(int c=1; c<=10; c++){
//			sum+=c*z-1;
//			System.out.print(c*z-1);
//			if(c<10){System.out.print("+");}
//		}
		boolean tf= true;
		for(int d=2; d<=20; d++){
			tf= !(tf);
			if(tf){
				System.out.print("+");
				continue;
			}
			System.out.print(d);
			sum+=d;
		}
		
		
		
		System.out.println("="+sum);
	}

}
