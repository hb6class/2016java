package com.hb.am;

public class Ex02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num = "991231-1234567";
		int year=1999;
		
		System.out.println(num.charAt(7));
		System.out.println(num.substring(7,8));
		
//		int startNum = num.charAt(0)-'0';
//		int nextNum = num.charAt(1)-'0';
		int age=0; int center=1900;
////		System.out.println(startNum);
//		if(startNum==0||startNum==1){
//			center=2000;
//		}
//		age = year - (center+startNum*10+nextNum*1)+1;
		int twoNum = Integer.parseInt(num.substring(0,2));
		if(twoNum<=16){
			center=2000;
		}
		age = year-(center+twoNum)+1;
		
		System.out.println("당신의 나이는 "+age+"세 입니다");
		
		System.out.println(twoNum+"년"
							+num.substring(2,4)+"월"
							+num.substring(4,6)+"일");
		
		String st ="     한글    JavaWorld    ";
		
		System.out.println("/////"+st.trim()+"/////");
		System.out.println(st.toUpperCase().trim().substring(2).trim());
		System.out.println(st.trim().toLowerCase().substring(2));
		
		String st2 ="한글은 뛰어납니다 한글good 한글 한글 한글";
		// "한글은 뛰어납니다 자바good";
		
//		st2=st2.replace("한글", "자바");
//		st2=st2.replaceFirst("자바", "한글");
//		System.out.println(st2);
		
//		int endIndex = st2.substring(st2.indexOf("한글")+1).indexOf("한글")+1;
//		int endIndex = st2.length()-st2.compareTo("한글");
//		System.out.println(st2.substring(0, endIndex)
//							+st2.substring(endIndex).replace("한글", "자바"));
		
		char[] ch = new char[st2.length()];
		st2.getChars(0, st2.length(), ch, 0);
		
		int cnt =0;
		int no=2;
		int i=0;
		String jav ="길게길게길게";
		for(i=0; i<ch.length; i++){
			System.out.println(ch[i]);
			if(i>0){
				if(ch[i-1]=='한'&&ch[i]=='글'){
				cnt++;
				if(cnt==no){
					i--;
					break;
					}
				}
			}
		}
//		System.out.println(">>>"+i);
//		for(int m=0; m<jav.length(); m++){
//			ch[i]=jav.charAt(m);
//			i=i+1;
//		}
		int n=0;
		char[] ch2 = new char[ch.length+(jav.length()-"한글".length())];
		for(int m=0; m<i; m++){
			ch2[m]=ch[m];
		}
		for(int m=i; m<i+jav.length(); m++){
			ch2[m]=jav.charAt(n++);
		}
		int s = i+"한글".length();
		for(int m=i+jav.length(); m<ch2.length; m++){
			ch2[m]=ch[s++];
		}
		
//		
		System.out.println(String.valueOf(ch2));
	}

}











