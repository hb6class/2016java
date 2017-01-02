package com.hb.ex;

import java.util.Scanner;

interface Machine{
	void on();
	void off();
}

class Tv implements Machine{
	Tv(){
		System.out.println("TV�� �غ��մϴ�");
	}
	public void on(){
		System.out.println("�մϴ�");
	}
	public void off(){
		System.out.println("������ ���ϴ�");
	}
}

class Radio implements Machine{
	Radio(){
		System.out.println("������ �غ��մϴ�");
	}
	public void on(){
		System.out.println("�մϴ�");
	}
	public void off(){
		System.out.println("������ ���ϴ�");
	}
}

class Audio implements Machine{
	Audio(){
		System.out.println("������� �����մϴ�");
	}
	public void on(){
		System.out.println("�մϴ�");
	}
	public void off(){
		System.out.println("������ ���ϴ�");
	}
}



public class Remote {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input =0;
		while(true){
			System.out.println("� ��踦 �����Ͻðڽ��ϱ�?");
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
