package com.ui.am;

import java.awt.List;
import java.awt.Panel;

public class Ex08 {

	public static void main(String[] args) {
		MyFrame my = new MyFrame("list");
		Panel p1 = new Panel();
		
		List list = new List(5,true);
		
		list.add("드라마");
		list.add("코믹");
		list.add("호러");
		list.add("에로");
		list.add("애니");
		list.add("막장");
		list.add("삼류");
		list.add("등등등");
		list.select(6);
		p1.add(list);
		
		my.add(p1);
	}

}
