package com.hb.day03;

class Ex04{

  public static void main(String[] args){
    /*
    System.out.println("ù��°:" +args[0]);
    System.out.println("�ι�°:" +args[1]);
    System.out.println("����°:" +args[2]);
    */
  
    String input1=args[0];
    String input2=args[1];
    String input3=args[2];
    
    int su1 = Integer.parseInt("100");
    //String->int ����ȯ
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
        System.out.println("�Է��� �߸��ϼ̽��ϴ�");
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
      System.out.println("�Է��� �߸��ϼ̽��ϴ�");
        show = false;
    }
    if(show){
      if(input2.equals("/")){
        System.out.println(su1+"��"+su2+"="+result2);
      }else{
        System.out.println(su1+input2+su2+"="+result);
      }
    }
    // ���� �����
    
    // ex) "100 + 23 = ?"
    // ex) "100 - 3 = 97"
    // ex) "100 x 7 = ?"
    // ex) "100 / 5 = ?"
  }

}