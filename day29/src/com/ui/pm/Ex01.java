package com.ui.pm;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class Ex01 extends Frame {
	
	public Ex01() {
		
		Panel p1 = new Panel();
		p1.setLayout(null); // �ۼַ�Ʈ ���̾ƿ�
		
		Label la1 = new Label("�α���������",Label.CENTER);
		Label lid = new Label("id:",Label.RIGHT);
		Label lpw = new Label("pw:",Label.RIGHT);
		TextField tf1 = new TextField();
		TextField tf2 = new TextField();
		Button btn1 = new Button("�α���");
		Button btn2 = new Button("ȸ������");
		la1.setLocation(90, 50);
		la1.setSize(100, 50);
//		la1.setBackground(Color.red);
		lid.setBounds(0, 150, 100, 50);
//		lid.setBackground(Color.blue);
		lpw.setBounds(0, 200, 100, 50);
//		lpw.setBackground(Color.YELLOW);
		tf1.setBounds(120,160,150,30);
		tf2.setBounds(120,210,150,30);
		btn1.setBounds(30,300,100,50);
		btn2.setBounds(150,300,100,50);
		
		p1.add(la1);	p1.add(lid);	p1.add(lpw);
		p1.add(tf1);	p1.add(tf2);	p1.add(btn1);	p1.add(btn2);
		add(p1);
		setLocation(1800,200);
		setSize(300, 400);
		setVisible(true);
		setResizable(false);
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
