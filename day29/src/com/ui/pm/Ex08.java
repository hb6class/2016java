package com.ui.pm;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
// p448~p475
public class Ex08 extends Frame implements ItemListener {
	Checkbox chck1,chck2,chck3,chck4;
	public Ex08() {
		Panel p1 = new Panel();
		
		CheckboxGroup chg= new CheckboxGroup();
		chck1= new Checkbox("item1",chg,true);
		chck2= new Checkbox("item2",chg,false);
		chck3= new Checkbox("item3",chg,false);
		chck4= new Checkbox("item4",chg,false);
		chck1.addItemListener(this);
		chck2.addItemListener(this);
		chck3.addItemListener(this);
		chck4.addItemListener(this);
		p1.add(chck1);
		p1.add(chck2);
		p1.add(chck3);
		p1.add(chck4);
		add(p1);
		setBounds(1800, 200, 300, 400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex08();

	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		System.out.println("--------------------------");
		System.out.println("item1:"+chck1.getState());
		System.out.println("item2:"+chck2.getState());
		System.out.println("item3:"+chck3.getState());
		System.out.println("item4:"+chck4.getState());
		System.out.println("--------------------------");
	}

}
