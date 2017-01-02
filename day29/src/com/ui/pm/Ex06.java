package com.ui.pm;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Ex06 extends Frame implements MouseMotionListener {
	Panel p1;
	Button btn;
	public Ex06() {
		p1 = new Panel(null);
		btn = new Button();
//		btn.setBounds(50, 50, 150, 200);
		btn.setSize(50, 50);
		btn.addMouseMotionListener(this);
		p1.add(btn);
		p1.addMouseMotionListener(this);
		add(p1);
		setBounds(1800, 200, 300, 400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex06();
	}
	public void mouseDragged(MouseEvent e) {
//		System.out.println("드래그");
		if(e.getSource().equals(btn)){
			int x = btn.getX();
			int y = btn.getY();
			System.out.print(x+":");
			System.out.println(y);
		}
	}
	public void mouseMoved(MouseEvent e) {
//		System.out.println("마우스 움직임");
		if(e.getSource().equals(p1)){
			System.out.println("X:"+e.getX()+", Y:"+e.getY());
			btn.setLocation(e.getX(), e.getY());
		}
	}

}
