package com.hb.day05;

public class Ex06 {

	/*
	 * 2의 제곱 수 중, 최초 1000을 넘는 제곱 수를 구하시오
	 * 2e0=1, 2e1=2(2), 2e2=4(2*2), 2e3=8(2*2*2), 2*2*2*2
	 * if(result>1000)break;
	 */
	public static void main(String[] args) {
		int cnt =0;
		int tmp =1;
//		while(true){
//			cnt++;
//			tmp=tmp*2;
//			if(tmp>1000){break;}
//		}
		for(;;){
			cnt++;
			tmp=tmp*2;
			if(tmp>1000){break;}
		}
		
		System.out.println("2의"+cnt+"승:"+tmp);
	}

}








