package com.hb.pm;

class Pm01 extends Thread{
	@Override
	public void run() {
		System.out.println("���������");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			
		}
		System.out.println("������ ����");
	}
}

public class Ex01 {

	public static void main(String[] args) {
		// ������ ����
		Pm01 pm = new Pm01();
		pm.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
		}
		pm.interrupt();
	}

}
