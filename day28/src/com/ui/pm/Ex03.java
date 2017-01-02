package com.ui.pm;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Panel;

public class Ex03 {

	public static void main(String[] args) {
		MyFrame my = new MyFrame();
		my.setTitle("grid");
		Panel p1 = new Panel();
		GridLayout gl = new GridLayout(3,5);
		p1.setLayout(gl);
		Button btn1 = new Button("btn1");
		Button btn2 = new Button("btn2");
		Button btn3 = new Button("btn3");
		Button btn4 = new Button("btn4");
		Button btn5 = new Button("btn5");
//		Button btn6 = new Button("btn6");
		p1.add(btn1);
		p1.add(btn2);
		p1.add(btn3);
		p1.add(btn4);
		p1.add(btn5);
//		p1.add(btn6);
		my.add(p1);

	}

}
