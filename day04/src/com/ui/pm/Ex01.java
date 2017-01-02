package com.ui.pm;

import java.awt.Button;
import java.awt.Canvas;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;

public class Ex01 extends Frame {

	public Ex01() {
		add(new Button("aaa"));
		setBounds(0, 0, 500, 500);
		setVisible(true);
	}
	@Override
	public void paint(Graphics g) {
		Image img=Toolkit.getDefaultToolkit().getImage("./Desert.jpg");
		g.drawImage(img, 0, 0, 500, 500, 0, 0, 1024, 768, this);
	}
	public static void main(String[] args) {
		File f = new File("./Desert.jpg");
		System.out.println(f.exists());
		Ex01 me = new Ex01();
	}

}
