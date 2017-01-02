package com.hb.day03;

class Ex06{

  public static void main(String[] args) throws Exception{
  
    System.out.print("숫자입력 : ");
    int dan= System.in.read()-48;
    
    for(int i=1; i<10; i++){
      System.out.print(dan+"x"+i+"="+dan*i+"\n");
    }
    
    /*
    for(dan=1; dan<10; dan++){
      for(int i=2; i<10; i++){
      
        System.out.print(i+"x"+dan+"="+dan*i+"\t");
      
      }
      System.out.println();
    }
    */
   
  }

}