package com.hb.day03;

class Ex07{

  public static void main(String[] args) throws Exception{
  
    System.out.print("숫자입력 : ");
    int input = System.in.read(); // 유니코드상 문자표
    System.out.println("--->"+(char)input);
    System.out.println("--->"+(input-48));
  
  }
}