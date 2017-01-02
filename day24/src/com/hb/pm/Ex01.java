package com.hb.pm;

class Pm11 extends Thread{
	@Override
    public void run() {
		for(int i=0; i<10; i++){
			try {
				Thread.sleep(1000); // �������� ��� �޽�1/1000 ->1��
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Pm11������� ����");
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
				Thread.sleep(1000); // �������� ��� �޽�1/1000 ->1��
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("������� ����");
		}
		System.out.println("Pm01 end-----------------------");
	}
	
}

public class Ex01 {

	public static void main(String[] args) {
		// ������
		System.out.println("main start");
		Pm01 pm1 = new Pm01();
//		pm1.run();
		pm1.start(); // ���ο� ������� run()�� ����
//		pm1 = new Pm01();
//		pm1.start(); // ���ο� ������� run()�� ����
		for(int i=0; i<5; i++){
			try {
				Thread.sleep(1000); // �������� ��� �޽�1/1000 ->1��
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("main i:"+i);
		}
		System.out.println("main end-------------------------");
		return;	//
	}	//main end

}
