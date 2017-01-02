package com.ui.pm;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex04 extends Frame implements ActionListener  {
	Button btn1,btn2;
	TextField tf;
	public Ex04() {
		Panel p1 = new Panel();
		tf = new TextField("입력하세요");
		tf.addActionListener(this);
		btn1 = new Button("BTN1");
		btn2 = new Button("BTN2");
		btn1.addActionListener(this);
//		btn2.addActionListener(this);
		p1.add(tf);
		p1.add(btn1);
		p1.add(btn2);
		add(p1);
		setBounds(1800, 200, 300, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex04();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(btn1)){
//			System.out.println("버튼1 액션 실행");
			System.out.println(">"+tf.getText());
		}else if(e.getSource().equals(btn2)){
			System.out.println("버튼2 액션 실행");
		}else if(e.getSource().equals(tf)){
			System.out.println(">>>"+tf.getText());
		}
	}

}
