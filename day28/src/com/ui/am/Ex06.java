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
		
		Label la1 = new Label("�����ϴ� ��ȭ��?");
		CheckboxGroup grp1 = new CheckboxGroup();
		Checkbox ch1 = new Checkbox("�׼�",grp1,false);
		Checkbox ch2 = new Checkbox("���",grp1,true);
		Checkbox ch3 = new Checkbox("ȣ��",grp1,false);
		
//		ch1.setLabel("�׼�");
//		ch2.setLabel("���");
//		ch3.setLabel("ȣ��");
		
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
