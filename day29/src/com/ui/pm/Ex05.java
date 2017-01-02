package com.ui.pm;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ex05 extends Frame implements MouseListener {
	Button btn1, btn2;
	TextField tf;
	
	public Ex05() {
		Panel p1 = new Panel();
		
		tf= new TextField("아이디를 입력하세요",30);
		btn1 = new Button("전송");
		btn2 = new Button("취소");
		btn1.addMouseListener(this);
//		btn2.addMouseListener(this);
		tf.addMouseListener(this);
		p1.add(tf);
		p1.add(btn1);
		p1.add(btn2);
		add(p1);
		setBounds(1800, 200, 300, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex05();
	}
	public void mouseClicked(MouseEvent e) {
		System.out.println("클릭시");
		if(e.getSource().equals(tf))tf.setText("");
		if(e.getSource().equals(btn1))System.out.println(tf.getText());
	}
	public void mousePressed(MouseEvent e) {System.out.println("누를때");}
	public void mouseReleased(MouseEvent e) {System.out.println("땔때");}
	public void mouseEntered(MouseEvent e) {System.out.println("마우스 올라갔을때");}
	public void mouseExited(MouseEvent e) {System.out.println("마우스가 빠져나갈때");}

}
