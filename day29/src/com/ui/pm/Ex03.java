package com.ui.pm;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex03 implements WindowListener {
	Frame f;
	public Ex03() {
		f = new Frame("�̺�Ʈ");
		f.addWindowListener(this);
		f.setBounds(1800, 200, 300, 400);
		f.setVisible(true);		
	}
	public static void main(String[] args) {
		System.out.println("����");
		new Ex03();
	}
	public void windowOpened(WindowEvent e) {System.out.println("����");}
	public void windowClosing(WindowEvent e) {System.out.println("�ݱ�Closing");f.dispose();}
	public void windowClosed(WindowEvent e) {System.out.println("�ݱ�Closed");}
	public void windowIconified(WindowEvent e) {System.out.println("�ּ�ȭ");}
	public void windowDeiconified(WindowEvent e) {System.out.println("�ּ�ȭ����");}
	public void windowActivated(WindowEvent e) {System.out.println("Ȱ��ȭ");}
	public void windowDeactivated(WindowEvent e) {System.out.println("��Ȱ��ȭ");}
}
