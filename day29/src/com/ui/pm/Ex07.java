package com.ui.pm;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ex07 extends Frame implements KeyListener {
	TextField tf;
	TextArea ta;
	public Ex07() {
		Panel p1 = new Panel(new GridLayout(2,1));
		tf = new TextField();
		ta = new TextArea();
		tf.addKeyListener(this);
//		ta.setEditable(false);
		ta.setEnabled(false);
		p1.add(tf);
		p1.add(ta);
		
		add(p1);
		setBounds(1800, 200, 300, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex07();
	}
	public void keyTyped(KeyEvent e) {
		if((int)e.getKeyChar()==10){
			System.out.println("제목:"+tf.getText());
			ta.requestFocus();
//			ta.setEditable(true);
			ta.setEnabled(true);
		}
	}
	public void keyPressed(KeyEvent e) {
//		System.out.println("키 눌릴때");
//		System.out.println(e.getKeyText(e.getKeyCode()));
//		System.out.println(">>>"+tf.getText());
	}
	public void keyReleased(KeyEvent e) {
//		System.out.println("키 땔때");
//		System.out.println(">>>"+tf.getText());
	}


}
