package com.ui.pm;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex03 implements WindowListener {
	Frame f;
	public Ex03() {
		f = new Frame("이벤트");
		f.addWindowListener(this);
		f.setBounds(1800, 200, 300, 400);
		f.setVisible(true);		
	}
	public static void main(String[] args) {
		System.out.println("시작");
		new Ex03();
	}
	public void windowOpened(WindowEvent e) {System.out.println("오픈");}
	public void windowClosing(WindowEvent e) {System.out.println("닫기Closing");f.dispose();}
	public void windowClosed(WindowEvent e) {System.out.println("닫기Closed");}
	public void windowIconified(WindowEvent e) {System.out.println("최소화");}
	public void windowDeiconified(WindowEvent e) {System.out.println("최소화해제");}
	public void windowActivated(WindowEvent e) {System.out.println("활성화");}
	public void windowDeactivated(WindowEvent e) {System.out.println("비활성화");}
}
