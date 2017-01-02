package com.ui.am;

import java.awt.Button;
import java.awt.Frame;

public class Ex03 extends Frame {
	public Ex03() {
		Button btn1 = new Button();
		Button btn2 = new Button();
		btn1.setLabel("버튼1");
		btn2.setLabel("버튼2");
		add(btn1);
		add(btn2);
		setLocation(1800,300);
		setSize(500, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex03();
	}

}
