package com.hb.day02;

class Ex02{
    
    public static void main(String[] args){

	// ���� x=7 y=1 x*y=7
	// ������ ������
	// �ڷ��� ������;
	// �ڷ���
	// String - ���ڿ�
	// int - 10���� ������(byte,short,long)
	// double - 10���� �Ǽ���(float)
	//int a=7;
	int a; // ������ ����
	a=7; // ������ �ʱ�ȭ
	//int b=1;
	int b;// ������ ����
	b=1;// ������ �ʱ�ȭ
	String c=" x ";

        System.out.println("------------");
        System.out.println("������ 7��");
        System.out.println("------------");
        System.out.println(a+c+b+" = "+a*b);
	b=b+1;
        System.out.println(a+c+b+" = "+a*b);
	b=b+1;
        System.out.println(a+c+b+" = "+a*b);
	b=b+1;
        System.out.println(a+c+b+" = "+a*b);
    }
}