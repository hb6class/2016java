package com.ui.am;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

public class Ex01 extends Frame{

	public Ex01() {
		super("계산기");
		Panel p1 = new Panel();
		TextField tf = new TextField();
		Font font = new Font("견고딕", Font.BOLD, 32);
		tf.setFont(font);
//		tf.setEditable(false);
//		tf.enable(false);
		tf.setText("입력내용");
		Panel p2 = new Panel();
		
		p2.setLayout(new GridLayout(4,3));
		String[] nums = {"7","8","9","4","5","6","1","2","3","-","0","+"};
//		for(int i=0; i<nums.length; i++){
//			p2.add(new Button(nums[i]));
//		}
		Button[] btns = new Button[nums.length];
//		for(int i=0; i<btns.length; i++){
//			btns[i]=new Button(nums[i]);
//			p2.add(btns[i]);
//		}
		int i=0;
		while(true){
			if(!(i<btns.length))break;
			btns[i]=new Button(nums[i]);
			p2.add(btns[i]);
			i++;
		}
//		for(Button btn : btns){
//			p2.add(btn);
//		}
		
//		p2.add(new Button("7"));
//		p2.add(new Button("8"));
//		p2.add(new Button("9"));
//		p2.add(new Button("4"));
//		p2.add(new Button("5"));
//		p2.add(new Button("6"));
//		p2.add(new Button("1"));
//		p2.add(new Button("2"));
//		p2.add(new Button("3"));
//		p2.add(new Button("-"));
//		p2.add(new Button("0"));
//		p2.add(new Button("+"));
//		
		
		p1.setLayout(new BorderLayout());
		p1.add(tf, BorderLayout.NORTH);
		p1.add(p2, BorderLayout.CENTER);
		
		add(p1);
		this.setBounds(1800,200,300,500);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex01();

	}

}
