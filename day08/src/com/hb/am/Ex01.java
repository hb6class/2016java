package com.hb.am;

public class Ex01 {

	public static void sayFunc1(){
		System.out.println("f1 start");
		// �޼ҵ�
		// �ڷ��� �޼ҵ��(����...){}
		// ù��¥ �ҹ��� �ι�° �ܾ��� ù��¥ �빮��
		// �޼ҵ��ǹ� - ��ɿ��
		// �ڷ����� ������ return xx; �� xx�� ���� ����
		// ��, return ���ų� return; ��� void
		System.out.println("�ڹٿ���");
		System.out.println("f1 end");
	}
	
	public static void sayFunc2(String name){
		System.out.println("f2 start");
		System.out.println(name+"�� ȯ���մϴ�.");
		sayFunc3(name);
		System.out.println(name+"�� ȯ���߾����ϴ�.");
		System.out.println("f2 end");
	}
	//public static void sayFunc2(String name){}
	// �޼ҵ� �����ε�
	public static void sayFunc2(int age){
		System.out.println("����� "+age+"�� �Դϴ�");
	}
	public static void sayFunc2(String name, int age){
		System.out.println(name+"�� ����� "+age+"�� �Դϴ�");
	}
	public static void sayFunc2(int age, String name){
		System.out.println(age+"���� "+name+"�� ȯ���մϴ�");
	}
//	public static int sayFunc2(int age){
//		System.out.println("����� "+age+"�� �Դϴ�");
//		return 19;
//	}
	public static void main(String[] args) {
		System.out.println("main start");
		sayFunc1();
		sayFunc2("ȫ�浿");
		sayFunc2(19);
		sayFunc2(15,"�ι̿�");
		System.out.println("main end");
		
	}
	
	public static void sayFunc3(String name){
		name="ȫ����";
		System.out.println(name+"�� ���� ��������");
	}

}
