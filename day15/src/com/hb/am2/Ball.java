package com.hb.am2;

public class Ball {
	public int num;		// 숫자
	protected String color;// 공색깔
	public boolean mark;	//한번 뽑았던 것인지 확인
	
	Ball(){}
	public Ball(int num, String color) {
		this.num = num;
		this.color = color;
		mark = true;
		System.out.println("공하나를 만들어 번호("+num+")을 부여하고");
		System.out.println(color+"색 락카로 칠하여 박스에 집어넣는다");
	}
	void show(){
		System.out.println(num+":"+color);
	}
	public void setMark(){
		mark= !(mark);			//		mark=true;
	}
}
