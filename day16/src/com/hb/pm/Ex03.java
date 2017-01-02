package com.hb.pm;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temp me = new Temp(3);
		Temp me2 = new Temp(3);
		System.out.println(me.equals(me2));
		System.out.println("--------------------");
		String st ="java";
		String st2 = new String("java");
		System.out.println(st.equals(st2));
	}

}

class Temp{
	int a;
	Temp(int a){
		this.a=a;
	}
	
//	public int hashCode() {
//		return a;
//	}
//	
//	public boolean equals(Object obj) {
//		// TODO Auto-generated method stub
//		return hashCode()==obj.hashCode();
//	}
	
//	public String toString(){
//		return ""+a; 
//	}
	
}