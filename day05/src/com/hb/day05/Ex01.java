package com.hb.day05;

public class Ex01 {

	/*
	 * 1
	 * 2 3
	 * 4 5 6
	 * 7 8 9 10
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
	    int b=0;
	    int c=1;
	    func1(a,b,c);
	    func1(a,b,c,"@");
	} // main end
	
	public static void func1(int a, int tmp, int tmp2){
		while(true){
			if(a>10){break;}
			System.out.print(a+"\t");
			a++;
			tmp++;
			if(tmp==tmp2){
				System.out.println();
				tmp=0;
				tmp2++;
			}
		}
	} //func1 end
	
	public static void func1(int a, int tmp, int tmp2, String view){
		while(true){
			if(a>10){break;}
			System.out.print(view+"\t");
			a++;
			tmp++;
			if(tmp==tmp2){
				System.out.println();
				tmp=0;
				tmp2++;
			}
		}
	} //func1 end
}// class end
