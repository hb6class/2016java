package com.ui.am;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.Panel;

public class Ex07 {

	public static void main(String[] args) {
		MyFrame my = new MyFrame("���û���");
		Panel p1 = new Panel();
		
		my.setSize(800, 600);
		
		Font font = new Font("�߰��", Font.BOLD, 26);
		Label la1 = new Label("����� �����ϴ� ��ȭ��?",Label.CENTER);
		la1.setBackground(Color.gray);
		la1.setFont(font);
		Choice cho1 = new Choice();
		cho1.setFont(font);
		cho1.setForeground(Color.white);
		cho1.setBackground(Color.BLUE);
		cho1.addItem("ȣ��");
		cho1.addItem("���");
		cho1.addItem("�׼�");
		cho1.addItem("�ڸ޵�");
		p1.add(la1);
		p1.add(cho1);
		
		my.add(p1);
	}

}
