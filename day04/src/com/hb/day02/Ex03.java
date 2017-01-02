package com.hb.day02;


class Ex03{
  
  public static void main(String[] args){
  
    // Escape 문자
    // \n \t \r \\ \' \" \b ~~
    System.out.print("\t개행하\n지 않음");
    System.out.print("아무개 왈 : \"개행하지 않음\"");
    System.out.print("\n");
    //System.out.println();
    System.out.print("아무개 왈 : \'\\개행하지 않음\'");
    System.out.println("---------------------");
    System.out.println(1+2);
    System.out.println(1.0+2.2);
    System.out.println(1.0+2);
    System.out.println("문자열"+3.2+2);
    System.out.println(2+3+"문자열");
    
    System.out.println(7*100/3/100.0);
    
    int kor;
    int eng;
    int math;
    int tot;
    kor=50;
    eng=50;
    math=50;
    tot=kor+eng+math;
    
    System.out.println("-----------------");
    System.out.println("국어\t영어\t수학\t총점\t평균");
    System.out.println(kor+"\t"+eng+"\t"+math+"\t"+tot+"\t"+tot*100/3/100.0);
    kor=60;
    eng=64;
    math=63;
    tot=kor+eng+math;
    System.out.println(kor+"\t"+eng+"\t"+math+"\t"+tot+"\t"+tot*100/3/100.0);
    kor=kor+20;
    eng=eng+10;
    math=math+20;
    tot=kor+eng+math;
    System.out.println(kor+"\t"+eng+"\t"+math+"\t"+tot+"\t"+tot*100/3/100.0);
    
    
    
    System.out.println("-----------------");
    
    System.out.println(7/3.0);
    System.out.println("-----------------");
    boolean a;
    a=7+3==5+5;
    System.out.println(a);
    System.out.println("-----------------");
    System.out.println("-----------------");
  }




}








