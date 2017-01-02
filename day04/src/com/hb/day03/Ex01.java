package com.hb.day03;
// 조건문 (2)

// 반복문 (3)

class Ex01{

  public static void main(String[] args){
    // main start
    // 조건문 만약(if) ~~ 이라면,
    /*
      if(조건:true/false){
          ~~~ 수행할 연산
          }
      if(조건){
      
      }else{
      }  
      
       
      if(t && f){
        1.
      }else if(f && f){
        2.
      }else if(t || f){
        3.
      }else if(t){
        4.
      }  
          
          
          
    */
    
    int num1, num2;
    num1=100431;
    num2=233423;
    boolean result = num1>num2;
    /*
      if(result){
        System.out.println(num1+"은 "
        +num2+"보다 큽니다");
      }
      if(!(result)){
        System.out.println(num1+"은 "
        +num2+"보다 크지 않습니다");
      }
    */
    if(num1%2==0){
      System.out.println("짝수입니다");
    }else{
      System.out.println("홀수입니다");
    }
    
    
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
    
    
  }//main end


}//class end








