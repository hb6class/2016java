package com.ui.am;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

public class Ex05 {

	public static void main(String[] args) {
		Frame f = new Frame("â�̸�");
		Panel p1 = new Panel();
		
		Button btn1 = new Button("��ư1");
		Button btn2 = new Button("��ư2");
		btn2.setEnabled(false);
		p1.add(btn1);
		p1.add(btn2);
		
		f.add(p1);
		f.setBounds(1800, 300, 500, 200);
		f.setVisible(true);

	}

}
