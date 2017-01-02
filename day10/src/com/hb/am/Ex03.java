package com.hb.am;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		motocycle my = new motocycle();
		int speed=0;
		speed = my.speedUp(speed, 20);
		speed = my.speedUp(speed, 30);
		speed = my.speedUp(speed, 20);
		speed = my.speedUp(speed, 20);
		speed = my.speedUp(speed, 20);
		my.speedView(speed);
		speed = my.speedDown(speed,9);
		speed = my.speedDown(speed,9);
		speed = my.speedDown(speed,9);
		speed = my.speedDown(speed,9);
		speed = my.speedDown(speed,9);
		speed = my.speedDown(speed,9);
		speed = my.speedDown(speed,9);
		speed = my.speedDown(speed,9);
		speed = my.speedDown(speed,9);
		speed = my.speedDown(speed,9);
		speed = my.speedDown(speed,9);
		my.speedView(speed);
	}

}

class motocycle{	//텍트
	
	public void speedView(int speed){
		System.out.println("현재속도:"+speed+"km");
	}
	public int speedUp(int a, int b){
		if(a+b<=80){
			return a+b;
		}else{
			return 80;
		}
	}
	public int speedDown(int a, int b){
		if(a-b>=0){
			return a-b;
		}else{
			return 0;
		}
	}
}
