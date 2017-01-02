package com.hb.pm;

class Pen04{}
class Paper04{}
class Box04<T,M>{
	T pen;
	M par;
	
	void set(T pen, M par){
		this.pen = pen;
		this.par = par;
	}
	T getPen(){
		return this.pen;
	}
	M getPar(){
		return this.par;
	}
}
// 설명
// super this
// 인스턴스 개념
// 오버로딩, 오버라이드 차이 설명
// 오토박싱 언박싱
// 상속
// 인터페이스 이유
// 다형성이란
// 캡슐화란
// 은닉성
// 싱글톤
// 자료구조 : 7장 3분류, 제네릭why?


public class Ex04 {
	// 7장 p.324 ~ 
	// p.386
	public static void main(String[] args) {
		Box04<Pen04, Paper04> box = new Box04<Pen04, Paper04>();
		box.set(new Pen04(), new Paper04());
		
		Box04<String, Integer> box2 = new Box04<String, Integer>();
		box2.set("aaaa", 12354);
		System.out.println(box2.getPen());
		System.out.println(box2.getPar());
	}

}
