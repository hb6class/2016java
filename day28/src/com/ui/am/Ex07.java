package com.ui.am;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.Panel;

public class Ex07 {

	public static void main(String[] args) {
		MyFrame my = new MyFrame("선택상자");
		Panel p1 = new Panel();
		
		my.setSize(800, 600);
		
		Font font = new Font("견고딕", Font.BOLD, 26);
		Label la1 = new Label("당신이 좋아하는 영화는?",Label.CENTER);
		la1.setBackground(Color.gray);
		la1.setFont(font);
		Choice cho1 = new Choice();
		cho1.setFont(font);
		cho1.setForeground(Color.white);
		cho1.setBackground(Color.BLUE);
		cho1.addItem("호러");
		cho1.addItem("드라마");
		cho1.addItem("액션");
		cho1.addItem("코메디");
		p1.add(la1);
		p1.add(cho1);
		
		my.add(p1);
	}

}
