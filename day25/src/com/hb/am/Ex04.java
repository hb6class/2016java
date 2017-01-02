package com.hb.am;

class Am04 implements Runnable{
	static int sum;

	@Override
	public void run() {
		for(int i=0; i<10; i++){
			sum+=i;
			try {
				Thread.currentThread().sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Ex04 {

	public static void main(String[] args) {
		Am04 am = new Am04();
		Thread thr1 = new Thread(am);
		Thread thr2 = new Thread(am);
		Thread thr3 = new Thread(am);
		
		thr1.start();
		thr2.start();
		thr3.start();
		
		try {
			thr1.join();
			thr2.join();
			thr3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		int sum=0;
		for(int i=0; i<10; i++){
			sum+=i;
		}
		System.out.println("0~9 :"+sum + ", tot:"+(sum*3));
		System.out.println("tot:"+Am04.sum);

	}

}
