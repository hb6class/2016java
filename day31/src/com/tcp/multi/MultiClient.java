package com.tcp.multi;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class MultiClient extends Frame implements ActionListener, Runnable{
	Socket sock;
	TextArea ta;
	TextField tf;
	public MultiClient() {
		Panel p1 = new Panel(new BorderLayout());
		ta = new TextArea();
		tf = new TextField();
		tf.addActionListener(this);
		p1.add(ta, BorderLayout.CENTER);
		p1.add(tf, BorderLayout.SOUTH);
		add(p1);
		setBounds(1800, 200, 300, 400);
		setVisible(true);
		
		try{
			sock = new Socket("203.236.209.193",5050);
			Thread thr = new Thread(this);
			thr.start();
		}catch(Exception e){
		}
	}

	public static void main(String[] args) {
		new MultiClient();
	}

	@Override
	public void run() {
		try{
		InputStream is = sock.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String readmsg= "";
		while((readmsg= br.readLine())!=null){
			ta.append(readmsg);
			ta.append("\n");
		}
		}catch (Exception e){
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String msg = tf.getText();
		OutputStream os;
		try {
			os = sock.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);
			PrintWriter pw = new PrintWriter(bw,true);
			pw.println(msg);
			tf.setText("");
			tf.setFocusable(true);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
