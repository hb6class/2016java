package com.hb.day04;
/*
Q4. 다음을 출력하시오 
   1
   2 3
   4 5 6
   7 8 9 10
   
   1 ->0+1
   1 2 -> 1+2
   1 2 3 -> 3+3
   1 2 3 4 -> 6+4
              ->10+5
                ->15+6
  총 합계:  ???
*/

class Ex08{
  
  public static void main(String[] args){
    //1.
    /*
    int a=1;
    int tmp=0;
    int tmp2=1;
    
    while(a<11){
      System.out.print(a+++"\t");
      tmp++;
      if(tmp==tmp2){
        System.out.println();
        tmp=0;
        tmp2++;
      }
    }
    
    int i=1;
    for(int j=0; j<4; j++){
      for(int m=0; m<=j; m++){
        System.out.print(i+++"\t");
      }
      System.out.println();
    }
    */
    int tmp=0;
    for(int b=1; b<5;b++){
      for(int a=1; a<=b;a++){   
          System.out.print(tmp+a+"\t");
      }
      tmp= tmp+b;
      System.out.println();
    }
  }

}







