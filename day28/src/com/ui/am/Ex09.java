package com.ui.am;

import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class Ex09 {

	public static void main(String[] args) {
		MyFrame my = new MyFrame("�Խ���");
		Panel p1 = new Panel();
		
		Label la1 = new Label();
		la1.setText("������ �ۼ��ϼ���");
		Label la2 = new Label();
		la2.setText("������ �ۼ��ϼ���");
		
		TextField tf1 = new TextField("�����ۼ���",45);
		p1.add(la1);
		p1.add(tf1);
		
		TextArea ta1 = new TextArea("aaaaa",5,10,TextArea.SCROLLBARS_NONE);
		
		p1.add(la2);
		p1.add(ta1);
		
		my.add(p1);
	}

}











