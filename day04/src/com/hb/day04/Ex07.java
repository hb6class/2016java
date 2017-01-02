package com.hb.day04;
/*
  1
  1 2
  1 2 3
  1 2 3 4
  ÃÑ ÇÕ°è:  ???
*/

class Ex07{

  public static void main(String[] args){
    /*
    for(int b=1; b<5;b++){
      for(int a=1; a<=b;a++){
        
          System.out.print(a+"\t");
         
      }
      System.out.println();
    }
    */
      int a=1;
      int line=0;
    while(true){
      line++;
      a=1;
      while(true){
        System.out.print(a+"\t");
        a++;
        if(line+1==a){
          break;
        }
      }
      if(line==4){
          break;
      }
      System.out.println();
    }
    
  }

}







