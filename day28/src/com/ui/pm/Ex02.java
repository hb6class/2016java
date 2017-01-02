package com.ui.pm;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Panel;

public class Ex02 {

	
	public static void main(String[] args) {
		MyFrame my = new MyFrame();
		my.setTitle("배치관리자");
		Panel p1 = new Panel();
		Panel p2 = new Panel();
		p2.setBackground(Color.red);
		Panel p3 = new Panel();
		BorderLayout flow = new BorderLayout();
		p1.setLayout(flow);
	
		Button btn1 = new Button("btn1");
		Button btn2 = new Button("btn2");
		Button btn3 = new Button("btn3");
		Button btn4 = new Button("btn4");
		Button btn5 = new Button("btn5");
//		p1.add("East",btn1);
		p1.add(btn1, BorderLayout.EAST);
		p2.add(btn2);
		p3.add(btn3);
		p3.add(btn5);
		p1.add("West",p2);
//		p1.add("South",btn3);
		p1.add("North",btn4);
		p1.add("Center",p3);
		my.add(p1);
	}

}
