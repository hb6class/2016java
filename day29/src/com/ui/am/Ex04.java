package com.ui.am;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.Toolkit;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Ex04 extends Frame{
	
	public Ex04() {
		setTitle("�α���â");
		Panel p1 = new Panel(new BorderLayout());
		Panel center = new Panel(new GridLayout(5,1));
		Panel south = new Panel();
		Panel west = new Panel(new GridLayout(5,1));
		
		center.add(new Panel());
		center.add(new TextField());
		center.add(new Panel());
		center.add(new TextField());
		center.add(new Panel());
		
		west.add(new Panel());
		west.add(new Label("id"));
		west.add(new Panel());
		west.add(new Label("pw"));
		west.add(new Panel());
		
		JButton btn1 = new JButton("�α���");
		JButton btn2 = new JButton();
		ImageIcon icon = new ImageIcon("./button.png");
		btn2.setIcon(icon);
		btn2.setBorderPainted(false); //��ư �ܰ��� �Ⱥ��̰�
		btn2.setContentAreaFilled(false); // ��ư ����� ä���� ����
		btn2.setFocusPainted(false); // ��Ŀ�� �ܰ��� x
		south.add(btn1);
		south.add(btn2);
		
		p1.add(center,BorderLayout.CENTER);
		p1.add(new Label("�α���â�Դϴ�"), BorderLayout.NORTH);
		p1.add(south,BorderLayout.SOUTH);
		p1.add(west,BorderLayout.WEST);
		add(p1);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		setSize(300,400);
		setLocation((int)screen.getWidth()/2-getWidth()/2
				, (int)screen.getHeight()/2-getHeight()/2);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex04();
	}

}








