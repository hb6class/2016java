package com.hb.day03;
/*
      ���ο� Ex02 class����ð�
      ������ : num1
      
      Q1.num1 3�� ������� 
      
      3�� ����̸� "3�� ��� �Դϴ�"
      
      �׷��� ������ "3�� ����� �ƴմϴ�"
      
      Q2. num1�� ¦������ Ȧ������
      
      "3�� ����̰� ¦���Դϴ�"
      "3�� ����̰� Ȧ���Դϴ�"
      "3�� ����� �ƴϰ� ¦���Դϴ�"
      "3�� ����� �ƴϰ� Ȧ���Դϴ�"
      
    */
class Ex02{

  public static void main(String[] args){
    int num1;
    num1=3534;
    String rusult1="3�� ����̰� ¦���Դϴ�";
    String rusult2="3�� ����̰� Ȧ���Դϴ�";
    String rusult3="3�� ����� �ƴϰ� ¦���Դϴ�";
    String rusult4="3�� ����� �ƴϰ� Ȧ���Դϴ�";
    /*Q1
    if(num1%3==0){
      System.out.println("3�� ���");
    }else{
      System.out.println("3�� ��� �ƴ�");
    }
    */
    
    /*Q2
    if(num1%3==0 && num1%2==0){
      System.out.println("3�� ����̰� ¦���Դϴ�");
    }
    if(num1%3==0 && num1%2!=0){
      System.out.println("3�� ����̰� Ȧ���Դϴ�");
    }
    if(num1%3!=0 && num1%2==0){
      System.out.println("3�� ����� �ƴϰ� ¦���Դϴ�");
    }
    if(num1%3!=0 && num1%2!=0){
      System.out.println("3�� ����� �ƴϰ� Ȧ���Դϴ�");
    }
    
    if(num1%3==0){
      if(num1%2==0){
        System.out.println("3�� ����̰� ¦���Դϴ�");
      }else{
        System.out.println("3�� ����̰� Ȧ���Դϴ�");
      }
    }else{
      if(num1%2==0){
        System.out.println("3�� ����� �ƴϰ� ¦���Դϴ�");
      }else{
        System.out.println("3�� ����� �ƴϰ� Ȧ���Դϴ�");
      }
    }
    
    if(num1%3==0){
      System.out.print("3�� ����̰�");
    }else{
      System.out.print("3�� ����� �ƴϰ� ");
    }
    if(num1%2==0){
      System.out.println("¦�� �Դϴ�.");
    }else{
      System.out.println("Ȧ�� �Դϴ�.");
    }
    */
    String res1="�� �ƴϰ�";
    String res2="Ȧ";
    if(num1%3==0 && num1%2==0){
      res1="�̰�";
      res2="¦";
    }else if(num1%3==0 && num1%2!=0){
      res1="�̰�";
    }else if(num1%2==0){
      res2="¦";
    }
    System.out.println("3�� ���"+res1+" "+res2+"���Դϴ�");
  }//main end




}//class end    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    