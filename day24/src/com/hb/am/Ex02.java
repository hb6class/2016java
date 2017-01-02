package com.hb.am;



class Box02<T>{
	T obj;
	void setObj(T obj){	this.obj = obj;}
	T getObj(){	return this.obj;}
}

public class Ex02 {

	public static void main(String[] args) {
		Box02<String> box1 = new Box02<String>();
//		Box02<Integer> box2 = new Box02<Integer>();
//		Box02<? extends Number> box3 = new Box02<Integer>();
//								box3 = new Box02<Double>();
//								box3 = new Box02<String>();
		Box02<? super Integer> box3 = new Box02<Integer>();
								box3 = new Box02<Number>();
								box3 = new Box02<Object>();
	}

}
