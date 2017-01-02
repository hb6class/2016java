package com.hb.am;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		System.out.println(myCar.model);
		System.out.println(myCar.color);
		myCar.run();
		myCar.stop();
		myCar.run();
		myCar.color="ÆÄ¶û";
		System.out.println(myCar.color+"»ö"+myCar.model+"ÀÎ ³»Â÷¸¦ Å¸°í");
		myCar.run();
		
		Car yourCar = new Car();
		System.out.println(yourCar.color+"»ö"+myCar.model+"ÀÎ ¿·»ç¶÷ Â÷");
	}

}

class Car{
	String model = "¸ð´×";
	String color = "»¡°­";
	
	public void run(){
		// ´Þ¸°´Ù.
		System.out.println("´Þ¸°´Ù");
	}
	public void stop(){
		System.out.println("¸ØÃá´Ù");
	}
}












