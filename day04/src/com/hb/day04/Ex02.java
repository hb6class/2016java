package com.hb.day04;

class Ex02{

  public static void main(String[] args) throws Exception{
  
    System.out.print("���Ͻô� ���� �Է��ϼ���:");
    int dan = System.in.read()-48;
    
    int i=0;
    while(true){
      i++;
      System.out.println(dan+"x"+i+"="+dan*i);
      if(i==9) {break;}
    }


  }

}