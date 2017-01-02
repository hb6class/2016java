package com.ui.pm;

import java.awt.Button;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Panel;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class Ex04 {

	public static void main(String[] args) {
		MyFrame my = new MyFrame();
		my.setTitle("GridBagLayout");
		Panel p1 = new Panel();
		GridBagLayout gl = new GridBagLayout();
		p1.setLayout(gl);
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		GridBagConstraints gbc2 = new GridBagConstraints();
		gbc2.fill = GridBagConstraints.BOTH;
		GridBagConstraints gbc3 = new GridBagConstraints();
		gbc3.fill = GridBagConstraints.BOTH;
		GridBagConstraints gbc4 = new GridBagConstraints();
		gbc4.fill = GridBagConstraints.BOTH;
		
		Button btn1 = new Button("btn1");
		Button btn2 = new Button("btn2");
		Button btn3 = new Button("btn3");
		Button btn4 = new Button("btn4");
		Button btn5 = new Button("btn5");
		
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.gridwidth=4;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc2.gridx=0;
		gbc2.gridy=1;
		gbc2.gridwidth=1;
		gbc2.gridheight=1;
		gbc2.weightx=1.0;
		gbc2.weighty=1.0;
		gbc3.gridx=1;
		gbc3.gridy=1;
		gbc3.gridwidth=1;
		gbc3.gridheight=1;
		gbc3.weightx=2.0;
		gbc3.weighty=1.0;
		gbc4.gridx=3;
		gbc4.gridy=1;
		gbc4.gridwidth=1;
		gbc4.gridheight=1;
		gbc4.weightx=1.0;
		gbc4.weighty=1.0;
		
		
		p1.add(btn1,gbc);
		p1.add(btn2,gbc2);
		p1.add(btn3,gbc3);
		p1.add(btn4,gbc4);
//		p1.add(btn5);
		my.add(p1);
	}

}
