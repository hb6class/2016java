package com.ui.pm;

import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;

class MyFrame extends Frame{
	public MyFrame() {
		setTitle("menu");
		setBounds(1800, 300, 500, 300);
		setVisible(true);
	}
}

public class Ex01 {

	public static void main(String[] args) {
		MyFrame my = new MyFrame();
		MenuBar var = new MenuBar();
		Menu mn1 = new Menu();
		Menu mn2 = new Menu();
		Menu mn3 = new Menu();

		mn1.setLabel("File");
		mn2.setLabel("Edit");
		mn3.setLabel("Help");
		
		MenuItem mn1_1 = new MenuItem();
		MenuItem mn1_2 = new MenuItem();
		MenuItem mn1_3 = new MenuItem();
		MenuItem mn2_1 = new MenuItem();
		
		CheckboxMenuItem mn2_2 = new CheckboxMenuItem();
		CheckboxMenuItem mn2_3 = new CheckboxMenuItem("Zoom Out",true);
		MenuItem mn3_1 = new MenuItem();
		mn1_1.setLabel("New");
		mn1_2.setLabel("Open");
		mn1_3.setLabel("Exit");
		mn2_1.setLabel("Undo");
		mn2_2.setLabel("Zoom In");
		mn2_2.setState(true);
//		mn2_3.setLabel("Zoom Out");
		mn3_1.setLabel("About");
		
		mn1.add(mn1_1);
		mn1.add(mn1_2);
		mn1.addSeparator();
		mn1.add(mn1_3);
		
		mn2.add(mn2_1);
		mn2.addSeparator();
		mn2.add(mn2_2);
		mn2.add(mn2_3);
		
		mn3.add(mn3_1);

		var.add(mn1);
		var.add(mn2);
		var.add(mn3);
		
		my.setMenuBar(var);
		TextArea ta = new TextArea();
		my.add(ta);
	}

}















