package com.hb.am;

public class Ex04 {
	static String model ="텍트";
	int speed;
	int minSpeed;
	int maxSpeed=80;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex04 me = new Ex04();
		me.speedUp(20);
		prn(me);
		me.speedUp(20);
		prn(me);
		me.speedUp(20);
		prn(me);
		me.speedUp(20);
		prn(me);
		me.speedUp(20);
		prn(me);
		me.speedDown(30);
		prn(me);
		me.speedDown(30);
		prn(me);
		me.speedDown(30);
		prn(me);
		me.speedDown(30);
		prn(me);
	}
	
	public static void prn(Ex04 me){
		System.out.println(model + "의 현재속도는 "+me.speed+"km");
	}
	public void speedDown(int speed1){
		if(speed-speed1>=0){speed -= speed1;}
		else {speed=0;}
	}
	public void speedUp(int speed1){
		if(speed+speed1<=maxSpeed){speed += speed1;}
		else {speed = maxSpeed;}
	}
	
}
