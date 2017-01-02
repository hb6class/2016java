package com.hb.ex;

import java.util.Scanner;

interface Machine{
	void on();
	void off();
}

class Tv implements Machine{
	Tv(){
		System.out.println("TV를 준비합니다");
	}
	public void on(){
		System.out.println("켭니다");
	}
	public void off(){
		System.out.println("전원을 끕니다");
	}
}

class Radio implements Machine{
	Radio(){
		System.out.println("라디오를 준비합니다");
	}
	public void on(){
		System.out.println("켭니다");
	}
	public void off(){
		System.out.println("전원을 끕니다");
	}
}

class Audio implements Machine{
	Audio(){
		System.out.println("오디오를 구비합니다");
	}
	public void on(){
		System.out.println("켭니다");
	}
	public void off(){
		System.out.println("전원을 끕니다");
	}
}



public class Remote {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input =0;
		while(true){
			System.out.println("어떤 기계를 제어하시겠습니까?");
			System.out.print("1.TV\t2.radio\t3.audio\t0.OFF :");
			input = Integer.parseInt(sc.nextLine());
			Machine m=null;
			if(input==1){
				m = new Tv();
			}else if(input==2){
				m = new Radio();
			}else if(input==0){
				break;
			}else if(input==3){
				m= new Audio();
			}
			m.on();
			m.off();
		}
	}

}
