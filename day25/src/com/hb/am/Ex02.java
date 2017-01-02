package com.hb.am;

class Am02 implements Runnable{
	@Override
	public void run() {
		Thread thr = Thread.currentThread();
		for(int i=0; i<10; i++){
//			thr.setPriority(Thread.MIN_PRIORITY+i);
			try {
				thr.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(thr.getName()+":"+thr.getPriority());
		}
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Am02 am2 = new Am02();
		
		Thread thr1 = new Thread(am2,"th1");
		Thread thr2 = new Thread(am2,"th2");
		Thread thr3 = new Thread(am2,"th3");
		
		// 1(min) ~ 5(nom) ~ 10(max)
//		thr1.setPriority(Thread.MIN_PRIORITY);
//		thr2.setPriority(Thread.NORM_PRIORITY);
//		thr3.setPriority(Thread.MAX_PRIORITY);
		try {
			thr1.start();
			thr1.join(2000);
			thr2.start();
			thr2.join(4000);
			thr3.start();
			thr3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main end");
	}

}






















