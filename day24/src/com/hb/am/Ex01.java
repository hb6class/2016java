package com.hb.am;

class Box01<T>{
	T obj;
	void setObj(T obj){	this.obj = obj;}
	T getObj(){	return this.obj;}
}

//class Template{
//	public static <T> Box01<T> getMethod(T a){
//		Box01<T> box = new Box01<T>();
//		box.setObj(a);
//		return box;
//	}
//}
class Template{	// 이클래스 숫자에 한정하여 제네릭을 사용한다
	public static <T extends CharSequence> Box01<T> getMethod(T a){
		Box01<T> box = new Box01<T>();
		box.setObj(a);
		return box;
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Box01<String> box2 = new Box01<String>();
		Box01<StringBuffer> box = Template.<StringBuffer>getMethod(new StringBuffer("1000.0"));
		System.out.println(box.getObj());
	}

}
