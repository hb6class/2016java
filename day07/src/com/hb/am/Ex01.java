package com.hb.am;

public class Ex01 {

	public static void main(String[] args) {
		// if문
		int num=321345;
		if(num%2==0){
			System.out.println(num+"은 짝수입니다");
		}else{
			System.out.println(num+"은 홀수입니다.");
		}
		int num2= 3534-234234+4328*324-2342362;
		if(num2>0){
			System.out.println(num2+"은 양수입니다");
		}else if(num2==0){
			System.out.println("0입니다.");
		}else{
			System.out.println(num2+"은 음수입니다.");
		}

	}

}
