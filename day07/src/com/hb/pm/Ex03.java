package com.hb.pm;

public class Ex03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ****
		// ***
		// **
		// *
		
		//10 9 8 7
		//6 5 4
		//3 2
		//1
//		int limit=4;
//		int prn=0;
//		for(int a=10; a>0; a--){
//			System.out.print(a);
//			prn++;
//			if(prn==limit){
//				limit--;
//				System.out.println();
//				prn=0;
//			}
//		}
		//	1234
		//	123
		//	12
		//	1
//		int limit=5;
//		for(int a=1; a<5; a++){
//			for(int b=1; b<limit; b++){
//			System.out.print(b);
//			}
//			limit--;
//			System.out.println();
//		}
//		 	 	 	1
//		 	 	1	2
//		 	1	2	3
//		1	2	3	4
//		int limit=4;
//		int su=0;
//		for(int a=1; a<5; a++){
//			su=0;
//			for(int b=1; b<5; b++){
//				if(b<limit){
//					System.out.print(' '+"\t");
//				}else{
//					System.out.print(++su+"\t");
//				}
//			}
//			limit--;
//			System.out.println();
//		}
		//////////////////
//		   *  
//		  *** 
//		 *****
//		*******
//		int temp=0;
//		int center=10;
//		
//		for(int a=1; a<=center; a++){
//			for(int b=1; b<=2*center-1; b++ ){
//				if(b<center-temp){
//					System.out.print(' ');
//				}else if(b>center+temp){
//					System.out.print(' ');
//				}else{
//				System.out.print('*');
//				}
//			}
//			temp++;
//			System.out.println();
//		} 
		int limit=4;
		for(int a=1; a<5; a++){
			for(int b=1; b<5; b++){
				if(b<limit){
					System.out.print(' ');
				}else{
					System.out.print('*');
				}
			}
			for(int b=1; b<a ; b++){
				System.out.print('*');
			}
			limit--;
			System.out.println();
		}
		
		
		
		
//		for(int a=1; a<=3; a++){
//			for(int b=1; b<a ; b++){
//				System.out.print('*');
//			}
//			System.out.println();
//		}
		
		
		
		
		

	}

}
