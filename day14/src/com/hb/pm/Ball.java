package com.hb.pm;

public class Ball {
	public int num;		// ����
	public String color;// ������
	public boolean mark;	//�ѹ� �̾Ҵ� ������ Ȯ��
	
	public Ball(int num, String color) {
		this.num = num;
		this.color = color;
		mark = true;
		System.out.println("���ϳ��� ����� ��ȣ("+num+")�� �ο��ϰ�");
		System.out.println(color+"�� ��ī�� ĥ�Ͽ� �ڽ��� ����ִ´�");
	}
	public void show(){
		System.out.println(num+":"+color);
	}
	public void setMark(){
		mark= !(mark);			//		mark=true;
	}
}
