package com.ui.am;

import java.awt.Color;
import java.awt.Frame;

import javax.swing.JFrame;

public class Ex01 extends Frame {
	public Ex01() {
	}
	public Ex01(String title) {
		super(title);
		setSize(500,300);
		setLocation(1800, 400);
		setBackground(Color.red);
		boolean view = true;
		setVisible(view);
	}

	public static void main(String[] args) {
		//
		Ex01 me = new Ex01("생성자 사용");
//		me.setTitle("환영합니다");
//		me.setSize(500,300);
//		me.setLocation(1800, 400);
//		boolean view = true;
//		for(int i=0; i<10; i++){
//			view=!(view);
//			me.setVisible(view);
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
	}

}
