package com.hb.day04;
class Ex03{

  public static void main(String[] args){
    
    //Q2.
    int dan, i;
    dan =2;
    i=1;
    
    while(i<10){
      //System.out.println(dan+"½ÃÀÛ");
      dan=2;
      while(dan<10){
        System.out.print(dan+"x"+i+"="+dan*i+"\t");
        dan++;
      }
      System.out.println();
      i++;
    }
  
  
  }


}