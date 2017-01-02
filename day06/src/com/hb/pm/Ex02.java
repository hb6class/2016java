package com.hb.pm;

public class Ex02 {

	public static void main(String[] args) {
		//////////////////////////////////////
		// Q1. x=5, y=9 , z=3
		// 이들을 오름차순 출력하시오
		// ///////////////////////////////////
		int x, y, z;
		x= Integer.parseInt(args[0]);
		y= Integer.parseInt(args[1]);
		z= Integer.parseInt(args[2]);
		
//		if(x<y && x<z && y<z){//x<y<z
//			System.out.println(x+"<"+y+"<"+z);
//		}else  if(x<y && x<z && z<y){
//			System.out.println(x+"<"+z+"<"+y);
//		}else  if(y<x && y<z && x<z){//y<x<z
//			System.out.println(y+"<"+x+"<"+z);
//		}else if(y<x && y<z && z<x){
//			System.out.println(y+"<"+z+"<"+x);
//		}else if(z<x && z<y && x<y){//z<x<y
//			System.out.println(z+"<"+x+"<"+y);
//		}else if(z<x && z<y && y<x){
//			System.out.println(z+"<"+y+"<"+x);
//		}
		
//		if(x<y && x<z){
//			System.out.print(x+"<");
//			if(y<z){
//				System.out.println(y+"<"+z);
//			}else{
//				System.out.println(z+"<"+y);
//			}
//		}else if(y<x && y<z){
//			System.out.print(y+"<");
//			if(x<z){
//				System.out.println(x+"<"+z);
//			}else{
//				System.out.println(z+"<"+x);
//			}
//		}else{
//			System.out.print(z+"<");
//			if(x<y){
//				System.out.println(x+"<"+y);
//			}else{
//				System.out.println(y+"<"+x);
//			}
//		}
		
		// ///////////////////////////////////
		// Q2. x=5, y=3 , z=9
		// 이들을 오름차순 출력하시오
		// 항상출력은 x < y < z순으로 출력
		// System.out.println("x < y < z :"+x+"<"+y+"<"+z);
		int temp =0;
//		if(x>y){
//			temp=x;
//			x=y;
//			y=temp;
//		}
//		if(x>z){
//			temp=x;
//			x=z;
//			z=temp;
//		}
//		if(y>z){
//			temp=y;
//			y=z;
//			z=temp;
//		}
		if(x<y && x<z && y>z){//x=3, y=9, z=5
			temp=y;
			y=z;
			z=temp;
		}else if(x>y && x>z && y<z){//x=9, y=3 , z=5
			temp=x;
			x=y;
			y=z;
			z=temp;
		}else if(x>y && x>z && y>z){//x=9, y=5 , z=3
			temp =x;
			x=z;
			z=temp;
		}else if(x>y && x<z && y<z){//x=5, y=3 , z=9
			temp =x;				//x=9, y=5 , z=10
			x=y;
			y= temp;
		}else if(x<y && x>z && y>z){//x=5, y=9 , z=3
			temp = z;
			z=y;
			y=x;
			x=temp;
		}// x=3, y=5, z=9
		
		
		System.out.println("x<y<z :"+x+"<"+y+"<"+z);
	}

}
