package com.hb.pm;

class Pm02 extends Thread{
	boolean result;
	boolean work;
	@Override
	public void run() {
		System.out.println("Pm02 start");
		while(!result){
			if(work){
				System.out.println("02실행중");
			}else{
				yield();
			}
		}
	}
}

class Pm22 extends Thread{
	boolean result;
	boolean work;
	@Override
	public void run() {
		System.out.println("Pm22 start");
		while(!result){
			if(work){
				System.out.println("22실행중");
			}else{
				yield();
			}
		}
	}
}

public class Ex02 {

	public static void main(String[] args) {
		Pm02 me1 = new Pm02();
		Pm22 me2 = new Pm22();
		me1.start();
		me2.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		me1.work =true;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		me1.work =false;
		me2.work =true;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		me1.result=true;
		me2.result=true;
//		me1.stop();
//		me2.stop();
		
	}

}
