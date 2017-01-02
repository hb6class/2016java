package com.hb.pm;

public class Ex02 {
	String name ="���";
	int speed;
	int maxSpeed;
	static int minSpeed;
	
	public Ex02() {
		speed=0;
		maxSpeed=80;
	}
	public Ex02(String st){
		name = st;
		maxSpeed=80;
	}
	public Ex02(String st, int a){
		name = st;
		maxSpeed=a;
	}
	public void speedUp(int a){
		if(speed+a<=maxSpeed){speed+=a;}
		else {speed=maxSpeed;}
	}
	public void speedDown(int a){
		if(speed-a>=0){speed-=a;}
		else {speed=minSpeed;}
	}
	
	public static void main(String[] args) {
		Ex02 me = new Ex02();
		me.speedUp(10);
		System.out.println("���� "+me.name+"�� ����ӵ��� "+me.speed+"km");
		me.speedUp(50);
		System.out.println("���� "+me.name+"�� ����ӵ��� "+me.speed+"km");
		me.speedUp(30);
		System.out.println("���� "+me.name+"�� ����ӵ��� "+me.speed+"km");
		me.speedDown(60);
		System.out.println("���� "+me.name+"�� ����ӵ��� "+me.speed+"km");
		me.speedDown(40);
		System.out.println("���� "+me.name+"�� ����ӵ��� "+me.speed+"km");
		System.out.println("-------------------------------------");
		Ex02 you = new Ex02("����ũ");
		you.speedUp(50);
		System.out.println("���� "+you.name+"�� ����ӵ��� "+you.speed+"km");
		you.speedDown(80);
		System.out.println("���� "+you.name+"�� ����ӵ��� "+you.speed+"km");
		System.out.println("-------------------------------------");
		Ex02 that = new Ex02("�ö���", 250);
		that.speedUp(40);
		that.speedUp(50);
		that.speedUp(50);
		that.speedUp(50);
		that.speedUp(50);
		that.speedUp(50);
		System.out.println("������ "+that.name+"�� ����ӵ��� "+that.speed+"km");
		
	}
	
	

}
