package com.ui.am;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class Ex04 extends Frame {

	public static void main(String[] args) {
		Ex04 me = new Ex04();
		
		Panel pan1 = new Panel();
		Button btn1 = new Button("��ư1");
		pan1.add(btn1);
		Button btn2 = new Button("��ư2");
		pan1.add(btn2);
		pan1.setBackground(Color.BLACK);
		
		me.add(pan1);
		me.setLocation(1800, 300);
		me.setSize(500, 300);
				
		me.setVisible(true);
		
		Dialog dia = new Dialog(me,"ȭ���������");
		dia.setSize(250, 80);
		dia.setVisible(true);
		Panel pan2 = new Panel();
		Label label = new Label("Ȯ���Ͻðڽ��ϱ�?");
		pan2.add(label);
		pan2.add(new Button("Ȯ��"));
		Button btn4 = new Button("���");
//		btn4.disable();
		btn4.setEnabled(false);
		pan2.add(btn4);
		dia.add(pan2);
	}

}
