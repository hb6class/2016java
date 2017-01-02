package com.hb.pm;

public class Ex01 {

	public static void main(String[] args) {
		// Q1. A, B, C, .... ,Z;
		System.out.println("A:"+(int)'A');
		System.out.println("Z:"+(int)'Z');
		System.out.println('z'-'a');
		
		for(int i=65; i<=90; i++){
			System.out.print((char)i);
			if(i<90){System.out.print(",");}
		}
		System.out.println("\n--------<절취선>----------");
		// Q2.  A:a
		//		B:b
		//		...
		//		Z:z
		int a=65;
//		int b=97;
		System.out.println((int)'a');
		while(a<=90){
			System.out.print((char)a);
			System.out.print(":");
			System.out.println((char)(a+97-65));
			a++;
		}
		// Q3. 
		//		a b c d e
		//		f g h i j
		//		...z
		for(int x=1; x<27; x++){
			System.out.print((char)(x+96)+"\t");
			if(x%5==0){
				System.out.println();
			}
		}
		System.out.println("\n--------<절취선>----------");
//		int prn =0;
		for(int z=0; z<5; z++){	
			for(int y=1; y<=5; y++){
//				prn = y+z*5+96;
				System.out.print('*'+"\t");
			}
			System.out.println();
		}
		
		
	}

}








