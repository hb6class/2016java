package com.hb.pm;

class Pm11 extends Thread{
	@Override
    public void run() {
		for(int i=0; i<10; i++){
			try {
				Thread.sleep(1000); // 스레드의 잠시 휴식1/1000 ->1초
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Pm11스레드로 실행");
		}
		System.out.println("Pm11 end-----------------------");
	}
}

class Pm01 extends Thread{
	@Override
    public void run() {
		new Pm11().start();
		for(int i=0; i<6; i++){
			try {
				Thread.sleep(1000); // 스레드의 잠시 휴식1/1000 ->1초
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("스레드로 실행");
		}
		System.out.println("Pm01 end-----------------------");
	}
	
}

public class Ex01 {

	public static void main(String[] args) {
		// 스레드
		System.out.println("main start");
		Pm01 pm1 = new Pm01();
//		pm1.run();
		pm1.start(); // 새로운 스레드로 run()을 실행
//		pm1 = new Pm01();
//		pm1.start(); // 새로운 스레드로 run()을 실행
		for(int i=0; i<5; i++){
			try {
				Thread.sleep(1000); // 스레드의 잠시 휴식1/1000 ->1초
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("main i:"+i);
		}
		System.out.println("main end-------------------------");
		return;	//
	}	//main end

}
