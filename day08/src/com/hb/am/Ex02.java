package com.hb.am;


class Ex02 {

	public static void main(String[] args) {
//			int a = hap();
//			System.out.println(a);
			func1(hap());
			System.out.println(hhap(hhap(hhap(2))));
			return;
	}// main end
	
	static void func1(int a){
		System.out.println("run"+a);
		if(a>=10){return;}
		System.out.println("aaaaa");
	} //func1 end
	
	static void func2(int a){
		while(a<20){
			System.out.println("run"+a++);
			if(a>15)break;
		}// while end
		System.out.println("aaaaaaa");
	} //func2 end
	
	static int hap(){
//		return 1+2;
		int a = 1+2;
		return a;
	}
	static int hhap(int a){
		int sum = a + a;
		System.out.println(a+"+"+a+"="+sum);
		return sum;
	}
}// class end














