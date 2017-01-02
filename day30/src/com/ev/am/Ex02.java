package com.ev.am;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex02{
	
	public static void main(String[] args) {
		Frame f = new Frame("����ʹޱ�");
		
		WindowAdapter winAp = new WindowAdapter() { // 0x0000 ~ 0xffff
			public void windowClosing(WindowEvent e) {
				System.out.println("�ݱ�");
			}
		};
		f.addWindowListener(winAp);
		Panel p1 = new Panel();
		Button btn1 = new Button("BUTTON1");
		Button btn2 = new Button("BUTTON2");
		Button btn3 = new Button("EXIT");
		MouseAdapter mouse1 = new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println("��ư1 ����");
			}
		};
		MouseAdapter mouse2 = new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println("��ư2 ����");
			}
		};
		btn1.addMouseListener(mouse2);
		btn2.addMouseListener(mouse2);
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		
		p1.add(btn1);
		p1.add(btn2);
		p1.add(btn3);
		
		f.add(p1);
		f.setBounds(1800, 200, 300, 400);
		f.setVisible(true);
	}
}















