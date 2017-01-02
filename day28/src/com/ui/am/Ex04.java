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
		Button btn1 = new Button("버튼1");
		pan1.add(btn1);
		Button btn2 = new Button("버튼2");
		pan1.add(btn2);
		pan1.setBackground(Color.BLACK);
		
		me.add(pan1);
		me.setLocation(1800, 300);
		me.setSize(500, 300);
				
		me.setVisible(true);
		
		Dialog dia = new Dialog(me,"화면정상출력");
		dia.setSize(250, 80);
		dia.setVisible(true);
		Panel pan2 = new Panel();
		Label label = new Label("확인하시겠습니까?");
		pan2.add(label);
		pan2.add(new Button("확인"));
		Button btn4 = new Button("취소");
//		btn4.disable();
		btn4.setEnabled(false);
		pan2.add(btn4);
		dia.add(pan2);
	}

}
