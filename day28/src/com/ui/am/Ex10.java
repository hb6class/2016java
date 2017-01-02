package com.ui.am;

import java.awt.Scrollbar;

public class Ex10 {

	public static void main(String[] args) {
		MyFrame my = new MyFrame("½ºÅ©·Ñ");
		
		Scrollbar scr1 = new Scrollbar(Scrollbar.VERTICAL);
		Scrollbar scr2 = new Scrollbar(Scrollbar.HORIZONTAL);
		
		my.add("East",scr1);
		my.add("South",scr2);
		
		
	}

}
