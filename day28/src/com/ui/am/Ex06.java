package com.ui.am;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class Ex06 {

	public static void main(String[] args) {
		Frame f = new Frame("checkbox");
		Panel p1 = new Panel();
		
		Label la1 = new Label("좋아하는 영화는?");
		CheckboxGroup grp1 = new CheckboxGroup();
		Checkbox ch1 = new Checkbox("액션",grp1,false);
		Checkbox ch2 = new Checkbox("드라마",grp1,true);
		Checkbox ch3 = new Checkbox("호러",grp1,false);
		
//		ch1.setLabel("액션");
//		ch2.setLabel("드라마");
//		ch3.setLabel("호러");
		
		p1.add(la1);
		p1.add(ch1);
		p1.add(ch2);
		p1.add(ch3);
		
		f.add(p1);
		f.setBounds(1800, 300, 500, 400);
		f.setVisible(true);
		System.out.println(ch2.getLabel());
		System.out.println(ch2.getState());
	}

}
