package com.hb.day04;
/*
  1 	2  	3 	4 	5	
  6 	7 	8 	9 	10	
  11	12	13	14	15	
  16	17	18	19	20	
  ÃÑ ÇÕ°è:  ???
*/

  class Ex06{
  
    public static void main(String[] args){
      int sum=0;
      /*
      for(int j=0; j<4; j++){
        for(int i=1; i<6; i++){
          sum = sum +i+j*5;
          System.out.print( i+j*5+"\t");
        }
        System.out.println();
      }
      System.out.println("ÇÕ°è:"+sum);
      
      for(int a=1; a<21; a++){
      
        System.out.print(a+"\t");
        if(a%5==0){
          System.out.println();
        }
      }
      */
      int b=0;
      while(true){
        b++;
        System.out.print(b+"\t");
        if(b==20){break;}
        if(b%5==0){
          System.out.println();
        }
      }
    }
    
  
  }