package com.ui.am;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Panel;
import java.awt.TextField;

public class Ex02 extends Frame{
	
	public Ex02() {
		String[] nums = {"7","8","9","4","5","6","1","2","3","+","-","0",".","*"};
		Panel p1 = new Panel(new BorderLayout());
		TextField tf = new TextField();
		Panel p2 = new Panel();
		p2.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		
		Button[] btns = new Button[nums.length];
		for(int i=0; i<btns.length; i++){
			btns[i]=new Button(nums[i]);
		}
		int i=0;
		for(i=0; i<9; i++){
			gbcSet(p2,gbc, btns[i],i%3,i/3,1,1,1.0,1.0);
//			gbc.gridx=i%3;		gbc.gridy=i/3;
//			gbc.gridwidth=1;	gbc.gridheight=1;
//			gbc.weightx=1.0;	gbc.weighty=1.0;
//			p2.add(btns[i],gbc);
		}
		///"+"/////
		gbcSet(p2,gbc, btns[i++],3,0,1,2,1.0,2.0);
//		gbc.gridx=3;		gbc.gridy=0;
//		gbc.gridwidth=1;	gbc.gridheight=2;
//		gbc.weightx=1.0;	gbc.weighty=2.0;
//		p2.add(btns[i],gbc);
//		i++;///"-"///
		gbcSet(p2,gbc, btns[i++],3,2,1,1,1.0,1.0);
//		gbc.gridx=3;		gbc.gridy=2;
//		gbc.gridwidth=1;	gbc.gridheight=1;
//		gbc.weightx=1.0;	gbc.weighty=1.0;
//		p2.add(btns[i],gbc);
//		i++;///"0"///
		gbcSet(p2,gbc, btns[i++],0,3,2,1,2.0,1.0);
//		gbc.gridx=0;		gbc.gridy=3;
//		gbc.gridwidth=2;	gbc.gridheight=1;
//		gbc.weightx=2.0;	gbc.weighty=1.0;
//		p2.add(btns[i],gbc);
//		i++;///"."///
		gbcSet(p2,gbc, btns[i++],2,3,1,1,1.0,1.0);
//		gbc.gridx=2;		gbc.gridy=3;
//		gbc.gridwidth=1;	gbc.gridheight=1;
//		gbc.weightx=1.0;	gbc.weighty=1.0;
//		p2.add(btns[i],gbc);
//		i++;///"*"///
		gbcSet(p2,gbc, btns[i],3,3,1,1,1.0,1.0);
//		gbc.gridx=3;		gbc.gridy=3;
//		gbc.gridwidth=1;	gbc.gridheight=1;
//		gbc.weightx=1.0;	gbc.weighty=1.0;
//		p2.add(btns[i],gbc);
		p1.add(tf, BorderLayout.NORTH);
		p1.add(p2, BorderLayout.CENTER);
		add(p1);
		this.setBounds(1800,200,400,600);
		this.setVisible(true);
	}
	
	public void gbcSet(Panel p, GridBagConstraints gbc, Button btn 
			,int a, int b, int c, int d, double e, double g){
		gbc.gridx=a;		gbc.gridy=b;
		gbc.gridwidth=c;	gbc.gridheight=d;
		gbc.weightx=e;		gbc.weighty=g;
		p.add(btn,gbc);
	}

	public static void main(String[] args) {
		// 
		new Ex02();
	}

}
