package com.hb.pm;

class Pm44 extends Thread{
	public Pm44(String name) {
		super(name);
	}
	@Override
	public void run() {
		for(int i=0; i<10; i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Thread thr = Thread.currentThread();
			System.out.println(this.getName());
		}
	}
}

class Pm04 implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<10; i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Thread thr = Thread.currentThread();
			System.out.println(thr.getName());
			
		}
	}
	
}

public class Ex04 {

	public static void main(String[] args) {
		System.out.println("main start");
//		Pm04 pm4 = new Pm04();
//		Thread thread = new Thread(pm4,"스레드 추가");
////		Thread thread2 = new Thread(pm4,"스레드 또 추가");
//		thread.start();
//		thread2.start();
		Pm44 pm44 = new Pm44("상속을 통한");
		pm44.start();
		for(int i=0; i<10; i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
		}
	}

}







