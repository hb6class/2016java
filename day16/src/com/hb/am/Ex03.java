package com.hb.am;

public class Ex03 {

	public static void main(String[] args) {
		// 
//		int[][] arrs = new int[][]{{1,2},{3,4},{5,6}};
////		arrs[0]=new int[]{1,2};
////		arrs[1]=new int[]{3,4};
////		arrs[2]=new int[]{5,6};
//		for(int a=0; a<arrs.length; a++){
//			int[] temp = arrs[a];
//			for(int b=0; b<temp.length; b++){
//				System.out.print(temp[b]+" ");
//			}
//			System.out.println();
//		}
		//2x1=2.... 9x9=81
		
		int[][] gugudan = new int[9][8];
		String[][] gugu = new String[9][8];
//		gugudan[0]=new int[]{2,3,4,5,6,7,8,9};
//		gugudan[1]=new int[]{4,6,8...18};
//		gugudan[8]=new int[]{9,...81};
		for(int a=0; a<gugudan.length; a++){
			for(int b=0; b<gugudan[a].length; b++){
				gugudan[a][b]= (b+2)*(a+1);
				gugu[a][b]= (b+2)+"x"+(a+1);
			}
		}
		
		for(int a=0; a<gugudan.length; a++){
			for(int b=0; b<gugu[a].length; b++){
				System.out.print(gugu[a][b]+"="+gugudan[a][b]+"\t");
			}
			System.out.println();
		}
		
		
	}

}
