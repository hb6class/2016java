package com.hb.day03;
// 조건문
// 만약(if) ~~ 이라면,
/* switch문 (case문)
    
    switch("a"){
      case val1:
        ~~~~;
        break;
        
      case "a":
        ~~~~;
        break;
        
      case val3:
        ~~~~;
        break;
        
      default:
        ~~~~;
    }
    

*/

class Ex03{

  public static void main(String[] args){
    //주사위숫자
    int num1;
    num1=3;
    String st= new String("이");
    
    switch(st){
      case "일":
        System.out.println("주사위 숫자 : 1");
        //break;
      case "이":
        System.out.println("주사위 숫자 : 2");
        //break;
      case "삼":
        System.out.println("주사위 숫자 : 3");
        //break;
      case "사":
        System.out.println("주사위 숫자 : 4");
        //break;
      case "오":
        System.out.println("주사위 숫자 : 5");
        //break;
      default:
        System.out.println("주사위 숫자 : 6");
    }
    
    
  
  }//main end




}//class end











