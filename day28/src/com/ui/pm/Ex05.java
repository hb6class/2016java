package com.ui.pm;

import java.awt.CardLayout;
import java.awt.Label;
import java.awt.Panel;

public class Ex05 {

	public static void main(String[] args) throws InterruptedException {
		MyFrame my = new MyFrame();
		
		Panel p1 = new Panel();
		CardLayout cl = new CardLayout();
		p1.setLayout(cl);
		
		Panel p2 = new Panel();
		p2.add(new Label("첫 번 째 장"));
		Panel p3 = new Panel();
		p3.add(new Label("두 번 째 장"));
		Panel p4 = new Panel();
		p4.add(new Label("세 번 째 장"));
		
		p1.add("1",p2);
		p1.add("2",p3);
		p1.add("3",p4);
		
		my.add(p1);
		for(int i=0; i<100; i++){
			Thread.sleep(2000);
			cl.next(p1);
		}
	}

}
