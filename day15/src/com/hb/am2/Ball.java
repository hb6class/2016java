package com.hb.am2;

public class Ball {
	public int num;		// ����
	protected String color;// ������
	public boolean mark;	//�ѹ� �̾Ҵ� ������ Ȯ��
	
	Ball(){}
	public Ball(int num, String color) {
		this.num = num;
		this.color = color;
		mark = true;
		System.out.println("���ϳ��� ����� ��ȣ("+num+")�� �ο��ϰ�");
		System.out.println(color+"�� ��ī�� ĥ�Ͽ� �ڽ��� ����ִ´�");
	}
	void show(){
		System.out.println(num+":"+color);
	}
	public void setMark(){
		mark= !(mark);			//		mark=true;
	}
}
