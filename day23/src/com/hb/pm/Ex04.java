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
// ����
// super this
// �ν��Ͻ� ����
// �����ε�, �������̵� ���� ����
// ����ڽ� ��ڽ�
// ���
// �������̽� ����
// �������̶�
// ĸ��ȭ��
// ���м�
// �̱���
// �ڷᱸ�� : 7�� 3�з�, ���׸�why?


public class Ex04 {
	// 7�� p.324 ~ 
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
