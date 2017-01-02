package com.hb.pm;

public class Ex02 {

	public static void main(String[] args) {
		// *
		// * *
		// * * *
		// * * * *
		// 1
		// 2 3
		// 4 5 6
		// 7 8 9 10
		int tmp1=0;//가로
		int tmp2=1;//세로
		for(int i=1; i<=10; i++){
			System.out.print(i);
			tmp1++;
			if(tmp1==tmp2){
				tmp1=0;
				System.out.println();
				tmp2++;
			}
		}
		
		System.out.println("\n--------<절취선>----------");
		for(int x=1; x<5; x++){	
			for(int y=1; y<=5; y++){
				if(x>=y){
					System.out.print('*');
				}else{
					System.out.print(' ');
				}
			}
			System.out.println();
		}
		

	}

}
