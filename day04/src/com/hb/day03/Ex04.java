package com.hb.day03;

class Ex04{

  public static void main(String[] args){
    /*
    System.out.println("첫번째:" +args[0]);
    System.out.println("두번째:" +args[1]);
    System.out.println("세번째:" +args[2]);
    */
  
    String input1=args[0];
    String input2=args[1];
    String input3=args[2];
    
    int su1 = Integer.parseInt("100");
    //String->int 형변환
    int su2 = Integer.parseInt(input3);
    int result;
    result = 0;
    double result2 =1.0;
    boolean show = true;
    /*
    switch(case){
      case val:
        break;
      case val:
        break;
      case val:
         break;
      default:
    
    }
    
    
    switch(input2){
      case "+":
        result = su1 + su2;
        break;
      case "-":
        result = su1 - su2;
        break;
       case "x": case "*":
        result = su1*su2;
        break;
       case "/":
        result2 = 100*su1/su2/100.0;
        break;
       default:
        System.out.println("입력을 잘못하셨습니다");
        show = false;
    }
    */
    if(input2.equals("+")){
      result = su1 + su2;
    } else if(input2.equals("-")){
      result = su1 - su2;
    } else if(input2.equals("x") || input2.equals("*")){
      result = su1*su2;
    } else if(input2.equals("/")){
      result2 = 100*su1/su2/100.0;
    } else {
      System.out.println("입력을 잘못하셨습니다");
        show = false;
    }
    if(show){
      if(input2.equals("/")){
        System.out.println(su1+"÷"+su2+"="+result2);
      }else{
        System.out.println(su1+input2+su2+"="+result);
      }
    }
    // 계산기 만들기
    
    // ex) "100 + 23 = ?"
    // ex) "100 - 3 = 97"
    // ex) "100 x 7 = ?"
    // ex) "100 / 5 = ?"
  }

}