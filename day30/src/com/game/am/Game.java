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
	// 맞추면 +1
	// 틀리면 -1, 시간0.1초씩 빠르게 
	// 게임 시간은 30초..
	// 게임이 끝나면 최고점...
	JButton ebtn1, ebtn2;
	JButton[] btns;
	JPanel pMain, center;
	Label lTime,lcnt;
	Thread view;
	int sum=0;

	public Game() {
		setTitle("게임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pMain = new JPanel(new BorderLayout());
		center = new JPanel(new GridLayout(4, 4));
		Panel east = new Panel(new GridLayout(2, 1));
		Panel north = new Panel();
		lTime = new Label("1분동안 진행되는 게임");
		lTime.setSize(150, 40);
		north.add(lTime);
		Panel south = new Panel();
		lcnt = new Label("점수");
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
					System.out.println("사과");
					sum-=2;
					lcnt.setText("점수:"+sum+"점");
					lcnt.setSize(150, 40);
				}
			};
			if (i / 4 == 0) {
				img = new ImageIcon("./good1.jpg");
				btns[i].addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						
						System.out.println("사과");
						lcnt.setText("점수:"+(++sum)+"점");
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
		for (int i = 0; i < 16; i++) { // 버튼 재배치
			center.add(btns[i], i);
		}
		if (!center.isValid()) { // 컴포넌트의 레이아웃 갱신 요청
			System.out.println("재확인");
			center.revalidate();
			center.repaint();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(ebtn1)) {
			btnEn(true);
			sum=0;
			lcnt.setText("점수:"+(sum)+"점");
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
			lTime.setText(10 - i / 2 + "초");
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
