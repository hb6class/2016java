package com.hb.am;

public class Ball {
	public int num;		// ����
	protected String color;// ������
	public boolean mark;	//�ѹ� �̾Ҵ� ������ Ȯ��
	
	public Ball(){}
	public Ball(int num, String color) {
		this.num = num;
		this.color = color;
		mark = true;
		System.out.println("���ϳ��� ����� ��ȣ("+num+")�� �ο��ϰ�");
		System.out.println(color+"�� ��ī�� ĥ�Ͽ� �ڽ��� ����ִ´�");
	}
	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return color;
	}
	public void show(){
		System.out.println(num+":"+color);
	}
	public void setMark(){
		mark= !(mark);			//		mark=true;
	}
	
	public void cap(){
		setMark();
		show();
	}
}
