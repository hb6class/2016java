package com.game.am;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game extends JFrame implements ActionListener, Runnable {
	// ���߸� +1
	// Ʋ���� -1, �ð�0.1�ʾ� ������ 
	// ���� �ð��� 30��..
	// ������ ������ �ְ���...
	JButton ebtn1, ebtn2;
	JButton[] btns;
	JPanel pMain, center;
	Label lTime,lcnt;
	Thread view;
	int sum=0;

	public Game() {
		setTitle("����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pMain = new JPanel(new BorderLayout());
		center = new JPanel(new GridLayout(4, 4));
		Panel east = new Panel(new GridLayout(2, 1));
		Panel north = new Panel();
		lTime = new Label("1�е��� ����Ǵ� ����");
		lTime.setSize(150, 40);
		north.add(lTime);
		Panel south = new Panel();
		lcnt = new Label("����");
		lcnt.setSize(150, 40);
		south.add(lcnt);

		ebtn1 = new JButton("start");
		ebtn2 = new JButton("stop");

		ebtn1.addActionListener(this);
		ebtn2.addActionListener(this);
		ebtn2.setEnabled(false);
		east.add(ebtn1);
		east.add(ebtn2);

		btns = new JButton[16];
		for (int i = 0; i < btns.length; i++) {
			btns[i] = new JButton();
		}

		for (int i = 0; i < btns.length; i++) {
			ImageIcon img = null;
			ActionListener cha = new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("���");
					sum-=2;
					lcnt.setText("����:"+sum+"��");
					lcnt.setSize(150, 40);
				}
			};
			if (i / 4 == 0) {
				img = new ImageIcon("./good1.jpg");
				btns[i].addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						
						System.out.println("���");
						lcnt.setText("����:"+(++sum)+"��");
					}
				});
			} else if (i / 4 == 1) {
				img = new ImageIcon("./good2.jpg");
				btns[i].addActionListener(cha);
			} else if (i / 4 == 2) {
				img = new ImageIcon("./good3.jpg");
				btns[i].addActionListener(cha);
			} else {
				img = new ImageIcon("./good4.jpg");
				btns[i].addActionListener(cha);
			}
			btns[i].setIcon(img);
		}

		for (int i = 0; i < 100; i++) {
			JButton temp = btns[0];
			int ran = (int) (Math.random() * 15) + 1;
			btns[0] = btns[ran];
			btns[ran] = temp;
		}

		for (int i = 0; i < btns.length; i++) {
			center.add(btns[i]);
		}
		pMain.add(center, BorderLayout.CENTER);
		pMain.add(east, BorderLayout.EAST);
		pMain.add(north, BorderLayout.NORTH);
		pMain.add(south, BorderLayout.SOUTH);
		add(pMain);
		setBounds(1800, 200, 700, 500);
		setVisible(true);
		btnEn(false);

	}

	public static void main(String[] args) {
		new Game();

	}

	public void imgChange() {
		for (int i = 0; i < 100; i++) {
			JButton temp = btns[0];
			int ran = (int) (Math.random() * 15) + 1;
			btns[0] = btns[ran];
			btns[ran] = temp;
		}
		for (int i = 0; i < 16; i++) { // ��ư ���ġ
			center.add(btns[i], i);
		}
		if (!center.isValid()) { // ������Ʈ�� ���̾ƿ� ���� ��û
			System.out.println("��Ȯ��");
			center.revalidate();
			center.repaint();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(ebtn1)) {
			btnEn(true);
			sum=0;
			lcnt.setText("����:"+(sum)+"��");
			ebtn1.setEnabled(false);
			view = new Thread(this);
			view.start();
			ebtn2.setEnabled(true);
		} else if (e.getSource().equals(ebtn2)) {
			view.stop();
			ebtn2.setEnabled(false);
			ebtn1.setEnabled(true);
		}
	}
	
	public void btnEn(boolean result){
		for(int i=0; i<btns.length; i++){
			btns[i].setEnabled(result);
		}
	}

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			imgChange();
			lTime.setText(10 - i / 2 + "��");
			lTime.setSize(150, 40);
			try {
				Thread.sleep(500);
			} catch (InterruptedException ex) {
			}
		}
		lTime.setText("GAMEOVER");
		btnEn(false);
		lTime.setSize(150, 40);
		ebtn1.setEnabled(true);
	}

}
