package com.hb.am;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		System.out.println(myCar.model);
		System.out.println(myCar.color);
		myCar.run();
		myCar.stop();
		myCar.run();
		myCar.color="�Ķ�";
		System.out.println(myCar.color+"��"+myCar.model+"�� ������ Ÿ��");
		myCar.run();
		
		Car yourCar = new Car();
		System.out.println(yourCar.color+"��"+myCar.model+"�� ����� ��");
	}

}

class Car{
	String model = "���";
	String color = "����";
	
	public void run(){
		// �޸���.
		System.out.println("�޸���");
	}
	public void stop(){
		System.out.println("�����");
	}
}












