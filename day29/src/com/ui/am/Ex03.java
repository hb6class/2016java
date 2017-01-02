package com.ui.am;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class Ex03 extends Frame {

	public Ex03() {
		setTitle("로그인창");
		Panel p1 = new Panel(new BorderLayout());
		Panel pCenter = new Panel(new BorderLayout());
		Panel cen1 = new Panel(new GridLayout(2,1));
		Panel cen2 = new Panel(new GridLayout(2,1));
		Panel p2 = new Panel(new GridLayout(1,2));
		p1.setLayout(new GridLayout(3,1));
		Label top = new Label("회원가입페이지");
		p1.add(top);
		cen1.add(new Label("id"));
		cen1.add(new Label("pw"));
		cen2.add(new TextField());
		cen2.add(new TextField());
		
		pCenter.add(cen1,BorderLayout.WEST);
		pCenter.add(cen2,BorderLayout.CENTER);
		p1.add(pCenter);
		p2.add(new Button("로그인"));
		p2.add(new Button("회원가입"));
		p1.add(p2);
		
		add(p1,BorderLayout.CENTER);
		setBounds(1800, 200, 300, 400);
		setVisible(true);
	}
	public static void main(String[] args) {
		//
		new Ex03();
	}

}
