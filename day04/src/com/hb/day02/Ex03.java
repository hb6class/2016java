package com.hb.day02;


class Ex03{
  
  public static void main(String[] args){
  
    // Escape ����
    // \n \t \r \\ \' \" \b ~~
    System.out.print("\t������\n�� ����");
    System.out.print("�ƹ��� �� : \"�������� ����\"");
    System.out.print("\n");
    //System.out.println();
    System.out.print("�ƹ��� �� : \'\\�������� ����\'");
    System.out.println("---------------------");
    System.out.println(1+2);
    System.out.println(1.0+2.2);
    System.out.println(1.0+2);
    System.out.println("���ڿ�"+3.2+2);
    System.out.println(2+3+"���ڿ�");
    
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
    System.out.println("����\t����\t����\t����\t���");
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








