package com.ui.am;

import java.awt.List;
import java.awt.Panel;

public class Ex08 {

	public static void main(String[] args) {
		MyFrame my = new MyFrame("list");
		Panel p1 = new Panel();
		
		List list = new List(5,true);
		
		list.add("���");
		list.add("�ڹ�");
		list.add("ȣ��");
		list.add("����");
		list.add("�ִ�");
		list.add("����");
		list.add("���");
		list.add("����");
		list.select(6);
		p1.add(list);
		
		my.add(p1);
	}

}
