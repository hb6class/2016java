package com.hb.day03;
/*
      새로운 Ex02 class만드시고
      변수명 : num1
      
      Q1.num1 3의 배수인지 
      
      3에 배수이면 "3의 배수 입니다"
      
      그렇지 않으면 "3의 배수가 아닙니다"
      
      Q2. num1이 짝수인지 홀수인지
      
      "3의 배수이고 짝수입니다"
      "3의 배수이고 홀수입니다"
      "3의 배수가 아니고 짝수입니다"
      "3의 배수가 아니고 홀수입니다"
      
    */
class Ex02{

  public static void main(String[] args){
    int num1;
    num1=3534;
    String rusult1="3의 배수이고 짝수입니다";
    String rusult2="3의 배수이고 홀수입니다";
    String rusult3="3의 배수가 아니고 짝수입니다";
    String rusult4="3의 배수가 아니고 홀수입니다";
    /*Q1
    if(num1%3==0){
      System.out.println("3의 배수");
    }else{
      System.out.println("3의 배수 아님");
    }
    */
    
    /*Q2
    if(num1%3==0 && num1%2==0){
      System.out.println("3의 배수이고 짝수입니다");
    }
    if(num1%3==0 && num1%2!=0){
      System.out.println("3의 배수이고 홀수입니다");
    }
    if(num1%3!=0 && num1%2==0){
      System.out.println("3의 배수가 아니고 짝수입니다");
    }
    if(num1%3!=0 && num1%2!=0){
      System.out.println("3의 배수가 아니고 홀수입니다");
    }
    
    if(num1%3==0){
      if(num1%2==0){
        System.out.println("3의 배수이고 짝수입니다");
      }else{
        System.out.println("3의 배수이고 홀수입니다");
      }
    }else{
      if(num1%2==0){
        System.out.println("3의 배수가 아니고 짝수입니다");
      }else{
        System.out.println("3의 배수가 아니고 홀수입니다");
      }
    }
    
    if(num1%3==0){
      System.out.print("3의 배수이고");
    }else{
      System.out.print("3의 배수가 아니고 ");
    }
    if(num1%2==0){
      System.out.println("짝수 입니다.");
    }else{
      System.out.println("홀수 입니다.");
    }
    */
    String res1="가 아니고";
    String res2="홀";
    if(num1%3==0 && num1%2==0){
      res1="이고";
      res2="짝";
    }else if(num1%3==0 && num1%2!=0){
      res1="이고";
    }else if(num1%2==0){
      res2="짝";
    }
    System.out.println("3의 배수"+res1+" "+res2+"수입니다");
  }//main end




}//class end    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    