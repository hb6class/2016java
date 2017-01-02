package com.ev.am;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

abstract class Win implements WindowListener {
	public void windowOpened(WindowEvent e) {
	}
	public void windowClosing(WindowEvent e) {
	}
	public void windowClosed(WindowEvent e) {
	}
	public void windowIconified(WindowEvent e) {
	}
	public void windowDeiconified(WindowEvent e) {
	}
	public void windowActivated(WindowEvent e) {
	}
	public void windowDeactivated(WindowEvent e) {
	}
}

public class Ex01 extends Frame{
	
	public Ex01() {
		Panel p1 = new Panel();
		addWindowListener(new Win(){});
//		Button btn = new Button();
//		btn.addActionListener(this);
		setBounds(1800, 200, 300, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex01 me = new Ex01();

	}

}
