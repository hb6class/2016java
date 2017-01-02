package com.hb.am;

public class Ex05 {

	public static void main(String[] args) {
		// 7´Ü
		int dan=7;
//		System.out.println(dan+"x"+1+"="+dan*1);
//		System.out.println(dan+"x"+2+"="+dan*2);
//		System.out.println(dan+"x"+3+"="+dan*3);
//		System.out.println(dan+"x"+4+"="+dan*4);
//		System.out.println(dan+"x"+5+"="+dan*5);
		
//		for(dan=2; dan<10; dan++){
//			for(int i=1; i<10; i++){
//				System.out.println(dan+"x"+i+"="+dan*i);
//				
//			}
//		}
		//2*1 3*1 4*1 ~~ 9*1
		//2*2
		//2*3
		//2*9
		for(int m=1; m<10; m++){
			for(dan=2; dan<10; dan++){
				System.out.print(dan+"x"+m+"="+dan*m+"\t");
			}
			System.out.println();
		}
		////////////////////////////
		//	2e1+2e2+2e3+2e4...+2e10=?????
		
	}

}
