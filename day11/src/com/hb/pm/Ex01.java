package com.hb.pm;

public class Ex01 {
	int a=3;

	public static void main(String[] args) {
		// 1
		// 22
		// 333
		// 4444
		// 55555
		int limit = 9;
		String[] arr2 = new String[limit];
		for(int i=0; i<limit; i++){
			arr2[i]="";
			for(int j=0; j<=i; j++){
				if(i>=j){arr2[i]+="*";}else{arr2[i]+=" ";}
			}
		}
		for(int i=0; i<limit; i++){
			System.out.println(arr2[i]);
		}
		System.out.println("------------");
		int[] arr3={1,3,45,66,33};
		for(int i=0; i<arr3.length; i++){
			System.out.println(arr3.length);
		}
		System.out.println("------------");
		Ex01 me1 = new Ex01();
		Ex01 me2 = new Ex01();
		Ex01 me3 = new Ex01();
		Ex01[] arr4 = new Ex01[3];
		arr4[0]=me1;
		arr4[1]=me2;
		arr4[2]=me1;
		me1.a=6;
		for(int i=0; i<arr4.length; i++){
			System.out.println("arr4["+i+"].a="+arr4[i].a);
		}
		System.out.println("------------");
		int[] arr10 = new int[3]; 
		int[] arr11 = new int[3]; 
		int[] arr12 = new int[3]; 
//		int[][] bigArr = {arr10, arr11, arr12};
//		int[][] bigArr = new int[][]{arr10, arr11, arr12};
		int[][] bigArr = new int[3][3];
//		bigArr[0] = new int[3]; 
//		bigArr[1] = new int[3]; 
//		bigArr[2] = new int[3]; 
		/////
		bigArr[0][0]=10;
		bigArr[1][0]=11;
		bigArr[1][1]=11;
		bigArr[2][0]=12;
		bigArr[2][1]=12;
		bigArr[2][2]=12;
		
		for(int i=0; i<bigArr.length; i++){
			for(int j=0; j<bigArr[i].length; j++){
				System.out.print(bigArr[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}









