package com.hb.day04;
//1~10���� �� ¦���� ����ϰ� �׵��� �հ踦 ���Ͻÿ�


class Ex09{
  public static void main(String[] args){
    /*
    int n=0;
    int limit=10;
    while(true){
      n++;
      if(n>=limit){
        System.out.print(n);
      }else if(n%2==0){System.out.print(n+",");}
      if(n>=limit){break;}
    }
    */
    for(int a=2; a<21; a++){
      if(a%2!=0){
        continue;
        //System.out.println();
      }
      System.out.print(a+" ");
    }
    System.out.println("~~~~~ ");
  }

}






