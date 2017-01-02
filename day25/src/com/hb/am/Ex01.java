package com.hb.am;

class Am01 extends Thread{
	
	@Override
	public void run() {
		for(int i=0; i<10; i++){
			try {
				super.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(this.getName());
		}
	}
}

class Am11 implements Runnable {
	
	@Override
	public void run() {
		Thread thr = Thread.currentThread();
		for(int i=0; i<10; i++){
			try {
				thr.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(thr.getName());
		}
	}
	
	
}

public class Ex01 {

	public static void main(String[] args) {
		Am11 am11 = new Am11();
		Thread thr11 = new Thread(am11);
		thr11.start();
		
		/////////////////////////////////////
		Am01 am1 = new Am01();
		am1.start();
		Thread thr = Thread.currentThread();
		thr.setName("Main");
		for(int i=0; i<10; i++){
			try {
				thr.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(thr.getName());
		}
	}

}
