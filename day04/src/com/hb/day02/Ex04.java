package com.hb.day02;

class Ex04{
  public static void main(String[] args){
    // �ڷ��� char �����ڵ�
    char i = '��';
    System.out.println((int)i);
    char n = 97;
    int j = '��';
    int m = 65;
    m = m+(90-65);
    char l = (char)m;
    System.out.println(i+"="+j);
    System.out.println((char)65+"(m)+"+(90-65)+"=>"+l);
    int z=97;
    System.out.println((char)z++);
    System.out.println((char)++z);
    System.out.println((char)++z);
    System.out.println((char)z);
    System.out.println("-------------");
    int a=6;
    System.out.println((++a)+1+(a++)+a);
    a+=2; // a= a+2;
    a-=3; // a= a-3;
    a*=2; // a= a*2;
    a/=2; // a= a/2;
    a%=2; // a= a%2;
    System.out.println(a);
    System.out.println("-------------");
    double num1=1.0000001;  //3.0==3
    double num2=2.0000001;
    
    System.out.println(num1+"+"+num2+"="+(num1+num2));
    
    double num3=7/3.0;
    System.out.println("num3="+(int)(num3*100)/100.0);
    
    float num4;
    num4=3.14F;   //(float)3.14;
    System.out.println("num4="+num4);
    
    long num5;
    num5=3333333333333333333L;
    System.out.println(num5);
    
    byte num6;
    num6=127;
    num6++;
    System.out.println("byte:"+num6);
    
    int num7 = 010;  // 8����1
    int num8 = 0x001f;  // 16����
    System.out.println("8����:"+num7);
    System.out.println("16����:"+num8);
    char ch1 = 0xac00;
    char ch2 = '\uac00';
    System.out.println(ch2);
    
    boolean tf1=true;
    boolean tf2=false;
    boolean tf3=true;
    boolean tf4=false;
    char ch3 ='\n';
    System.out.println("sdfakfsdj"+(char)10+"lfajflaskdf");
    //  �������� &&,|| - and, or
    System.out.println(3>1&&6<1&&6<1&&6<1&&6<1);
    System.out.println(!(tf1));
    
    String st1= "�ȳ�";
    String st2 ="�ȳ�";
    String st3 = new String("�ȳ�");
    System.out.print(st1);
    System.out.println(st3);
    System.out.println(st1.equals(st3));
  }





}














