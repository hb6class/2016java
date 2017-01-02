package com.hb.pm;

public class Ex02 extends Thread {

	public static void main(String[] args) {
		System.out.println("main start");
		Ex02 me = new Ex02();
		me.start();
		for(int i=0; i<10; i++){
			try {
				Thread.sleep(1000); // 스레드의 잠시 휴식1/1000 ->1초
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("main() i:"+i);
		}
		System.out.println("main end");
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++){
			try {
				Thread.sleep(1000); // 스레드의 잠시 휴식1/1000 ->1초
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("new Ex02 thread run() i:"+i);
		}
	}

}
