package com.tcp.multi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MultiServer{
	ArrayList<Socket> list;
	
	class SockThread extends Thread {
		Socket sock;
		public SockThread(Socket sock) {
			this.sock = sock;
		}
		
		@Override
		public void run() {
			try {
				InputStream is = sock.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);
				while(true){
					String msg = br.readLine();
					if(msg.equals("exit"))break;
					for(int i=0; i<list.size(); i++){
						OutputStream os =list.get(i).getOutputStream();
						OutputStreamWriter osw = new OutputStreamWriter(os);
						BufferedWriter bw = new BufferedWriter(osw);
						PrintWriter pw = new PrintWriter(bw,true);
						pw.println(">>"+msg);
						System.out.println(msg);
					}
				}
			} catch (IOException e) {
			} finally {
				try {
					sock.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public MultiServer() {
		ServerSocket serv = null;
		try {
			serv = new ServerSocket(5050);
			list = new ArrayList<Socket>();
			while(true){
				Socket sock = serv.accept();
				list.add(sock);
				SockThread thr = new SockThread(sock);
				thr.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				serv.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("server end...");
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("server start...");
		new MultiServer();
	}
}
