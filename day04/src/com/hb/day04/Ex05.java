package com.hb.day04;

//Q1. ������ 10�� ���� ���̸� ���Ͻÿ�
//���� ���� = ������3.14��1/2��������
//       = ��������2��3.14��1/2��������
//���� ���� : ������ �� ������ �� 3.14

class Ex05{

  public static void main(String[] args){
    
    int r=10;
    //1.
    System.out.print("1. �� ������ 10�� ���� ����:");
    System.out.println((r*0.5)*(r*0.5)*3.14);
    
    System.out.println("----------------------");
    //2.
    double pi= 3.14;
    double result= (r*0.5)*(r*0.5)*pi;
    
    System.out.print("2. �� ������ 10�� ���� ����:");
    System.out.println(result);
    
    System.out.println("----------------------");
    //3.
    double result2= (r*0.5)*(r*0.5)*Math.PI;
    
    System.out.print("3. �� ������ 10�� ���� ����:");
    System.out.println(result2);
  }


}