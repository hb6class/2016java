package com.hb.pm;

import java.util.ArrayList;


class Box02<T>{
	T obj;
//	Pen pen;
//	Paper per;
	
	void add(T obj){
		this.obj = obj;
	}
//	void add(Pen pen){
//		this.pen = pen;
//	}
//	void add(Paper per){
//		this.per = per;
//	}
	T get(){
		return obj;
	}
}
class Paper{
	@Override
	public String toString() {
		return "�����Դϴ�";
	}
}
class Pen{
	@Override
	public String toString() {
		return "���� ���Դϴ�";
	}
}
public class Ex02 {
	public static void main(String[] args) {
		// 
		Box02<String> box = new Box02<String>();
		Box02<Pen> box2 = new Box02<Pen>();
		Pen pen = new Pen();
//		box2.add("aaaa");
		box2.add(pen);
		System.out.println(box2.get());
		
		
//		Paper per = new Paper();
////		box.add(pen);
////		box.add("String ���ڿ�");
////		box.add(new ArrayList());
//		box.add(new Ex02());
////		box.add(per);
	}

}
