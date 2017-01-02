package com.hb.pm;

class Pm01 extends Thread{
	@Override
	public void run() {
		System.out.println("스레드시작");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			
		}
		System.out.println("스레드 종료");
	}
}

public class Ex01 {

	public static void main(String[] args) {
		// 스레드 상태
		Pm01 pm = new Pm01();
		pm.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
		}
		pm.interrupt();
	}

}
